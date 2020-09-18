package empresa.uno;

public abstract class Empleado {
	private static final double VALORESPOSA=100;
	private static final double VALORHIJO=200;
	
	private int hijos;
	private boolean casado;
	private int horasTrabajadas;
	
	protected int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public Empleado(int horasTrabajadas, int hijos, boolean casado) {
		this.horasTrabajadas=horasTrabajadas;
		this.hijos=hijos;
		this.casado=casado;
	}
	
	protected double calcularSalarioFamiliar() {
		double salarioF=this.hijos*VALORHIJO;
		if(this.casado) 
			salarioF+=VALORESPOSA;
		return salarioF;
	}
	
	public abstract Double calcularSalario();
	

}
