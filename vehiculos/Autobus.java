package vehiculos;

public class Autobus extends Vehiculo{

	private Persona [] pasajeros;
	private int cantidadPasajeros;
	
	public Autobus() {
		super(0, null);
		this.pasajeros= new Persona[20];
		this.cantidadPasajeros=0;
	}

	@Override
	public boolean cambiarChofer(Persona chofer) {
		if(this.cantidadPasajeros==0 && this.getChofer() != null)
			super.setChofer(chofer);
		return false;
	}

	@Override
	public boolean asignarChofer(Persona chofer) {
		if(super.getChofer()==null)
			super.setChofer(chofer);
		return false;
	}
	
	public void subirPasajeros(Persona pasajero) {
		if(this.cantidadPasajeros<this.pasajeros.length) {
			pasajeros[cantidadPasajeros] = pasajero;
			cantidadPasajeros++;
		}
	}
	
	public void bajarPasajero() {
		if(this.cantidadPasajeros>0)
			this.cantidadPasajeros--;
	}

}
