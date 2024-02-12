
public class Ejercicio5_7 {
	public static void main(String[] args) {
		Texto t1 = new Texto(10);
		t1.setCadena("Hola ");
		t1.addFinal("mundo");
		System.out.println(t1.getCadena());
		System.out.println(t1.cuentaVocales());
		t1.muestraTexto();
	}
}
