package com.everis.captaciones.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


public class RuletaMillonariaPageObject extends PageObject {

    //*[@id="mat-dialog-0"]/app-coupon-awards/div/div[2]/mat-dialog-actions/button[1]

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-bonus-awards/div/div[2]/mat-dialog-actions/a[2]")
    public WebElementFacade botonEntendido;

    @FindBy(xpath = "/html/body/app-root/app-home/app-roulette-activated/body/div/div/div/button")
    public WebElementFacade botonHistorial;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-coupon-awards/div/mat-dialog-actions/a")
    public WebElementFacade botonCerrar;

    @FindBy(xpath = "/html/body/app-root/app-historical-awards/div/mat-card[1]/mat-card-header/div[3]/img")
    public WebElementFacade botonConsultaDetallePremio;

    @FindBy(xpath = "/html/body/app-root/app-home/app-roulette-notgame/div/div/div/span[1]")
    public WebElementFacade textoEsteMesNoPodrasJugar;

    @FindBy(xpath = "/html/body/app-root/app-home/app-roulette-disable/div/div/div/span[2]")
    public WebElementFacade textoClienteSinGiros;

    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/app-coupon-awards/div/div[2]/mat-dialog-actions/button[2]")
    public WebElementFacade botonDescargarPremio;

    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/app-coupon-awards/div/div[2]/mat-dialog-actions/button[1]")
    public WebElementFacade botonEnviarCorreoSinEditar;

    @FindBy(xpath = "//*[@id=\"mat-dialog-2\"]/sent-email/body/div/mat-form-field/div/div[1]/div[4]/mat-icon")
    public WebElementFacade botonLapizEditarCorreo;

    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    public WebElementFacade CajaCorreo1;

    @FindBy(xpath = "//*[@id=\"mat-input-2\"]")
    public WebElementFacade CajaCorreo2;

    @FindBy(xpath = "//*[@id=\"mat-dialog-2\"]/sent-email/body/form/div[2]/div[3]/mat-dialog-actions/button")
    public WebElementFacade botonEnviarCorreoDespuesEditar;

    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/sent-email/body/form/div/div[4]/mat-dialog-actions/a")
    public WebElementFacade botonRegresarSinEditar;

    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/sent-email/body/form/div[2]/div[3]/mat-dialog-actions/a")
    public WebElementFacade botonRegresarEditar;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-bonus-awards/div/div[2]/mat-dialog-actions/a[1]")
    public WebElementFacade botonEnviarCorreo;




}
