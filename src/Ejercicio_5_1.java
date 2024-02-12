
public class Ejercicio_5_1 {

	public static void main(String[] args) {
		CuentaCorriente miCuenta = new CuentaCorriente("12345678L", "Fernando Martinez");
		
		miCuenta.ingresarDinero(50);
		System.out.println(miCuenta.saldo);
		System.out.println(miCuenta.sacarDinero(20));
		
		System.out.println(miCuenta.saldo);
		miCuenta.infoCuenta();
	}
}
