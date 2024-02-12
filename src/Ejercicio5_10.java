import personal.Maquinista;
import personal.Mecanico;

import java.util.Arrays;

import maquinaria.Locomotora;
import maquinaria.Tren;
import personal.JefeEstacion;

public class Ejercicio5_10 {

	public static void main(String[] args) {
		Maquinista maq1=new Maquinista("Pedro Lopez","12345678Z", 3000, "principiante");
		Mecanico mec1= new Mecanico("Antonio Perez", "12345679L", "MOTOR");
		JefeEstacion jefe1= new JefeEstacion("Pedro Garcia", "54345679L", "agosto de 2012");
		
		Locomotora loco1=new Locomotora("CU-1632", 10000, 2005, mec1);	
		Tren merca1 = new Tren(loco1, maq1);
		merca1.enganchaVagon(30000,18000,"carbon");
		merca1.enganchaVagon(30000,18000,"carbon");
		merca1.enganchaVagon(25000,20000,"petroleo");
		merca1.enganchaVagon(15000,10000,"botellas");
		merca1.enganchaVagon(15000,10000,"botellas");
		
		System.out.println(Arrays.toString(merca1.vagones));
		
	}

}
