
public class Hora {
	//Atributos
	private int hora;
	private int minuto;
	private int segundo;
	
	//Constructores
	public Hora(int hora, int minuto, int segundo) {
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
	}
	
	//Getters y Setters
	public void setSegundo(int segundo) {
		if(segundo>=0 && segundo<60) {
			this.segundo=segundo;
		}else {
			System.out.println("La cantidad de segundos introducida no es válida");
		}
	}
	public void setMinuto(int minuto) {
		if(minuto>=0 && minuto<60) {
			this.minuto=minuto;
		}else {
			System.out.println("La cantidad de minutos introducida no es válida");
		}
	}
	public void setHora(int hora) {
		if(hora>=0 && hora<24) {
			this.hora=hora;
		}else {
			System.out.println("La cantidad de horas introducida no es válida");
		}
	}
	
	public int getSegundo() {
		return segundo;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getHora() {
		return hora;
	}
	//Métodos de la clase
	public void incrementaSegundo() {
		segundo++;
		if(segundo==60) {
			minuto++;
			segundo=0;
			if(minuto==60) {
				hora++;
				minuto=0;
				if(hora==24) {
					hora=0;
				}
			}
		}
	}//fin incrementaSegundo
	
	public void muestraHora() {
		System.out.println(hora+":"+minuto+":"+segundo);
	}
	
}
