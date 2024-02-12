
public class Ejercicio5_25 {

	public static void main(String[] args) {
		Conjunto conjunto1 = new Conjunto();
		Conjunto conjunto2 = new Conjunto();
		System.out.println(conjunto1.insertar(6));
		System.out.println(conjunto1.insertar(6));
		System.out.println(conjunto1.insertar(7));
		System.out.println(conjunto1.insertar(4));
		System.out.println(conjunto1.insertar(8));
		System.out.println(conjunto1.insertar(12));
		System.out.println(conjunto1.insertar(9));
		System.out.println(conjunto1.insertar(1));
		System.out.println(conjunto1.insertar(12));
		System.out.println(conjunto1.insertar(1));
		conjunto1.muestra();
		conjunto2.insertar(2);
		conjunto2.insertar(3);
		conjunto2.insertar(5);
		conjunto2.muestra();
		conjunto1.insertar(conjunto2);
		System.out.println(conjunto1.insertar(conjunto2));
		
		conjunto1.muestra();
		conjunto2.muestra();
		
		conjunto1.muestra();
		System.out.println(conjunto1.eliminarElemento(4));
		conjunto1.muestra();
	}

}
