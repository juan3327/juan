package vehiculos;

public abstract class Vehiculo {
	
	private int kmRecorridos;
	private Persona chofer;

	public Vehiculo(int kmRecorridos, Persona chofer) {
		this.setChofer(chofer);
		this.setKmRecorridos(kmRecorridos);
		
	}	

	public abstract boolean cambiarChofer(Persona chofer);
	
	public abstract boolean asignarChofer(Persona chofer);

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	private void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	
	protected Persona getChofer() {
		return this.chofer;
	}

	protected void setChofer(Persona chofer) {
		this.chofer = chofer;
	}	
	
}
