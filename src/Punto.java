
public class Punto {
	
	//Atributos
		private double x;
		private double y;
		
	//Contructor
		public Punto(double x, double y) {
			this.x=x;
			this.y=y;
		}
		
	//Getters y Setters
		
		
	//Métodos de la clase
		public void desplazaX(double dx) {
			x=x+dx;
		}
		public void desplazaY(double dy) {
			y=y+dy;
		}
		public void desplaza(double dx, double dy) {
			x=x+dx;
			y=y+dy;
			/*desplazaX(dx);
			desplazaY(dy);*/
		}
		public double distancia(Punto otroPunto) {
			double dist=0;
			double a=Math.pow((this.x-otroPunto.x), 2.0);
			double b=Math.pow((this.y-otroPunto.y), 2.0);
			
			dist = Math.sqrt(a+b);
			return dist;
		}
		public void muestra() {
			System.out.println("x:"+ x+ ", y: "+y);
		}
}
