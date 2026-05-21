package com.krakeDev.Taller.Exepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {

	private static final Logger LOGGER = LoggerFactory.getLogger(GuardarContacto.class);
	
	public static void main(String[] args) {
		
		BufferedReader lector = null;
		
		FileReader archivo;
		try {
			archivo = new FileReader("fantasma.txt");
			
			lector = new BufferedReader(archivo);
			
			for(String l = lector.readLine();l!=null;l=lector.readLine()) {
				System.out.println(l);
			}
			
			LOGGER.info("OK");
			
		} catch (FileNotFoundException e) {
			
			LOGGER.error("No se encontro el archivo: ",e.getMessage());
		} catch (IOException e) {

			LOGGER.error("Error al leer el archivo: ",e.getMessage());
		}finally {
			try {
				if(lector!=null) {
					lector.close();
				}
				
			} catch (IOException e) {
				LOGGER.error("Error al cerrar el archivo: ",e.getMessage());
			}
		}
		

	}

}
