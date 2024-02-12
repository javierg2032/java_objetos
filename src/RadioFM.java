
public class RadioFM {
	//Atributos
		private double frecuencia;
	//Constructores
		public RadioFM(double frecuencia) {
			if(frecuencia<87.5) {
				this.frecuencia = 87.5;
			}else if(frecuencia>108) {
				this.frecuencia = 108;
			}else {
				this.frecuencia = frecuencia;
			}
		}
		public RadioFM() {}
		
		//Métodos de la clase
		
		public void up() {
			if(frecuencia<=107.5) {
				frecuencia = frecuencia + 0.5;
			}else {
				frecuencia = 87.5;
			}
		}
		
		public void down() {
			if(frecuencia>=88) {
			frecuencia = frecuencia - 0.5;
			}else {
				frecuencia = 108;
			}
		}
		
		public void display() {
			System.out.println("Estamos sintonizando: "+ frecuencia );
		}
		
}
