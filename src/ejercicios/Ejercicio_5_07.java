package ejercicios;

import java.util.*;

public class Ejercicio_5_07 {

	public static void main(String[] args) {

		Texto t1 = new Texto(10);
		Texto t2 = new Texto(10);
		t1.setCadena("Hola mund");
		t1.addFinal('o');
		System.out.println(t1.getCadena());

		t2.setCadena("ola mundo");
		t2.addInicio('H');
		System.out.println(t2.getCadena());

		t1.setCadena("Hola ");
		t1.addFinal("MUNDO");
		System.out.println(t1.getCadena());
		System.out.println(t1.cuentaVocales());

		t1.muestraTexto();
		t2.muestraTexto();
	}
}
