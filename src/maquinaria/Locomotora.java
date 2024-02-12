package maquinaria;

import empleados.Mecanico;

public class Locomotora {

	// ATRIBUTOS
	private String matricula;
	private int potencia;
	private int fechaFabricacion;
	private Mecanico mecanico;

	// CONSTRUCTORES
	public Locomotora(String matricula, int potencia, int fechaFabricacion, Mecanico mecanico) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.fechaFabricacion = fechaFabricacion;
		this.mecanico = mecanico;
	}
}
