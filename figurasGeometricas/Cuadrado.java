package figurasGeometricas;

public class Cuadrado extends Rectangulo {

	public Cuadrado(Punto a, double lado) {
		super(a, new Punto(a.getX()+lado,a.getY()+lado));
	}

}
