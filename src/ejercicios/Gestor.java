package ejercicios;

public class Gestor {
	// Atributos
	public String nombre;
	public final String tlf;
	double importeMax;

	// Constructor

	Gestor(String nombre, String tlf) {
		this.nombre = nombre;
		this.tlf = tlf;
		this.importeMax = 10000;
	}

	Gestor(String nombre, String tlf, double importeMax) {
		this.nombre = nombre;
		this.tlf = tlf;
		this.importeMax = importeMax;
	}

	/*// Getters y Setters

	void setImporteMax(double importeMax) {
		this.importeMax = importeMax;
	}

	double getImporteMax() {
		return importeMax;
	}*/
	
	
	//Metodos de la clase
	
	void mostrarInfo() {
		System.out.println("Nombre: "+nombre+"\n"+"Telefono: "+tlf+"\n"+"Importe maximo: "+importeMax);
	}

}
