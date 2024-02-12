import java.util.Scanner;

public class Ejer5_6 {

	public static void main(String[] args) {
		Hora hora1;
		int hora, minuto, segundo;
		int cantidadSegundos=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la hora");
		hora=sc.nextInt();
		
		System.out.println("Introduzca los minutos");
		minuto=sc.nextInt();
		
		System.out.println("Introduzca los segundos");
		segundo=sc.nextInt();
		
		System.out.println("Introduzca la cantidad segundos");
		cantidadSegundos=sc.nextInt();
		
		hora1 = new Hora(hora, minuto, segundo);
		for(int i=0; i<cantidadSegundos; i++) {
			
			hora1.incrementaSegundo();
			hora1.muestraHora();
			
		}
		
		
		
	}

}
