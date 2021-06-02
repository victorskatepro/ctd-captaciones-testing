@SFTP
Feature: Descarga de Archivos del SFTP

  Rule: Descargar eñ archivo de CTS

    #DECLARACION#

     # TIPO PROCESO	            TIPO DOC EMPRESA    MONEDA EMPRESA	   MONEDA EMPLEADO	  TIPO DOCUMENTO	 VALIDOS	     INVALIDOS
     # DECLARACION	            RUC                 SOLES	           SOLES	          DNI CE PASS        SI	             NO
    @DescargaArchivos
    Scenario: El empleador ingresa el tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      Given Se arma el cuerpo donde el tipo de proceso declaracion y el tipo de documento ruc con moneda soles, realizando la declaracion de los empleados en moneda soles con dni , ce y pasaporte con resultados valido
      When agrego los encabezamos en la peticion del api de validacion
      Then valido la respuesta obtenida del api de validacion
      And se obtiene el correlation Id del api de validacion
      Then Se arma el cuerpo del api de confirmacion
      And agrego los encabezados en la peticion del api de confirmacion
      Then valido la respuesta obtenida del api de confirmacion