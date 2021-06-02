@EscenariosCTS
Feature: Validacion y Confirmacion CTS

  Rule: Cargar el archivo de datos

    #DECLARACION#

     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            RUC                 SOLES	           SOLES	          DNI CE PASS        SI	             NO
    @Escenario01
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo donde el tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            RUC                 DOLARES	           DOLARES	          DNI CE PASS        SI	             NO
    @Escenario02
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento ruc con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion


	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            RUC                 SOLES	           SOLES	          DNI CE PASS        SI	             SI
    @Escenario03
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            RUC                 DOLARES	           DOLARES	          DNI CE PASS        SI	             SI
    @Escenario04
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento ruc con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            RUC                 SOLES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario05
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            RUC                 DOLARES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario06
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento ruc con moneda dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            RUC                 SOLES - DOLARES	   SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario07
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento ruc con moneda soles y dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento ruc con moneda soles y dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion




	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            DNI                 SOLES	           SOLES	          DNI CE PASS        SI	             NO
    @Escenario08
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento dni con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo donde el tipo de proceso declaracion y el tipo de documento dni con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            DNI                 DOLARES	           DOLARES	          DNI CE PASS        SI	             NO
    @Escenario09
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento dni con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion


	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            DNI                 SOLES	           SOLES	          DNI CE PASS        SI	             SI
    @Escenario10
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento dni con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            DNI                 DOLARES	           DOLARES	          DNI CE PASS        SI	             SI
    @Escenario11
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento dni con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda dolares, realizando la declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            DNI                 SOLES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario12
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento dni con moneda soles, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda soles, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            DNI                 DOLARES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario13
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento dni con moneda dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            DNI                 SOLES - DOLARES	   SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario14
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento dni con moneda soles y dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso declaracion y el tipo de documento dni con moneda soles y dolares, realizando la declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion




     #PAGOS#


     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO     	            RUC                 SOLES	           SOLES	          DNI CE PASS        SI	             NO
    @Escenario15
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento ruc con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo donde el tipo de proceso pago y el tipo de documento ruc con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    RUC                 DOLARES	           DOLARES	          DNI CE PASS        SI	             NO
    @Escenario16
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento ruc con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion


	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    RUC                 SOLES	           SOLES	          DNI CE PASS        SI	             SI
    @Escenario17
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento ruc con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    RUC                 DOLARES	           DOLARES	          DNI CE PASS        SI	             SI
    @Escenario18
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento ruc con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    RUC                 SOLES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario19
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento ruc con moneda soles, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda soles, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    RUC                 DOLARES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario20
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento ruc con moneda dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    RUC                 SOLES - DOLARES	   SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario21
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento ruc con moneda soles y dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento ruc con moneda soles y dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion




	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    DNI                 SOLES	           SOLES	          DNI CE PASS        SI	             NO
    @Escenario22
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento dni con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo donde el tipo de proceso pago y el tipo de documento dni con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    DNI                 DOLARES	           DOLARES	          DNI CE PASS        SI	             NO
    @Escenario23
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento dni con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion


	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    DNI                 SOLES	           SOLES	          DNI CE PASS        SI	             SI
    @Escenario24
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento dni con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda soles, realizando el pago de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    DNI                 DOLARES	           DOLARES	          DNI CE PASS        SI	             SI
    @Escenario25
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento dni con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda dolares, realizando el pago de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    DNI                 SOLES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario26
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento dni con moneda soles, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda soles, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    DNI                 DOLARES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario27
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento dni con moneda dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO	                    DNI                 SOLES - DOLARES	   SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario28
    Scenario: El empleador ingresa el tipo de proceso pago y el tipo de documento dni con moneda soles y dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y el tipo de documento dni con moneda soles y dolares, realizando el pago de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion







      #PAGO y  DECLARACION#


     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION     	          RUC                 SOLES	           SOLES	          DNI CE PASS        SI	             NO
    @Escenario29
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo donde el tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION	    RUC                 DOLARES	           DOLARES	          DNI CE PASS        SI	             NO
    @Escenario30
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento ruc con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion


	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION	    RUC                 SOLES	           SOLES	          DNI CE PASS        SI	             SI
    @Escenario31
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       RUC                 DOLARES	           DOLARES	          DNI CE PASS        SI	             SI
    @Escenario32
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento ruc con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       RUC                 SOLES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario33
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       RUC                 DOLARES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario34
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento ruc con moneda dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       RUC                 SOLES - DOLARES	   SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario35
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles y dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento ruc con moneda soles y dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion




	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       DNI                 SOLES	           SOLES	          DNI CE PASS        SI	             NO
    @Escenario36
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo donde el tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       DNI                 DOLARES	           DOLARES	          DNI CE PASS        SI	             NO
    @Escenario37
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento dni con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion


	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       DNI                 SOLES	           SOLES	          DNI CE PASS        SI	             SI
    @Escenario38
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles, realizando el pago y declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       DNI                 DOLARES	           DOLARES	          DNI CE PASS        SI	             SI
    @Escenario39
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento dni con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda dolares, realizando el pago y declaracion de los empleados en moneda dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       DNI                 SOLES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario40
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



	 # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       DNI                 DOLARES	           SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario41
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento dni con moneda dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion



     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  		  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # PAGO Y DECLARACION       DNI                 SOLES - DOLARES	   SOLES - DOLARES	          DNI CE PASS        SI	             SI
    @Escenario42
    Scenario: El empleador ingresa el tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles y dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      Given Se arma el cuerpo con tipo de proceso pago y declaracion y el tipo de documento dni con moneda soles y dolares, realizando el pago y declaracion de los empleados en moneda soles y dolares con dni , ce y pasaporte con resultados valido e invalido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion