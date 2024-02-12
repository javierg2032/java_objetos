package ejercicios;

public class Ejercicio_5_09 {
	public static void main(String[] args) {

		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla();

		b1.on();
		Bombilla.general = false;
		System.out.println(b1.estado());
		System.out.println(b2.estado());
		Bombilla.general = true;

	}
}
