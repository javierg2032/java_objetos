
public class Conjunto {
	//Atributos
		private Lista lista;
		
		
	//Constructor
		public Conjunto() {
			lista=new Lista();

		}
		
	//Métodos de la clase
		public boolean pertenece(Integer elemento) {
			boolean siEsta = false;
			if(lista.buscar(elemento)==-1) {
				siEsta = true;
			}
			return siEsta;
		}
		
		public boolean insertar(Integer nuevo) {
			boolean insertado = true;
			if(pertenece(nuevo)==true) {
				lista.insertarAlFinal(nuevo);
			}else {
				insertado = false;
			}
			return insertado;
		}
		
		public void muestra() {
			System.out.println(lista.mostrarLista());
			
		}
		public boolean insertar(Conjunto otroConjunto) {
			boolean insertado = false;
			boolean sePuedeInsertar = true;
			for(int i=0; i<otroConjunto.lista.numElementos(); i++) {
				if(insertar(otroConjunto.lista.getElemento(i))==true){
					sePuedeInsertar = false;
					break;			
				}
			}
			if(sePuedeInsertar == true) {
				for(int i=0; i<otroConjunto.lista.numElementos(); i++) {
				insertar(otroConjunto.lista.getElemento(i));
				}
			}
			insertado = true;
			return insertado;
		}//fin insertar conjunto
		public boolean eliminarElemento(Integer elemento) {
			boolean eliminado = true;
			int posicion=0;
			if(pertenece(elemento)==true) {
				posicion = lista.buscar(elemento);
				lista.eliminarDePosicion(posicion);
			}else {
				eliminado = false;
			}
			return eliminado;
		}
		public boolean eliminarConjunto(Conjunto otroConjunto) {
			boolean sePuedeEliminar=true;
			boolean eliminado = false;
			for(int i=0; i<otroConjunto.lista.numElementos(); i++) {
				if(insertar(otroConjunto.lista.getElemento(i))==true){
					sePuedeEliminar = false;
					break;			
				}
			}
			if(sePuedeEliminar == true) {
				for(int i=0; i<otroConjunto.lista.numElementos(); i++) {
					eliminarElemento(otroConjunto.lista.getElemento(i));
				}
				eliminado = true;
			}
			return eliminado;
		}
}
