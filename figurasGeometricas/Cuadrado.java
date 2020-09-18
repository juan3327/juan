package figurasGeometricas;

public class Cuadrado extends Rectangulo {

	public Cuadrado(Punto a, double lado) {
		super(a, new Punto(a.getX()+lado,a.getY()+lado));
	}
	public String toString() {
		return "Soy un cuadrado desde " + super.getP1() + " y lado " + Math.abs(super.getP1().getX()-super.getP2().getX());
	}

}
