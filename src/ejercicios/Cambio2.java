package ejercicios;

public class Cambio2 {

	// ATRIBUTOS
	private double importe;
	private double cantidadPagada;

	// CONSTRUCTORES
	public Cambio2(double importe, double cantidadPagada) {
		this.importe = importe;
		this.cantidadPagada = cantidadPagada;
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public double importeDevuelto() {
		double cantidadADevolver = 0;
		if (cantidadPagada >= importe) {
			cantidadADevolver = cantidadPagada - importe;
		} else {
			System.out.println("La cantidad pagada no es suficiente");
			cantidadADevolver = 0;
		}
		return cantidadADevolver;
	}

}
