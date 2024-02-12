
public class Persona {
	//Atributos
	String nombre;
	byte edad;
	double estatura;
	
	//Constructores
	Persona(String nombre, byte edad, double estatura){
		this.nombre=nombre;
		this.edad = edad;
		this.estatura=estatura;
	}
	Persona (String nombre){
		this.nombre = nombre;
	}
	
	//Métodos
	void saludar() {
		System.out.println("Hola. Mi nombre es " +nombre);
	}
	
	void cumplirAnyos() {
		edad++;
	}
	
	void crecer(double incremento) {
		estatura = estatura + incremento;
	}
}
