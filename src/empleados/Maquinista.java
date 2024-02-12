package empleados;

public class Maquinista {

	// ATRIBUTOS
	private String nombre;
	private double sueldo;
	private String rango;
	private String dni;

	// CONSTRUCOTRES
	public Maquinista(String nombre, String dni, String rango, double sueldo) {

		this.nombre = nombre;
		this.dni = dni;
		this.rango = rango;
		this.sueldo = sueldo;

	}

	// GETTERS Y SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public String getRango() {
		return rango;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	//METODOS
	
}
