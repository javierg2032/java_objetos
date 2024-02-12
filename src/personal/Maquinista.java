package personal;

public class Maquinista {
	//ATRIBUTOS
	private String nombre;
	private String dni;
	private double sueldo;
	private String rango;
	
	//CONTRUCTOR
	public Maquinista(String nombre, String dni, double sueldo, String rango) {
		this.nombre=nombre;
		this.dni=dni;
		this.sueldo=sueldo;
		this.rango=rango;
	}
	//GETTERS Y SETTERS
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni=dni;
		}
		public double getSueldo() {
			return sueldo;
		}
		public void setSueldo(double sueldo) {
			this.sueldo=sueldo;
		}
		public String getRango() {
			return rango;
		}
		public void setRango(String rango) {
			this.rango=rango;
		}
	
	}

