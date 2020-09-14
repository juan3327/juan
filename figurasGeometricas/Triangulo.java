package figurasGeometricas;

public class Triangulo extends Figura {
	private Punto p2;
	private Punto p3;
	
	public Triangulo(Punto a, Punto b, Punto c) {
		super(a);
		this.setP2(b);
		this.setP3(c);		
	}
	
	private Punto getP2() {
		return p2;
	}

	private void setP2(Punto p2) {
		this.p2 = p2;
	}

	private Punto getP3() {
		return p3;
	}

	private void setP3(Punto p3) {
		this.p3 = p3;
	}

	@Override
	public Double calcularArea() {
		// La manera de calcular el area de un triángulo
		// definido por sus tres vertices sería así(investigar):
		return Math.abs((super.getP1().getX() * p2.getY() + p2.getX() * p3.getY() + p3.getX() * super.getP1().getY()) 
				- (super.getP1().getX() * p3.getY() + p3.getX() * p2.getY() + p2.getX() * super.getP1().getY())) / 2;

	}
		
}
