package empresa.uno;

public class Empresa {
	private String razonSocial;
	private String cuit;
	private Empleado empleados[];
	private int cantidadEmpleados=0;
	
	public Empresa(String razonSocial, String cuit, int cantidadEmpleados) {
		this.razonSocial=razonSocial;
		this.cuit=cuit;
		this.empleados=new Empleado[cantidadEmpleados];
	}
	
	public void agregarEmpleados(Empleado e) {
		if(this.cantidadEmpleados<this.empleados.length) {
			empleados[cantidadEmpleados]=e;
			cantidadEmpleados++;
		}
	}
	
	public double montoTotal() {
		double monto=0;
		
		for(Empleado e : empleados)
			monto += e.calcularSalario();
		
		return monto;
			
	}
	
}
