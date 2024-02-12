

public class Ejercicio5_9 {

	public static void main(String[] args) {
		Bombilla b1 = new Bombilla();
		System.out.println(b1.getEncendida());	
		b1.enciende();
		System.out.println(b1.getEncendida());
		Bombilla.interruptorGeneral = false;
		System.out.println(b1.getEncendida());
	}



	}


