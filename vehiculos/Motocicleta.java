package vehiculos;

public class Motocicleta extends Vehiculo{
	
	private Persona acompaniante;

	public Motocicleta() {
		super(0, null);
		this.acompaniante = null;
	}
	
	@Override
	public boolean cambiarChofer(Persona chofer) {
		if(super.getChofer()!=null && this.acompaniante == null) {
			super.setChofer(chofer);
			return true;
		}
		return false;
	}

	@Override
	public boolean asignarChofer(Persona chofer) {
		if(super.getChofer()==null) {
			super.setChofer(chofer);
			return true;
		}
		return false;
	}
	
	public void subirAcompaniante(Persona acompaniante) {
		this.setAcompaniante(acompaniante);
	}

	private boolean hayAcompaniante() {
		return this.acompaniante != null;
	}

	private void setAcompaniante(Persona acompaniante) {
		if(super.getChofer() != null && this.acompaniante == null) {
			this.acompaniante = acompaniante;
		}
	}
		

}
