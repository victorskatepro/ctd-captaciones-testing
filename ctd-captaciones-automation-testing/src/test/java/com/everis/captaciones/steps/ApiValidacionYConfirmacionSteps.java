package com.everis.captaciones.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static io.restassured.RestAssured.given;


public class ApiValidacionYConfirmacionSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiValidacionYConfirmacionSteps.class);
    static private final String BASE_URL_VALIDACION = "https://api.uat.interbank.per/cudi/cts/v1/validcustomers";
    static private final String BASE_URL_CONFIRMACION = "https://api.uat.interbank.per/cudi/cts/v1/validcustomers";
    static private final String TEMPLATE_CONFIRMACION = "/request/CTS/ApiConfirmacionCts.json";

    static private final String TEMPLATE_ESCENARIO_01 = "/request/CTS/Escenario01.json";
    static private final String TEMPLATE_ESCENARIO_02 = "/request/CTS/Escenario02.json";
    static private final String TEMPLATE_ESCENARIO_03 = "/request/CTS/Escenario03.json";
    static private final String TEMPLATE_ESCENARIO_04 = "/request/CTS/Escenario04.json";
    static private final String TEMPLATE_ESCENARIO_05 = "/request/CTS/Escenario05.json";
    static private final String TEMPLATE_ESCENARIO_06 = "/request/CTS/Escenario06.json";
    static private final String TEMPLATE_ESCENARIO_07 = "/request/CTS/Escenario07.json";
    static private final String TEMPLATE_ESCENARIO_08 = "/request/CTS/Escenario08.json";
    static private final String TEMPLATE_ESCENARIO_09 = "/request/CTS/Escenario09.json";
    static private final String TEMPLATE_ESCENARIO_10 = "/request/CTS/Escenario10.json";
    static private final String TEMPLATE_ESCENARIO_11 = "/request/CTS/Escenario11.json";
    static private final String TEMPLATE_ESCENARIO_12 = "/request/CTS/Escenario12.json";
    static private final String TEMPLATE_ESCENARIO_13 = "/request/CTS/Escenario13.json";
    static private final String TEMPLATE_ESCENARIO_14 = "/request/CTS/Escenario14.json";

    static private final String TEMPLATE_ESCENARIO_15 = "/request/CTS/Escenario15.json";
    static private final String TEMPLATE_ESCENARIO_16 = "/request/CTS/Escenario16.json";
    static private final String TEMPLATE_ESCENARIO_17 = "/request/CTS/Escenario17.json";
    static private final String TEMPLATE_ESCENARIO_18 = "/request/CTS/Escenario18.json";
    static private final String TEMPLATE_ESCENARIO_19 = "/request/CTS/Escenario19.json";
    static private final String TEMPLATE_ESCENARIO_20 = "/request/CTS/Escenario21.json";
    static private final String TEMPLATE_ESCENARIO_21 = "/request/CTS/Escenario21.json";
    static private final String TEMPLATE_ESCENARIO_22 = "/request/CTS/Escenario22.json";
    static private final String TEMPLATE_ESCENARIO_23 = "/request/CTS/Escenario23.json";
    static private final String TEMPLATE_ESCENARIO_24 = "/request/CTS/Escenario24.json";
    static private final String TEMPLATE_ESCENARIO_25 = "/request/CTS/Escenario25.json";
    static private final String TEMPLATE_ESCENARIO_26 = "/request/CTS/Escenario26.json";
    static private final String TEMPLATE_ESCENARIO_27 = "/request/CTS/Escenario27.json";
    static private final String TEMPLATE_ESCENARIO_28 = "/request/CTS/Escenario28.json";

    static private final String TEMPLATE_ESCENARIO_29 = "/request/CTS/Escenario29.json";
    static private final String TEMPLATE_ESCENARIO_30 = "/request/CTS/Escenario30.json";
    static private final String TEMPLATE_ESCENARIO_31 = "/request/CTS/Escenario31.json";
    static private final String TEMPLATE_ESCENARIO_32 = "/request/CTS/Escenario32.json";
    static private final String TEMPLATE_ESCENARIO_33 = "/request/CTS/Escenario33.json";
    static private final String TEMPLATE_ESCENARIO_34 = "/request/CTS/Escenario34.json";
    static private final String TEMPLATE_ESCENARIO_35 = "/request/CTS/Escenario35.json";
    static private final String TEMPLATE_ESCENARIO_36 = "/request/CTS/Escenario36.json";
    static private final String TEMPLATE_ESCENARIO_37 = "/request/CTS/Escenario37.json";
    static private final String TEMPLATE_ESCENARIO_38 = "/request/CTS/Escenario38.json";
    static private final String TEMPLATE_ESCENARIO_39 = "/request/CTS/Escenario39.json";
    static private final String TEMPLATE_ESCENARIO_40 = "/request/CTS/Escenario40.json";
    static private final String TEMPLATE_ESCENARIO_41 = "/request/CTS/Escenario41.json";
    static private final String TEMPLATE_ESCENARIO_42 = "/request/CTS/Escenario42.json";

    public String bodyRequest;
    public Response res;


    public static String getTemplate(String templatePath) {
        try {
            return IOUtils.toString(new ClassPathResource(templatePath).getInputStream(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void Escenario01Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_01);
    }

    public void Escenario02Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_02);
    }

    public void Escenario03Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_03);
    }

    public void Escenario04Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_04);
    }

    public void Escenario05Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_05);
    }

    public void Escenario06Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_06);
    }

    public void Escenario07Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_07);
    }

    public void Escenario08Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_08);
    }


    public void Escenario09Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_09);
    }


    public void Escenario10Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_10);
    }


    public void Escenario11Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_11);
    }


    public void Escenario12Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_12);
    }


    public void Escenario13Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_13);
    }


    public void Escenario14Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_14);
    }

    public void Escenario15Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_15);
    }


    public void Escenario16Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_16);
    }


    public void Escenario17Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_17);
    }


    public void Escenario18Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_18);
    }


    public void Escenario19Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_19);
    }


    public void Escenario20Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_20);
    }


    public void Escenario21Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_21);
    }


    public void Escenario22Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_22);
    }


    public void Escenario23Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_23);
    }


    public void Escenario24Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_24);
    }


    public void Escenario25Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_25);
    }


    public void Escenario26Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_26);
    }


    public void Escenario27Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_27);
    }


    public void Escenario28Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_28);
    }

    public void Escenario29Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_29);
    }

    public void Escenario30Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_30);
    }

    public void Escenario31Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_31);
    }


    public void Escenario32Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_32);
    }


    public void Escenario33Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_33);
    }


    public void Escenario34Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_34);
    }


    public void Escenario35Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_35);
    }


    public void Escenario36Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_36);
    }

    public void Escenario37Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_37);
    }


    public void Escenario38Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_38);
    }

    public void Escenario39Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_39);
    }

    public void Escenario40Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_40);
    }

    public void Escenario41Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_41);
    }


    public void Escenario42Template() {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_ESCENARIO_42);
    }

    public void agregoLosEncabezamosEnLaPeticionDelApiDeValidacioncts() {

        res = given().log().all().

                header("Accept-Encoding", "gzip,deflate").
                header("Content-Type", "application/json").
                header("Connection", "Keep-Alive").
                header("Host", "api.uat.interbank.per").
                header("Ocp-Apim-Subscription-Key", "b18be3bcfa8e41f2ac4ef6d9406ef157").
                header("X-INT-Consumer-Id", "WEB").
                header("X-INT-Message-Id", "6656565265656").
                header("X-INT-Timestamp", "2021-01-27T17:56:35.657422").

                body(bodyRequest).
                when().
                post(BASE_URL_VALIDACION);

    }

    public void validoLaRespuestaObtenidadeValidacionCts() {
        res.then().statusCode(200);
    }

    public void validoLaRespuestaObtenidadeConfirmacionCts() {
        res.then().statusCode(200);
    }

    public String obtengoElCorrelationId() {
        LOGGER.info(res.getBody().path("correlationId"));
        return res.getBody().path("correlationId");

    }


    public void agregoLosEncabezamosEnLaPeticionDelApiDeConfirmacioncts() {

        res = given().log().all().

                        header("Accept-Encoding", "gzip,deflate").
                        header("Content-Type", "application/json").
                        header("Connection", "Keep-Alive").
                        header("Host", "api.uat.interbank.per").
                        header("Ocp-Apim-Subscription-Key", "b18be3bcfa8e41f2ac4ef6d9406ef157").
                        header("X-INT-Consumer-Id", "WEB").
                        header("X-INT-Message-Id", "6656565265656").
                        header("X-INT-Timestamp", "2021-01-27T17:56:35.657422").

                        body(bodyRequest).
                        when().
                        put(BASE_URL_CONFIRMACION);

    }

    public void seArmaElCuerpoDePeticiondeConfirmacionCts(String correlationId) {
        RestAssured.useRelaxedHTTPSValidation();
        bodyRequest = getTemplate(TEMPLATE_CONFIRMACION).replace("{correlation_Id}",correlationId).replace("{correoelectronico}","buendiaperez17@gmail.com");

    }



}



