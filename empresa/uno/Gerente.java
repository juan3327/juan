package empresa.uno;

public class Gerente extends PlantaPermanente {
	private static final double VALORHORA=400;
	private static final double VALORANIOANTIGUEDAD=150;

	public Gerente(int horasTrabajadas, int hijos, boolean casado, int antiguedad) {
		super(horasTrabajadas, hijos, casado, antiguedad);
		
	}
	
	@Override
	public Double calcularSalario() {
		return super.getAntiguedad() * Gerente.VALORANIOANTIGUEDAD +
				Gerente.VALORHORA * super.getHorasTrabajadas() + 
					super.calcularSalarioFamiliar();
	}

}
