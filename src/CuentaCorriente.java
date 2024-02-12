//version sobrecargada ejer5_2
public class CuentaCorriente {
	//Atributos
	String dni;
	String nombreTitular;
	double saldo;
	private String nombreBanco="Banco Squillas";
	Gestor gestor;
	
	//Constructores
	CuentaCorriente(String dni, String nombreTitular, double saldo, Gestor gestor){
		this.dni=dni;
		this.nombreTitular=nombreTitular;
		this.saldo=0;
		this.gestor = gestor;
	}
	
	CuentaCorriente(String dni, double saldo){
		/*this.dni=dni;
		this.saldo=saldo;*/
		this(dni,"");
		this.saldo=saldo;
	}
	
	CuentaCorriente(String dni, String nombreTitular, double saldo){
		/*this.dni=dni;
		this.nombreTitular=nombreTitular;
		this.saldo=saldo;*/
		this(dni, nombreTitular);
		this.saldo = saldo;
	}
	boolean sacarDinero(double cantidad) {
		boolean esPosible=false;
		if(saldo>=cantidad){
			saldo = saldo - cantidad;
			esPosible=true;
		}else {
			System.out.println("No se puede sacar el importe solicitado");
		}
		return esPosible;
	}
	void ingresarDinero(double cantidad){
		saldo=saldo+cantidad;
	}
	public void infoCuenta() {
		
		System.out.println("DNI: "+dni +"\n"+
	                       "Nombre: "+nombreTitular + "\n"+
				           "Saldo: " +saldo);
		if(gestor!=null) {
			System.out.println("Cuenta sin gestor");
		}else {
			System.out.println("Gestor: ");
			gestor.mostrarInformacion();
		}
	}
	
	//Métodos de la Clase
	
	// Getters y Setters
	public void setGestor(Gestor gestor) {
		this.gestor=gestor;
	}
	public Gestor getGestor() {
		return gestor;
	}
}
