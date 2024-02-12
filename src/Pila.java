
public class Pila {

	//ATRIBUTOS
	
	private Lista lista;
	
	//CONSTRUCTORES
	public Pila() {
		lista = new Lista();
		
	}
	
	//Metodos de la clase
	public void apilar(Integer nuevoNumero) {
		lista.insertarAlFinal(nuevoNumero);
		
	}
	
	public Integer desapilar() {
		Integer ultimoElemento=null;
		if(lista.numElementos()>0) {
			ultimoElemento = lista.getElemento(lista.numElementos()-1);
			lista.eliminarDePosicion(lista.numElementos()-1);
		}	
		return ultimoElemento;
	}
	public String mostrarPila() {
		return lista.mostrarLista();
	}
	
}