package ejercicios;

import java.util.Arrays;

public class Ejercicio_5_16 {

	public static void main(String[] args) {

		SegundoGrado ecuacion1 = new SegundoGrado(5, 1, 8);
		SegundoGrado ecuacion2 = new SegundoGrado(1, 1, 1);

		System.out.println(ecuacion1.discriminantePositivo());
		System.out.println(Arrays.toString(ecuacion1.solucion()));
	}

}
