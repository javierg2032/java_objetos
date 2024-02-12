import java.util.Arrays;

public class Lista {
	//ATRIBUTOS
	
	private Integer tabla[];
	
	
	//CONSTRUCTORES
	public Lista() {
		tabla = new Integer[0];
	}
	
	
	
	//MÉTODOS DE LA CLASE
	public int numElementos() {
		return tabla.length;
	}
	//Insertar un elemento al final de la lista
	
	public void insertarAlFinal(Integer nuevoNumero) {
		tabla = Arrays.copyOf(tabla, tabla.length+1);
		tabla[tabla.length-1]=nuevoNumero;
	}
	
	//Insertar un elemento al principio de la lista
	
	public void insertarAlPrincipio(Integer nuevoNumero) {
		Integer tabla2[] = new Integer[0];
		tabla2 = Arrays.copyOf(tabla, tabla.length+1);
		for (int i=0; i< tabla.length; i++) {
			tabla2[i+1]=tabla[i];
		}
		tabla2[0] = nuevoNumero;
		tabla = tabla2;
		
	}
	//Insertar un elemento en una posicion que se pasa como parámetro
	
	public void insertar(Integer nuevoNumero, int posicion) {
		if(posicion>tabla.length || posicion<0) {
			System.out.println("Posicion no válida");
		}else {
		Integer tabla2[] = new Integer[0];
		tabla2 = Arrays.copyOf(tabla, tabla.length+1);
		for (int i=0; i< posicion; i++) {
			tabla2[i]=tabla[i];
		}
		for (int i=posicion; i< tabla.length; i++) {
			tabla2[i+1] = tabla[i];
		}
		tabla2[posicion]=nuevoNumero;
		tabla = tabla2;
		}
		
	}
	//Imprimir la Lista en pantalla
	public String mostrarLista() {
		return Arrays.toString(tabla);
	}
	
	//Añadir al final de la lista los elementos de otra lista
	
	public void insertarAlFinal(Lista otraLista) {
		Integer tabla2[]= new Integer[0];
		tabla2=Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
		for(int i = tabla.length; i<tabla.length; i++) {
			tabla2[i] = otraLista.tabla[i-tabla.length];
		}
		tabla = tabla2;
	}
	//Eliminar un elemento cuyo indice se le pasa como parámetro
	
	public void eliminarDePosicion(int posicion) {
		if(posicion>=tabla.length || posicion<0) {
			System.out.println("Posición no válida");
		} else {
			System.arraycopy(tabla, posicion +1, tabla, posicion, tabla.length - posicion - 1);
			tabla= Arrays.copyOf(tabla, tabla.length-1);
		}
	}
	//Obtener el elemento cuyo indicie se pasa como parámetro
	public Integer getElemento(int posicion) {
		Integer elemento = null;
		if(posicion>=tabla.length || posicion<0) {
		}else {
			elemento=tabla[posicion];
		}
		return elemento;
	}
	//Buscar un numero en la lista, devolviendo el indice del primer lugar... Si no está devolvera -1
	public int buscar (Integer clave) {
		int resultado=0;
		int indiceBusqueda=0;
		while (indiceBusqueda < tabla.length && 
				!(tabla [indiceBusqueda].equals(clave))) {
			indiceBusqueda++;
		}
		if (indiceBusqueda < tabla.length) {
			resultado=indiceBusqueda;
		}else {
			resultado=-1;
		}
		return resultado;
	}	
	
	//Construye y devuelve una lista que contiene... ejer 5.12
	public static Lista concatena(Lista l1, Lista l2) {
		Lista lista=new Lista();
		lista.tabla = Arrays.copyOf(l1.tabla, l1.tabla.length);
		lista.insertarAlFinal(l2);
		return lista;
	}
	
}





