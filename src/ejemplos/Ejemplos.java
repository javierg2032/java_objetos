package ejemplos;

public class Ejemplos {

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * Persona persona = new Persona(); persona.nombre = "Javier"; persona.edad =
	 * 21; persona.estatura = 1.75; System.out.println(Persona.hoy);
	 * 
	 * 
	 * Persona persona = new Persona("Javier", (byte) 21, 1.75);
	 * persona.crecer(0.05); System.out.println(persona.estatura);
	 * 
	 * Persona pepe = new Persona("Pepe"); pepe.edad = 45;
	 * 
	 * 
	 * persona.cumplirAnyos(); System.out.println(persona.edad);
	 * 
	 * 
	 * Cuenta cuenta = new Cuenta(); cuenta.setDatos(5, 20); cuenta.muestraDatos();
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * Alumno alumno = new Alumno(); alumno.nombre = "Antonio";
	 * alumno.asignaNota(8); System.out.println(alumno.getNota());
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Persona persona = new Persona("Ahsoka", (byte) 40, 1.70);
		persona.getEdad();
		persona.setNombre("Ahsoka Tano");
		System.out.println(persona.getNombre());

	}

}
