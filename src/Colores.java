import java.util.Arrays;

public class Colores {

	//Atributos
	private String tabla[];
	
	//Constructor
	Colores(){
		tabla = new String[3];
		tabla[0] = "Azul";
		tabla[1] = "Verde";
		tabla[2] = "Rojo";
	}
	
	public Colores(String nuevosColores[]) {
		this.tabla = tabla;
	}
	
	// GETTERS Y SETTERS
	public void setColor(String color) {
		tabla = Arrays.copyOf(tabla, tabla.length+1);
		tabla[tabla.length-1] = color;
	}
	
	//Métodos de la clase
	
	public String[] generaPaleta(int n) {
		String paletaAleatoria[] = new String[0];
		
		return paletaAleatoria;
	}
	
}
