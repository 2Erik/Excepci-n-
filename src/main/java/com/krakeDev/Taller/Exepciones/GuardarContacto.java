package com.krakeDev.Taller.Exepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GuardarContacto.class);
	
	public static void main(String[] args) {
		
		FileWriter escribir = null;
		
		try {
			escribir = new FileWriter("contactos.txt", true);
			
			escribir.write("Nombre: Maria\n");
			escribir.write("Apellido: Gomez\n");
			escribir.write("Contacto: 0981234567\n");
			escribir.write("---------------------\n");
			
			LOGGER.info("Contacto guardado");
			
			
		} catch (IOException e) {
			
			LOGGER.error("El contacto no se guardo: ",e.getMessage());
			
		} finally {
			
				try {
					if(escribir != null) {
						escribir.close();
					}
					
				} catch (IOException e) {
					LOGGER.error("Error al cerrar el archivo: ",e.getMessage());
				}
			
		}
		
	}
}
