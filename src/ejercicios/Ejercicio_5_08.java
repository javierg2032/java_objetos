package ejercicios;

public class Ejercicio_5_08 {

	public static void main(String[] args) {
		
		RadioFM radio1= new RadioFM(109);
		RadioFM radio2= new RadioFM(107.7);
		radio1.display();
		radio2.down();
		radio2.display();
		radio2.up();
		radio2.up();
		radio2.display();
	}

}
