package figurasGeometricas;

public class Rectangulo extends Figura {
	
	private Punto supDer;

	public Rectangulo(Punto a, Punto b) {
		super(a);
		this.setSupDer(b);
		
	}

	@Override
	public Double calcularArea() {
		return Math.abs((super.getP1().getX()-this.supDer.getX()) * (super.getP1().getY()-this.supDer.getY()));
	}
	
	private Punto getSupDer() {
		return supDer;
	}

	private void setSupDer(Punto supDer) {
		this.supDer = supDer;
	}

}
