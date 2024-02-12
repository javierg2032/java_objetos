package maquinaria;

import empleados.Maquinista;

public class Tren {

	// ATRIBUTOS
	private Locomotora locomotora;
	public Vagon vagones[];
	private Maquinista maquinista;
	private int nVagones;

	// CONSTRUCTORES
	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		vagones = new Vagon[5];
		nVagones = 0;
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public void engancharVagon(double cargaMaxima, double cargaActual, String mercancia) {

		if (nVagones >= 5) {
			System.out.println("No se pueden enganchar mas vagones");
		} else {
			Vagon vagon = new Vagon(nVagones, cargaMaxima, cargaActual, mercancia);
			vagones[nVagones] = vagon;
			nVagones++;
		}

	}
}
