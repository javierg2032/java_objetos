package maquinaria;

class Vagon {

	// ATRIBUTOS
	private int numeroId;
	private double cargaMaxima;
	private double cargaActual;
	private String mercancia;

	// CONSTRUCTORES
	public Vagon(int numeroId, double cargaMaxima, double cargaActual, String mercancia) {
		this.numeroId = numeroId;
		this.cargaMaxima = cargaMaxima;
		this.cargaActual = cargaActual;
		this.mercancia = mercancia;
	}
	
	//GETTERS Y SETTERS
	
	//METODOS
	public void muestraVagon() {
		System.out.println("Informacion del vagon: \n"+"Numero ID:"+numeroId+"\n");
	}
}
