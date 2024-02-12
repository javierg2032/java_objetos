package main;

import java.util.Arrays;

import empleados.JefeEstacion;
import empleados.Maquinista;
import empleados.Mecanico;
import maquinaria.Locomotora;
import maquinaria.Tren;

public class Ejercicio_5_10 {

	public static void main(String[] args) {

		Maquinista maq1 = new Maquinista("Pedro Lopez", "12345678L", "Principiante", 3000);
		Mecanico mec1 = new Mecanico("Antonio Recio", "12345678K", "MOTOR");
		JefeEstacion jefe1 = new JefeEstacion("Alfredo Garcia", "12345678J", "Agosto 2012");
		// Vagon vagon1=new Vagon(1,30000,18000,"Carbon");
		Locomotora loco1 = new Locomotora("CU-1632", 10000, 2005, mec1);
		Tren merca1 = new Tren(loco1, maq1);

		merca1.engancharVagon(30000, 18000, "Carbon");
		merca1.engancharVagon(30000, 18000, "Carbon");
		merca1.engancharVagon(25000, 20000, "Sandias");
		merca1.engancharVagon(15000, 10000, "Carbon");

		System.out.println(Arrays.toString(merca1.vagones));

	}
}
