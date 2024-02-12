import java.time.*; //exportamos paquete entero

public class Texto {
	//Atributos
	private String cadena;
	private int longitudMaxima;
	private LocalDate fechaCreacion;
	private LocalDateTime horaModificacion;
	
	
	//Constructores
	public Texto(int longitudMaxima){
		cadena="";
		this.longitudMaxima=longitudMaxima;
		this.fechaCreacion = LocalDate.now();
		this.horaModificacion = null;
	}
	
	//Getters y Setters
	public void setCadena(String cadena) {
		if(cadena.length()<=longitudMaxima) {
			this.cadena=cadena;
			this.horaModificacion = LocalDateTime.now();
		}
	}
	public String getCadena() {
		return cadena;
	}
	public void setlongitudMaxima(int longitudMaxima) {
		if(longitudMaxima>=this.cadena.length()) {
			this.longitudMaxima = longitudMaxima;
			this.horaModificacion = LocalDateTime.now();
		}
	}
	public int getlongitudMaxima() {
		return longitudMaxima;
	}
	
	//Métodos de la clase
	
	public void addFinal(char c) {
		if(cadena.length()<longitudMaxima) {
			cadena = cadena + c;
			this.horaModificacion = LocalDateTime.now();
		}	
	}
	public void addFinal(String s) {
		if((cadena.length()+s.length())<=longitudMaxima) {
			cadena = cadena + s;
			this.horaModificacion = LocalDateTime.now();
		}	
	}
	public void addInicio(char c) {
		if(cadena.length()<longitudMaxima);
		cadena= c+cadena;
		this.horaModificacion = LocalDateTime.now();
	}
	public void addInicio(String s) {
		if((cadena.length()+s.length())<=longitudMaxima) {
			cadena = s + cadena;
			this.horaModificacion = LocalDateTime.now();
		}	
	}
	
	public int cuentaVocales(){
		int numeroVocales=0;
		for(int i=0; i<cadena.length(); i++) {
			if(esVocal(cadena.charAt(i))==true){
				numeroVocales++;
			}
		}
		return numeroVocales;
	}
	
	private boolean esVocal(char c) {
		boolean resultado=false;
		String vocales="aeiouAEIOUáéíóúÁÉÍÓÚ";
		if(vocales.indexOf(c)>=0) {
			resultado=true;
		}
		return resultado;
	}
	public void muestraTexto() {
		System.out.println("Longitud máxima de la cadena:" + longitudMaxima + "\n"+
						   "Texto: " + cadena + "\n"+
						   "Fecha de creacion: " + fechaCreacion + "\n"+
						   "Fecha y hora modificacion:" + horaModificacion);
	}
}
