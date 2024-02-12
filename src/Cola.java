
public class Cola {
	//Atributos
		private Lista lista;
		
	//Constructor
	public Cola() {
		lista = new Lista();
	}
		
		
		
	//Getters y Setters
	
	
	
	//Métodos de la clase
	public void encolar(Integer nuevo) {
		lista.insertarAlFinal(nuevo);
		
	}
	
	public Integer desencolar() {
		Integer primero = null;
		primero = lista.getElemento(0);
		lista.eliminarDePosicion(0);
		
		return primero;
	}
	
	public String mostrarCola() {
		
		return lista.mostrarLista();
	}
}
