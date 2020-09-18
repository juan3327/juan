package figurasGeometricas;

public class Rectangulo extends Figura {
	
	private Punto p2;

	public Rectangulo(Punto a, Punto b) {
		super(a);
		this.setP2(b);
		
	}

	@Override
	public Double calcularArea() {
		return Math.abs((super.getP1().getX()-this.getP2().getX()) * (super.getP1().getY()-this.getP2().getY()));
	}
	
	protected Punto getP2() {
		return p2;
	}

	protected void setP2(Punto supDer) {
		this.p2 = supDer;
	}

	@Override
	public void mover(double deltaX, double deltaY) {
		super.getP1().mover(deltaX, deltaY);
		this.getP2().mover(deltaX, deltaY);
		
	}

}
