package ejercicios;

import java.util.Arrays;

public class Colores {

	// ATRIBUTOS
	private String tabla[];

	// CONSTRUCTORES
	public Colores() {
		tabla = new String[3];
		tabla[0] = "Azul";
		tabla[1] = "Verde";
		tabla[2] = "Rojo";
	}

	public Colores(String tabla[]) {
		this.tabla = tabla;
	}

	// GETTERS Y SETTERS
	public void setColores(String color) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = color;
	}

	// METODOS DE LA CLASE
	public String[] generaPaleta(int n) {
		tabla = new String[n];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i]=setColores();
		}

			return tabla;
	}

}
