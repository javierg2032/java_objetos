
public class Calendario {

	//Atributos
	
	private int dia;
	private int mes;
	private int año;
	
	//Constructor
	Calendario(int año, int mes, int dia){

		this.año=año;
		if(mes>0 && mes<=12) {
			this.mes=mes;
			switch(mes) {
				case(1):
				case(3):
				case(5):
				case(7):
				case(8):
				case(10):
				case(12):
					if(dia>1 && dia<=31) {
						this.dia=dia;
					}
				case(4):
				case(6):
				case(9):
				case(11):
					if(dia>1 && dia<=30) {
						this.dia=dia;
					}
				case(2):
					if(dia>1 && dia<=28) {
						this.dia=dia;
					}			
		}
	
	}
	}//fin constructor
	//GETTERS Y SETTERS
	
	//Métodos de la clase
	public void incrementarDia() {
		dia++;
			switch(mes) {
				case(1):
				case(3):
				case(5):
				case(7):
				case(8):
				case(10):
				
					
				case(4):
				case(6):
				case(9):
				case(11):
					
						if(dia>30) {
							mes++;
							dia = 1;
						}	
					
				break;
				case(2):
					
						if(dia>28) {
							mes=3;
							dia = 1;
					
						}
					
				break;
				case(12):
					
						if(dia>31) {
							mes=1;
							dia = 1;
							año=1;
						}		
					
				break;
					}
					}
	
		public void mostrar() {
			System.out.println(año+"-"+mes+"-"+dia);
				

		}
		
		public void incrementarMes() {
			mes++;
			if(mes>12) {
				mes=1;
				año++;
			}
		}
		public void incrementarAño(int cantidad) {
			if(this.año<0) {
				if(this.año+cantidad>=0) {
					this.año=this.año+cantidad+1;
				}
			}else {
			this.año=this.año+cantidad;
			}
		}
		
		public boolean iguales(Calendario otraFecha) {
			boolean sonIguales = false;
			if(this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia) {
				sonIguales=true;
			}
			return sonIguales;
		}
		}	

