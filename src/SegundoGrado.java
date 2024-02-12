
public class SegundoGrado {
	
	//ATRIBUTOS
	
	
	private double a;
	private double b;
	private double c;
	
	//Constructores
	public SegundoGrado(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	//GETTERS Y SETTERS
	
	public void setA(double a) {
		this.a=a;
	}
	public double getA() {
		return a;
	}
	public void setB(double b) {
		this.b=b;
	}
	public double getB() {
		return b;
	}
	public void setC(double c) {
		this.c=c;
	}
	public double getC() {
		return c;
	}
	
	//Métodos de la clase
	
	public boolean discriminantePositivo() {
		boolean esPositivo = false;
		if((b*b)-(4*a*c)>=0) {
			esPositivo=true;
		}		
		return esPositivo;
	}
	
	public double[] solucion() {
		double soluciones[]=new double[2];
		if(discriminantePositivo()==true) {
		soluciones[0] = ((-b)+(Math.sqrt((b*b)-(4*a*c)))/(2*a));
		soluciones[1] = ((-b)-(Math.sqrt((b*b)-(4*a*c)))/(2*a));
		
		}else {
			soluciones=null;
		}
		return soluciones;
	}
	
}
