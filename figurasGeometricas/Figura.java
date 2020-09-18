package figurasGeometricas;

public abstract class Figura implements Comparable<Figura>, Movible {
	
	private Punto p1;
	
	public Figura(Punto p) {
		this.setP1(p);
	
	}

	protected Punto getP1() {
		return p1;
	}

	protected void setP1(Punto p1) {
		this.p1 = p1;
	}
	
	public abstract Double calcularArea();
	
	public int compareTo(Figura otraFigura) {
		return this.calcularArea().compareTo(otraFigura.calcularArea());	
			
	}
    
	public String toString() {
		return "Soy una figura con punto " + this.getP1().toString();
	}

}
