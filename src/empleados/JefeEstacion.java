package empleados;

public class JefeEstacion {

	private String nombre;
	private String dni;
	private String fechaNombramiento;

	// CONSTRUCTORES
	public JefeEstacion(String nombre, String dni, String fechaNombramiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNombramiento = fechaNombramiento;
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

	public void setFechaNombramiento(String fechaNombramiento) {
		this.fechaNombramiento = fechaNombramiento;
	}

	public String getFechaNombramiento() {
		return fechaNombramiento;
	}
}
