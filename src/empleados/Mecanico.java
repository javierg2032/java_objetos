package empleados;

public class Mecanico {

	// ATRIBUTOS
	private String nombre;
	private String telefono;
	private Especialidad especialidad;

	// CONSTRUCTORES
	public Mecanico(String nombre, String telefono, String especialidad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = Especialidad.valueOf(especialidad);

	}

	// GETTERS Y SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = Especialidad.valueOf(especialidad);
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	//METODOS
}
