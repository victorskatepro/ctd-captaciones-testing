package com.everis.captaciones.steps;

import com.everis.captaciones.models.CustomerData;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiTokenRuletaMillonariaSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiTokenRuletaMillonariaSteps.class);
    static private final String BASE_URL = "https://apis.uat.interbank.pe/awrm/api/security/authentication";
    static private final String TEMPLATE_JUEGO_RULETA = "/request/ApiTokenRuletaMillonaria.json";

    public String bodyRequest;
    public Response res;

    public static String getTemplate(String templatePath) {
        try {
            return IOUtils.toString(new ClassPathResource(templatePath).getInputStream(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void seArmaElCuerpoDePeticionApiTokenRuletaMillonaria(String codigoUnico, String numeroCuenta) {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_JUEGO_RULETA).replace("{codigounico}", codigoUnico).replace("{numerocuenta}", numeroCuenta);
    }


    public void agregoLosEncabezadosEnLaPeticion() {
        res = given().log().all().
                header("Accept-Encoding", "gzip,deflate").
                header("Content-Type", "application/json").
                header("Connection", "Keep-Alive").
                header("SOAPAction", "https://apis.uat.interbank.pe/awrm/api/security/authentication").
                header("Host", "apis.uat.interbank.pe").
                header("Ocp-Apim-Subscription-Key", "418f62ec0b614133989c3d6c705c4bf3").
                body(bodyRequest).
                when().
                post(BASE_URL);

    }

    public void validoLaRespuestaObtenida() {
        res.then().statusCode(200);
    }

    public String obtengoElTokenGenerado() {
        LOGGER.info(res.getBody().path("id"));
        return res.getBody().path("id");

    }

    public String generoPeticion(List<CustomerData> data) {
        for (CustomerData d : data) {
            seArmaElCuerpoDePeticionApiTokenRuletaMillonaria(d.getCodigo(), d.getCuenta());
            agregoLosEncabezadosEnLaPeticion();
            validoLaRespuestaObtenida();
        }
        return obtengoElTokenGenerado();
    }

}

