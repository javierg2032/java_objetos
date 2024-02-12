package ejercicios;

public class Hora {

	// ATRIBUTOS

	private int hora;
	private int minuto;
	private int segundo;

	// CONSTRUCTORES

	public Hora(int hora, int minuto, int segundo) {

		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	// GETTERS Y SETTERS

	public void setSegundo(int segundo) {

		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		} else {
			System.out.println("La cantidad de segundos introducia no es valida");
		}
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		} else {
			System.out.println("La cantidad de minutos introducia no es valida");
		}
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		} else {
			System.out.println("La cantidad de horas introducia no es valida");
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

	// METODOS DE LA CLASE

	public void incrementaSegundo() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			minuto++;
			if (minuto == 60) {
				minuto = 0;
				hora++;
				if (hora == 24) {
					hora = 0;
				}
			}
		}
	}//FIN INCREMENTA SEGUNDO

	public void mostrarHora() {
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}

}