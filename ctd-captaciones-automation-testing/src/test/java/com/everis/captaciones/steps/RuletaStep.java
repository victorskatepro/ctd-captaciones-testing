package com.everis.captaciones.steps;

import com.everis.captaciones.pageobject.RuletaMillonariaPageObject;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RuletaStep {

    private RuletaMillonariaPageObject ruletaPage;

    public void ClickEnJugar() throws FindFailed, InterruptedException {
        Path resourceDirectory = Paths.get("src", "main", "resources", "img");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        Pattern imgGiro = new Pattern(absolutePath + "\\giro.PNG");
        Screen s = new Screen();

       // s.wait(imgGiro, 9000);
        s.click(imgGiro);

        Thread.sleep(15000);


    }

    public void open(String token) {
        ruletaPage.openUrl("https://enpeu2c003rviruat01.azureedge.net/?id=" + token);

    }

   public void ClickBotonEntendido() throws InterruptedException {
        ruletaPage.botonEntendido.isPresent();
        ruletaPage.botonEntendido.click();
       Thread.sleep(10000);
   }

    public void ClickBotonCerrar() throws InterruptedException {
        ruletaPage.botonCerrar.isPresent();
        ruletaPage.botonCerrar.click();
        Thread.sleep(10000);
    }

    public void ClickBotonHistoricodePremios() throws InterruptedException {
        ruletaPage.botonHistorial.isPresent();
        ruletaPage.botonHistorial.click();
        Thread.sleep(10000);
    }
    public void ClickBotonDetallePremio() throws InterruptedException {
        ruletaPage.botonConsultaDetallePremio.isPresent();
        ruletaPage.botonConsultaDetallePremio.click();
        Thread.sleep(10000);
    }

    public void SelectClienteNoSeEncuentraMesActual() throws InterruptedException {
        ruletaPage.textoEsteMesNoPodrasJugar.isPresent();
        ruletaPage.textoEsteMesNoPodrasJugar.getText().equals("Este mes no podrás\n" +
              "jugar a tu Ruleta Millonaria") ;
      }

    public void SelectClienteNoCuentaConGiros() throws InterruptedException {
        ruletaPage.textoClienteSinGiros.isPresent();
        System.out.println(ruletaPage.textoClienteSinGiros.getText());
        ruletaPage.textoClienteSinGiros.getText().equals("Todos los meses tendrás disponibles un\n" +
                "giro en tu ruleta y diferentes\n" +
                "premios por ganar.");
    }

    public void ClickBotonEnviar() throws InterruptedException {
        ruletaPage.botonEnviarCorreo.isPresent();
        ruletaPage.botonEnviarCorreo.click();
    }

    }
