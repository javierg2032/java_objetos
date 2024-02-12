package ejercicios;

public class Bombilla {

	// ATRIBUTOS
	private boolean encendida;
	static boolean general = true;

	// CONSTRUCTORES
	Bombilla() {
		this.encendida = false;
	}

	// GETTERS Y SETTERS
	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public boolean getEncendida() {
		return encendida;
	}

	// METODOS

	public void on() {
		encendida = true;
	}

	public void off() {
		encendida = false;
	}

	public boolean estado() {
		boolean combinado;
		if (encendida == true && general == true) {
			combinado = true;
		} else {
			combinado = false;
		}
		return combinado;
	}

}
