package ejemplos;

public class Alumno {

	public String nombre;
	private double notaMedia;

	public void asignaNota(double notaMedia) {
		if (notaMedia < 0 || notaMedia > 10) {
			System.out.println("Nota incorrecta");
		} else {
			this.notaMedia = notaMedia;
		}
	}

	public double getNota() {

		return notaMedia;
	}
}
