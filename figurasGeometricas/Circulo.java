package figurasGeometricas;

public class Circulo extends Elipse {

	public Circulo(Punto centro, double radio) {
		super(centro, radio, radio);
	}
	
	public String toString() {
		return "Soy un círculo de centro " + super.getP1() + " y radio " + super.getRadioMenor();
	}
}
