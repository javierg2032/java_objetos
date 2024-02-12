package ejercicios;

public class CuentaCorriente {// Ejercicio_01

	// Atriburos
	String dni;
	public String nombreTitular;
	private double saldo;
	private String nombreBanco = "Banco Squillas";
	Gestor gestor;

	// Constructores
	public CuentaCorriente(String dni, String nombreTitular) {

		this.nombreTitular = nombreTitular;
		this.dni = dni;
		this.saldo = 0; // Tambien es valido poner solamente 'saldo=0;'

	}

	// Constructores V2 (Ejercicio_02)
	public CuentaCorriente(String dni, double saldo) {

		this(dni, "");
		this.saldo = saldo;

	}

	public CuentaCorriente(String dni, String nombreTitular, double saldo) {

		/*
		 * this.dni = dni; this.nombreTitular = nombreTitular; this.saldo = saldo;
		 */

		this(dni, nombreTitular);
		this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombreTitular, double saldo, Gestor gestor) {

		/*
		 * this.dni = dni; this.nombreTitular = nombreTitular; this.saldo = saldo;
		 */

		this(dni, nombreTitular);
		this.saldo = saldo;
		this.gestor = gestor;
	}

	// Getters y Setters

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Gestor getGestor() {
		return gestor;
	}

	// Metodos
	public boolean sacarDinero(double retirada) {
		boolean esPosible = false;
		if (saldo >= retirada) {
			saldo = saldo - retirada;
			esPosible = true;
		} else {
			System.out.println("Saldo insuficiente");
		}
		return esPosible;
	}

	void ingresarDinero(double ingreso) {

		saldo = saldo + ingreso;

	}

	public void mostrarInfo() {

		System.out.println("DNI del titular: " + dni + "\n" + "Nombre completo del titular: " + nombreTitular + "\n"
				+ "Saldo disponible: " + saldo);
		if (gestor == null) {
			System.out.println("Cuenta sin gestor");
		} else {
			System.out.println("Gestor: ");
			gestor.mostrarInfo();
		}
	}
}
