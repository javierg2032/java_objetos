
public class Bombilla {
		//Atributos
	
			private boolean encendida;
			static boolean interruptorGeneral = true;
			
		//Constructores
			
			Bombilla() {
				
					this.encendida = false;
				
			}
				
			//GETTERS Y SETTERS
			
			public void setEncendida(boolean encendida) {
				this.encendida = encendida;
			}
			boolean getEncendida() {
				return encendida;
			}
			
			//Métodos de la clase
			void enciende() {
				encendida = true;
			}
			
			public void apaga() {
				encendida = false;
			}
			
			public boolean stado() {
				boolean combinado;
				
				return combinado;
			}
		
			
	}

