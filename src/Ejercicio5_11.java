
public class Ejercicio5_11 {

	public static void main(String[] args) {
		Lista lista1 = new Lista();
		Lista lista2 = new Lista();
		System.out.println(lista1.numElementos());
		lista1.insertarAlFinal(5);
		lista1.insertarAlFinal(8);
		lista1.insertarAlPrincipio(12);
		lista1.insertar(99,2);
		System.out.println(lista1.mostrarLista());
		lista2.insertarAlPrincipio(10);
		lista2.insertarAlPrincipio(20);
		lista2.insertarAlPrincipio(30);
		lista2.insertarAlPrincipio(40);
		lista1.insertarAlFinal(lista2);
		System.out.println(lista2.mostrarLista());
		System.out.println(lista1.mostrarLista());
		lista1.eliminarDePosicion(10);
		System.out.println(lista2.mostrarLista());
	}

}
