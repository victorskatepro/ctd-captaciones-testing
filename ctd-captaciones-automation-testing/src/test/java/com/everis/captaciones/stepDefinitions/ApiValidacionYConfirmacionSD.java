package com.everis.captaciones.stepDefinitions;

import com.everis.captaciones.steps.ApiValidacionYConfirmacionSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ApiValidacionYConfirmacionSD {

    public String correlationId;

    @Steps
    ApiValidacionYConfirmacionSteps apivalidacionyconfirmacion;


    @When("agrego los encabezamos en la peticion del api de validacion")
    public void agregoLosEncabezamosEnLaPeticionDelApiDeValidacion() {
        apivalidacionyconfirmacion.agregoLosEncabezamosEnLaPeticionDelApiDeValidacioncts();
    }


    @Then("valido la respuesta obtenida del api de validacion")
    public void validoLaRespuestaObtenidaDelApiDeValidacion() {
        apivalidacionyconfirmacion.validoLaRespuestaObtenidadeValidacionCts();
    }

    @And("se obtiene el correlation Id del api de validacion")
    public void seObtieneElCorrelationIdDelApiDeValidacion() {
        correlationId = apivalidacionyconfirmacion.obtengoElCorrelationId();
    }

    @Then("Se arma el cuerpo del api de confirmacion")
    public void seArmaElCuerpoDelApiDeConfirmacion() {
        apivalidacionyconfirmacion.seArmaElCuerpoDePeticiondeConfirmacionCts(correlationId);
    }

    @And("agrego los encabezados en la peticion del api de confirmacion")
    public void agregoLosEncabezadosEnLaPeticionDelApiDeConfirmacion() {
        apivalidacionyconfirmacion.agregoLosEncabezamosEnLaPeticionDelApiDeConfirmacioncts();
    }

    @Then("valido la respuesta obtenida del api de confirmacion")
    public void validoLaRespuestaObtenidaDelApiDeConfirmacion() {
        apivalidacionyconfirmacion.validoLaRespuestaObtenidadeConfirmacionCts();
    }

    @Given("Se arma el cuerpo donde el tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoDondeElTipoDeProcesoDeclaracionYElTipoDeDocumentoRucConMonedaSolesRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario01Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoRucConMonedaDolaresRealizandoLaDeclaracionDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario02Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoRucConMonedaSolesRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario03Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoRucConMonedaDolaresRealizandoLaDeclaracionDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario04Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoRucConMonedaSolesRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario05Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoRucConMonedaDolaresRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario06Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda soles y dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoRucConMonedaSolesYDolaresRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario07Template();
    }

    @Given("Se arma el cuerpo donde el tipo de proceso declaracion y el tipo de documento dni con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoDondeElTipoDeProcesoDeclaracionYElTipoDeDocumentoDniConMonedaSolesRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario08Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoDniConMonedaDolaresRealizandoLaDeclaracionDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario09Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoDniConMonedaSolesRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario10Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoDniConMonedaDolaresRealizandoLaDeclaracionDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario11Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda soles, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoDniConMonedaSolesRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario12Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoDniConMonedaDolaresRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario13Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda soles y dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoDeclaracionYElTipoDeDocumentoDniConMonedaSolesYDolaresRealizandoLaDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario14Template();
    }

    @Given("Se arma el cuerpo donde el tipo de proceso pago y el tipo de documento ruc con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoDondeElTipoDeProcesoPagoYElTipoDeDocumentoRucConMonedaSolesRealizandoElPagoDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario15Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoRucConMonedaDolaresRealizandoElPagoDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario16Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoRucConMonedaSolesRealizandoElPagoDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario17Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoRucConMonedaDolaresRealizandoElPagoDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario18Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda soles, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoRucConMonedaSolesRealizandoElPagoDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario19Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoRucConMonedaDolaresRealizandoElPagoDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario20Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda soles y dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoRucConMonedaSolesYDolaresRealizandoElPagoDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario21Template();
    }

    @Given("Se arma el cuerpo donde el tipo de proceso pago y el tipo de documento dni con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoDondeElTipoDeProcesoPagoYElTipoDeDocumentoDniConMonedaSolesRealizandoElPagoDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario22Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoDniConMonedaDolaresRealizandoElPagoDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario23Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoDniConMonedaSolesRealizandoElPagoDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario24Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoDniConMonedaDolaresRealizandoElPagoDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario25Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda soles, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoDniConMonedaSolesRealizandoElPagoDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario26Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoDniConMonedaDolaresRealizandoElPagoDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario27Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda soles y dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYElTipoDeDocumentoDniConMonedaSolesYDolaresRealizandoElPagoDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario28Template();
    }

    @Given("Se arma el cuerpo donde el tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoDondeElTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoRucConMonedaSolesRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario29Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoRucConMonedaDolaresRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario30Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoRucConMonedaSolesRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario31Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoRucConMonedaDolaresRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario32Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoRucConMonedaSolesRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario33Template();
    }


    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoRucConMonedaDolaresRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario34Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles y dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoRucConMonedaSolesYDolaresRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario35Template();
    }

    @Given("Se arma el cuerpo donde el tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoDondeElTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoDniConMonedaSolesRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario36Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoDniConMonedaDolaresRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValido() {
        apivalidacionyconfirmacion.Escenario37Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoDniConMonedaSolesRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario38Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoDniConMonedaDolaresRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario39Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoDniConMonedaSolesRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario40Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoDniConMonedaDolaresRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario41Template();
    }

    @Given("Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles y dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido")
    public void seArmaElCuerpoConTipoDeProcesoPagoYDeclaracionYElTipoDeDocumentoDniConMonedaSolesYDolaresRealizandoElPagoYDeclaracionDeLosEmpleadosEnMonedaSolesYDolaresConDniCeYPasaporteConResultadosValidoEInvalido() {
        apivalidacionyconfirmacion.Escenario42Template();
    }

}
