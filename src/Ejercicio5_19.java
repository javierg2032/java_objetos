import java.util.Arrays;
public class Ejercicio5_19 {

	public static void main(String[] args) {
		Calendario hoy = new Calendario(2024, 2, 6);
		//hoy.incrementarDia();
		hoy.mostrar();
		Calendario antesDeCristo = new Calendario(-3, 12, 31);
		/*antesDeCristo.incrementarDia();
		antesDeCristo.mostrar();
		antesDeCristo.incrementarMes();
		antesDeCristo.mostrar();
		antesDeCristo.incrementarAño(4);
		antesDeCristo.mostrar();*/
		
		System.out.println(hoy.iguales(antesDeCristo));
	}

}
