package com.everis.captaciones.stepDefinitions;

import com.everis.captaciones.models.CustomerData;
import com.everis.captaciones.steps.ApiTokenRuletaMillonariaSteps;
import com.everis.captaciones.steps.RuletaStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;


public class ApiTokenRuletaMillonariaSD {

    public String tokenGenerated;

    @Steps
    ApiTokenRuletaMillonariaSteps apiToken;

    @Steps
    RuletaStep ruletaStep;


    @Given("se arma el cuerpo con codigo_unico {string} numero_cuenta {string}")
    public void seArmaElCuerpoConCodigo_unicoNumero_cuenta(String codigounico, String numerocuenta) {
        apiToken.seArmaElCuerpoDePeticionApiTokenRuletaMillonaria(codigounico, numerocuenta);
    }

    @When("agrego los encabezados en la peticion")
    public void agregoLosEncabezadosEnLaPeticion() {
        apiToken.agregoLosEncabezadosEnLaPeticion();
    }

    @And("valido la respuesta obtenida")
    public void validoLaRespuestaObtenida() {
        apiToken.validoLaRespuestaObtenida();
    }

    @Then("obtengo el token generado")
    public void obtengoElTokenGenerado() {
        tokenGenerated = apiToken.obtengoElTokenGenerado();
    }


    @Given("el cliente inicia el juego de la ruleta millonaria")
    public void elClienteIniciaElJuegoDeLaRuletaMillonaria() {
        ruletaStep.open(tokenGenerated);

    }

    @When("le da click en el boton jugar de la ruleta")
    public void leDaClickEnElBotonJugarDeLaRuleta() throws Throwable {
        ruletaStep.ClickEnJugar();

    }

    @Then("le da click en boton entendido y finaliza el juego")
    public void leDaClickEnBotonEntendidoYFinalizaElJuego() throws InterruptedException {
        ruletaStep.ClickBotonEntendido();
    }

    @Given("^el cliente genera un token valido:$")
    public void elClienteGeneraUnTokenValido(DataTable data) {
        List<CustomerData> customerData = data.asList(CustomerData.class);
        tokenGenerated = apiToken.generoPeticion(customerData);
    }


    @Then("le da click en boton cerrar y finaliza el juego")
    public void leDaClickEnBotonCerrarYFinalizaElJuego() throws InterruptedException {
        ruletaStep.ClickBotonCerrar();
    }

    @When("le da click en el boton historico de premios")
    public void leDaClickEnElBotonHistoricoDePremios() throws InterruptedException {
        ruletaStep.ClickBotonHistoricodePremios();
    }

    @When("le da click en el boton detalle del premio")
    public void leDaClickEnElBotonDetalleDelPremio() throws InterruptedException {
        ruletaStep.ClickBotonDetallePremio();
    }

    @When("el cliente se encuentra cargado en el mes actual")
    public void elClienteSeEncuentraCargadoEnElMesActual() throws InterruptedException {
        ruletaStep.SelectClienteNoSeEncuentraMesActual();
    }

    @Then("el cliente finaliza el juego.")
    public void elClienteFinalizaElJuego() {

    }

    @When("el cliente no cuenta con giros")
    public void elClienteNoCuentaConGiros() throws InterruptedException {
        ruletaStep.SelectClienteNoCuentaConGiros();
    }

    @When("le da click en boton EnviarCorreoSinEditar")
    public void leDaClickEnBotonEnviarCorreoSinEditar() {
        
    }

    @Then("carga nuevamente la ruleta millonaria y finaliza el juego.")
    public void cargaNuevamenteLaRuletaMillonariaYFinalizaElJuego() {
    }

}
