package ejercicios;

public class MainCuentaCorriente {

	public static void main(String[] args) {

		Gestor miGestor=new Gestor("Antonio Lopez","+034 666666666", 50000);
		
		
		
		CuentaCorriente miCuenta;
		miCuenta = new CuentaCorriente("12345678L", "Javier Galán",500,miGestor);
		miCuenta.mostrarInfo();

		/*miCuenta.sacarDinero(25.65);
		
		miCuenta.ingresarDinero(500.96);

		miCuenta.sacarDinero(25.65);

		miCuenta.mostrarInfo();
		
		
		miCuenta.setNombreBanco("Banco Giendo");
		System.out.println(miCuenta.getNombreBanco());*/

		
		
	}

}
