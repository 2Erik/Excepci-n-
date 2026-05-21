package com.krakeDev.Taller.Exepciones;

public class ValidarContacto {
	
	public static void validarTelefono(String telefono)throws IllegalArgumentException {
		if(telefono.length() != 10) {
			throw new IllegalArgumentException("No tiene 10 digitos");
		}
	}
}
