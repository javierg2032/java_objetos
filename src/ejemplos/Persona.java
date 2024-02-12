package ejemplos;

public class Persona {// Ejemplo_01

	// Declaracion de Atributos (Atributos=Variables)

	private String nombre;
	private byte edad;
	private double estatura;
	private static String hoy = "lunes";
	// final String dni; //Una vez asignado, no va cambiar el valor

	// Constructores

	Persona(String nombre, byte edad, double estatura) { // Asigna todos los valores al atributo
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	Persona(String nombre) { // Solamente asigna nombre al atributo
		this.nombre = nombre;
	}

	// Getter y Setters

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public byte getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	// Declaracion de Metodos (Metodos=Funciones)

	void saludo() {
		System.out.println("Hola, mi nombre es: " + nombre);
	}

	void cumplirAnyos() {
		edad++;
	}

	void crecer(double incremento) {
		estatura = estatura + incremento;
	}
}
