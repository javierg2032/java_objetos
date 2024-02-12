package personal;

public class Mecanico {
	private String nombre;
	private String telefono;
	private Especialidad especialidad;

	//CONSTRUCTORES
	public Mecanico(String nombre, String telefono, String especialiad){
		this.nombre=nombre;
		this.telefono=telefono;
		this.especialidad=Especialidad.valueOf(especialidad);
	}
	//GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono){
		this.telefono=telefono;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
		
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad=Especialidad.valueOf(especialidad);
	}
	//METODOS DE LA CLASE
	
}
