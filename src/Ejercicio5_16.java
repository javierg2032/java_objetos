import java.util.Arrays;

public class Ejercicio5_16 {

	public static void main(String[] args) {
		SegundoGrado ecuacion1 = new SegundoGrado(1.0,1.0,1.0);
		System.out.println(ecuacion1.discriminantePositivo());
		System.out.println(Arrays.toString(ecuacion1.solucion()));

	}

}
