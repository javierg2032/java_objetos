
public class Gestor {
	// ATRIBUTOS
	public String nombre;
	public final String telefono;
	double importeMax;
	
	//CONSTRUCTORES
	Gestor(String nombre, String telefono){
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMax = 10000;
		
		
	}
	
	Gestor(String nombre, String telefono, double importeMax){
		this.nombre=nombre;
		this.telefono=telefono;
		this.importeMax=importeMax;
	}
	
	//GETTERS Y SETTERS
	
	
	//METODOS DE LA CLASE
	void mostrarInformacion() {
		System.out.println("Nombre: " + nombre + "\n"+
	                       "Telefono: " + telefono +"\n"+
				           "Importe Máximo: " + importeMax);
	}
}
