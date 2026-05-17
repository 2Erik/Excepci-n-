package com.krakeDev.Taller.Exepciones;

public class ValidarContacto {
	
	public static void validarTelefono(String telefono)throws Exception {
		if(telefono.length() != 10) {
			throw new Exception("No tiene 10 digitos");
		}
	}
}
