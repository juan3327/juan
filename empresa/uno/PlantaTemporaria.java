package empresa.uno;

public class PlantaTemporaria extends Empleado {
	private static final double VALORHORA=200;

	public PlantaTemporaria(int horasTrabajadas,int hijos, boolean casado) {
		super(horasTrabajadas, hijos, casado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularSalario() {
		return PlantaTemporaria.VALORHORA * super.getHorasTrabajadas()+
				super.calcularSalarioFamiliar();
	}

}
