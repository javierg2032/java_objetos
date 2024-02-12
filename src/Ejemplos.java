
public class Ejemplos {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Claudia", (byte)8, 1.20);
		persona.cumplirAnyos();
		persona.crecer(0.05);
		System.out.println(persona.estatura);
		System.out.println(persona.edad);
		
		Persona pepe= new Persona("Pepe");
	}

}
