package ejercicios;

import java.time.*;
import java.util.*;

public class Texto { // EJERCICIO_5_07
	// ATRIBUTO
	private String cadena;
	private int longitudMax;
	private LocalDate fechaCreacion;
	private LocalDateTime horaModificacion;

	// CONSTRUCTORES

	public Texto(int longitudMax) {
		cadena = "";
		this.longitudMax = longitudMax;
		this.fechaCreacion = LocalDate.now();
		this.horaModificacion = null;
	}

	// GETTERS Y SETTERS

	public void setCadena(String cadena) {
		if (cadena.length() <= longitudMax) {
			this.cadena = cadena;
			this.horaModificacion = LocalDateTime.now();
		}
	}

	public String getCadena() {
		return cadena;
	}

	public void setLongitudMax(int longitudMax) {
		if (longitudMax >= this.cadena.length()) {
			this.longitudMax = longitudMax;
			this.horaModificacion = LocalDateTime.now();
		}
	}

	public int getLongitudMax() {
		return longitudMax;
	}

	// METODOS DE LA CLASE

	public void addFinal(char c) {
		if (cadena.length() < longitudMax) {
			cadena = cadena + c;
			this.horaModificacion = LocalDateTime.now();
		}
	}

	public void addFinal(String s) {
		if (cadena.length() + s.length() <= longitudMax) {
			cadena = cadena + s;
			this.horaModificacion = LocalDateTime.now();
		}
	}

	public void addInicio(char c) {
		if (cadena.length() < longitudMax) {
			cadena = c + cadena;
			this.horaModificacion = LocalDateTime.now();
		}
	}

	public void addInicio(String s) {
		if (cadena.length() + s.length() <= longitudMax) {
			cadena = cadena + s;
			this.horaModificacion = LocalDateTime.now();
		}
	}

	public int cuentaVocales() {
		int cantidad = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (esVocal(cadena.charAt(i)) == true) {
				cantidad++;
			}
		}

		return cantidad;
	}

	private boolean esVocal(char c) {
		boolean resultado = false;
		String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
		if (vocales.indexOf(c) >= 0) {
			resultado = true;
		}
		return resultado;
	}

	public void muestraTexto() {
		System.out.println("Longitud maxima de la cadena:" + longitudMax + "\n" 
	+ "Texto: "+cadena+"\n"+"Fecha de creacion: "+fechaCreacion+"\n"+"Fecha ultima modificacion: "+horaModificacion);
	}

}
