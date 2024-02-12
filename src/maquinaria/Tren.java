package maquinaria;

import personal.Maquinista;

public class Tren {
	//Atributos
	private Locomotora locomotora;
	public Vagon vagones[];
	private Maquinista maquinista;
	private int numeroVagones;
	
	
	//Constructores
	
	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora=locomotora;
		this.maquinista=maquinista;
		vagones=new Vagon[5];
		numeroVagones=0;
	}
	
	//GETTERS Y SETTERS
	
	//Metodos de la clase
	
	public void enganchaVagon(double cargaMaxima, double cargaActual, String mercancia) {
		if(numeroVagones>=5) {
			System.out.println("No se pueden enganchar más vagones");
		}else {
			Vagon vagon=new Vagon(numeroVagones,30000,18000,"carbón");
			vagones[numeroVagones]=vagon;
			numeroVagones++;
		}
	}
}
