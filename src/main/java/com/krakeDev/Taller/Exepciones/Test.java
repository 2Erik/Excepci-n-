package com.krakeDev.Taller.Exepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GuardarContacto.class);

	public static void main(String[] args) {
		
		try {
			ValidarContacto.validarTelefono("123");
			GuardarContacto.main(args);
			LeerContacto.main(args);
			LOGGER.info("Contacto guardado");
		} catch (Exception e) {
			
			LOGGER.error("Contacto no valido: ",e.getMessage());
		}
		
		try {

	        ValidarContacto.validarTelefono("0981234567");
	        GuardarContacto.main(args);
	        LeerContacto.main(args);
	        LOGGER.info("Contacto guardado correctamente");
	    } catch (Exception e) {

	        LOGGER.error("Contacto no valido", e);
	    }

	}

}
