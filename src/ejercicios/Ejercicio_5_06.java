package ejercicios;

import java.util.*;

public class Ejercicio_5_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hora hora1;
		int hora, minutos, segundos;
		int cantidadSegundos = 0;
		System.out.println("Introduce la hora:");
		hora = sc.nextInt();
		System.out.println("Introduce los minutos:");
		minutos = sc.nextInt();
		System.out.println("Introduce los segundos:");
		segundos = sc.nextInt();

		System.out.println("Introduce la cantidad de segundos: ");
		cantidadSegundos = sc.nextInt();

		hora1 = new Hora(hora, minutos, segundos);

		for (int i = 0; i < cantidadSegundos; i++) {
			hora1.incrementaSegundo();
			hora1.mostrarHora();
		}
	}

}
