package figurasGeometricas;

public class Elipse extends Figura {
	
	private double radioMayor;
	private double radioMenor;

	protected double getRadioMayor() {
		return radioMayor;
	}

	protected double getRadioMenor() {
		return radioMenor;
	}

	public Elipse(Punto centro, double radioMenor, double radioMayor) {
		super(centro);
		this.setRadios(radioMenor, radioMayor);
		
	}

	private void setRadios(double a, double b) {
		if(a<=b) {
			this.radioMenor=a;
			this.radioMayor=b;
		}else {
			this.radioMayor = a;
			this.radioMenor=b;
		}
	}
	
	@Override
	public Double calcularArea() {
		return Math.PI*this.radioMayor*this.radioMenor;
	}

	@Override
	public String toString() {
		return "Soy una Elipse de centro " + super.getP1() + 
				" y radios " + this.getRadioMenor() + " " +this.getRadioMayor();
	}

	@Override
	public void mover(double deltaX, double deltaY) {
		super.getP1().mover(deltaX, deltaY);
		
	}
	
	

}
