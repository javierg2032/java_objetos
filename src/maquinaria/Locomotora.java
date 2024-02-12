package maquinaria;
import personal.Mecanico;
public class Locomotora {
	//Atributos
	private String matricula;
	private int potencia;
	private int fechaFabricacion;
	private Mecanico mecanico;
	
	//Constructor
	public Locomotora(String matricula, int potencia, int fechaFabricacion, Mecanico mecanico) {
		this.matricula=matricula;
		this.potencia=potencia;
		this.fechaFabricacion=fechaFabricacion;
		this.mecanico=mecanico;
	}
}
