package ejercicios;

import java.util.Arrays;

public class Ejercicio_5_11 {

	public static void main(String[] args) {

		Lista lista1 = new Lista();
		Lista lista2=new Lista();
		
		lista1.addFinal(5);
		System.out.println(lista1.muestraLista());
		lista1.addFinal(8);
		System.out.println(lista1.muestraLista());
		lista1.addFinal(12);
		System.out.println(lista1.muestraLista());
		lista1.add(99, 2);
		System.out.println(lista1.muestraLista());
		lista1.add(11, 1);
		System.out.println(lista1.muestraLista());
		lista1.addInicio(63);
		System.out.println(lista1.muestraLista());
		
		lista2.addInicio(10);
		lista2.addInicio(20);
		lista2.addInicio(30);
		lista2.addInicio(40);
		
		lista1.addFinalOtraLista(lista2);
		System.out.println(lista1.muestraLista());
		
	}

}
