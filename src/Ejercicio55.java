public class Ejercicio55 {

	public static void main(String[] args) {
		Gestor miGestor = new Gestor("Antonio Lopez", "+034 987654321",50000);
		//miGestor.mostrarInformacion();
		
		
		CuentaCorriente miCuenta;
		
		miCuenta=new CuentaCorriente("12345678L", "Fernando Martinez", 500, miGestor);
		miCuenta.infoCuenta();

	}

}
