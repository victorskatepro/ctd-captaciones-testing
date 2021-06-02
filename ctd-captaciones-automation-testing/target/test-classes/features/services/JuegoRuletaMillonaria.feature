Feature: Juego de Ruleta Millonaria

  Background: El cliente ingresa desde el APP
    Given el cliente genera un token valido:
      | codigo     | cuenta        |
      | 0060465484 | 8987003611997 |

  @JuegoRuletaMillonariaBono
  Scenario: El cliente juega la ruleta millonaria
    Given el cliente inicia el juego de la ruleta millonaria
    When le da click en el boton jugar de la ruleta
    Then le da click en boton entendido y finaliza el juego

  @JuegoRuletaMillonariaVale
  Scenario: El cliente juega la ruleta millonaria
    Given el cliente inicia el juego de la ruleta millonaria
    When le da click en el boton jugar de la ruleta
    Then le da click en boton cerrar y finaliza el juego

  @JuegoRuletaMillonariaHistorialdePremiosVales
  Scenario: El cliente juega la ruleta millonaria
    Given el cliente inicia el juego de la ruleta millonaria
    When le da click en el boton historico de premios
    When le da click en el boton detalle del premio
    Then le da click en boton cerrar y finaliza el juego

  @JuegoRuletaMillonariaClienteNoEstaCargadoEnElMesActual
  Scenario: El cliente juega la ruleta millonaria
    Given el cliente inicia el juego de la ruleta millonaria
    When el cliente se encuentra cargado en el mes actual
    Then el cliente finaliza el juego.

  @JuegoRuletaMillonariaClienteSingiros
  Scenario: El cliente juega la ruleta millonaria
    Given el cliente inicia el juego de la ruleta millonaria
    When el cliente no cuenta con giros
    Then el cliente finaliza el juego.

  @JuegoRuletaMillonariaEnvioCorreoSinEditarVales-----------faltaparabono
  Scenario: El cliente juega la ruleta millonaria
    Given el cliente inicia el juego de la ruleta millonaria
    When le da click en el boton jugar de la ruleta
    When le da click en boton EnviarCorreoSinEditar
    Then carga nuevamente la ruleta millonaria y finaliza el juego.

  @Escenario
  Scenario: El cliente no cuenta con giros disponibles puede visualizar el historial premios y envia correo
    Given el cliente ingresa a ruleta millonaria y no tiene giros disponibles
    When le da click en el boton historico de premios
    When le da click en el boton detalle del premio
    When le da click en boton EnviarCorreoSinEditar
    Then carga muevamente historial de premios

  @Escenario
  Scenario: El cliente no cuenta con giros disponibles puede visualizar el historial premios y edita el correo
    Given el cliente ingresa a ruleta millonaria y no tiene giros disponibles
    When le da click en el boton historico de premios
    When le da click en el boton detalle del premio
    When le da click en boton EnviarCorreo
    When  le da click en editarcorreo
    Then carga muevamente historial de premios


  @Escenario
  Scenario: El cliente no se encuentra cargado en el mes actual si puede visualizar el historical y envia correo
    Given el cliente ingresa a ruleta millonaria y no tiene giros disponibles
    When le da click en el boton historico de premios
    When le da click en el boton detalle del premio
    When le da click en boton EnviarCorreoSinEditar
    Then carga muevamente historial de premios

  @Escenario
  Scenario: El cliente no se encuentra cargado en el mes actual si puede visualizar el historical y edita el correo
    Given el cliente ingresa a ruleta millonaria y no tiene giros disponibles
    When le da click en el boton historico de premios
    When le da click en el boton detalle del premio
    When le da click en boton EnviarCorreo
    When le da click en editarcorreo
    Then carga muevamente historial de premios


  @Escenario
  Scenario: El cliente tiene giros disponibles visualiza el detalle y envia correo
    Given el cliente inicia el juego de la ruleta millonaria
    When le da click en el boton historico de premios
    When le da click en el boton detalle del premio
    When le da click en el boton EnviarCorreoSinEditar
    Then carga muevamente historial de premios

  @Escenario
  Scenario: El cliente tiene giros disponibles visualiza el detalle y edita correo
    Given el cliente inicia el juego de la ruleta millonaria
    When le da click en el boton historico de premios
    When le da click en el boton detalle del premio
    When le da click en el boton EnviarCorreo
    When le da click en el boton editarcorreo
    Then carga muevamente historial de premios


  @Escenario
  Scenario: El cliente tiene giros disponibles y visualiza historial de premios
    Given el cliente inicia el juego de la ruleta millonaria
    When le da click en el boton jugar de la ruleta
    When le da click en boton entendido
    Then le da click en el boton historico de premios se visualiza el premio y finaliza


  @token
  Scenario Outline: Genero un token
    Given se arma el cuerpo con codigo_unico "<codigounico>" numero_cuenta "<numerocuenta>"
    When agrego los encabezados en la peticion
    And valido la respuesta obtenida
    Then obtengo el token generado
    Examples:
      | codigounico | numerocuenta  |
      | 0060465484  | 8987003611997 |



