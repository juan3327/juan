package empresa.uno;

public class PlantaPermanente extends Empleado {
	private static final double VALORHORA=300;
	private static final double VALORANIOANTIGUEDAD=100;
	
	private int antiguedad;

	protected int getAntiguedad() {
		return antiguedad;
	}

	public PlantaPermanente(int horasTrabajadas, int hijos, boolean casado, int antiguedad) {
		super(horasTrabajadas, hijos, casado);
		this.antiguedad=antiguedad;
	}

	@Override
	public Double calcularSalario() {
		return this.getAntiguedad() * PlantaPermanente.VALORANIOANTIGUEDAD +
				PlantaPermanente.VALORHORA * super.getHorasTrabajadas() + 
					super.calcularSalarioFamiliar();
	}

}
