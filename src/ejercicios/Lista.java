package ejercicios;

import java.util.Arrays;

public class Lista {
	// ATRIBUTOS
	private Integer tabla[];

	// CONSTRUCTORES
	public Lista() {
		tabla = new Integer[0];
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public int nElementos() {
		return tabla.length;
	}

	public void addFinal(Integer nuevoNumero) { // INSERTA AL FINAL DEL ARRAY
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = nuevoNumero;
	}

	public void addInicio(Integer nuevoNumero) {
		Integer tabla2[] = new Integer[0];
		tabla2 = Arrays.copyOf(tabla, tabla.length + 1);
		for (int i = 0; i < tabla.length; i++) {
			tabla2[i + 1] = tabla[i];
		}
		tabla2[0] = nuevoNumero;
		tabla = tabla2;

	}

	public void add(Integer nuevoNumero, int posicion) {
		if (posicion >= tabla.length || posicion < 0) {
			System.out.println("Posicion no valida");
		} else {
			Integer tabla2[] = new Integer[0];
			tabla2 = Arrays.copyOf(tabla, tabla.length + 1);
			for (int i = 0; i < tabla.length; i++) {
				tabla2[i] = tabla[i];
			}
			for (int i = posicion; i < tabla.length; i++) {
				tabla2[i + 1] = tabla[i];
			}
			tabla2[posicion] = nuevoNumero;
			tabla = tabla2;
		}

	}

	public String muestraLista() {

		return Arrays.toString(tabla);
	}

	public void addFinalOtraLista(Lista otraLista) {
		Integer tabla2[] = new Integer[0];
		tabla2 = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
		for (int i = tabla.length; i < tabla2.length; i++) {
			tabla2[i] = otraLista.tabla[i-tabla.length];
		}
		tabla=tabla2;
	}
	
	public void eliminarDePosicion(int posicion) {
		
	}
	
}
