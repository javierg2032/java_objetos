
public class Ejercicio5_22 {
	public static void main(String[] args) {
		Cola cola = new Cola();
		cola.encolar(8);
		cola.encolar(12);
		cola.encolar(9);
		cola.encolar(13);
		System.out.println(cola.mostrarCola());
		Integer eliminado = cola.desencolar();
		System.out.println(cola.mostrarCola());
		System.out.println(eliminado);
	}
	
	
}
