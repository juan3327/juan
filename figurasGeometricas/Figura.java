package figurasGeometricas;

public abstract class Figura implements Comparable<Figura> {
	
	private Punto p1;
	
	public Figura(Punto p) {
		this.setP1(p);
	
	}

	protected Punto getP1() {
		return p1;
	}

	private void setP1(Punto p1) {
		this.p1 = p1;
	}
	
	public abstract Double calcularArea();
	
	public int compareTo(Figura otraFigura) {
		return this.calcularArea().compareTo(otraFigura.calcularArea());		
		
	}

}
