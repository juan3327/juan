package empresa.uno;

public class TestEmpresa {

	public static void main(String[] args) {
		Empresa acme = new Empresa("ACME", "34-25568896-9",4);
		acme.agregarEmpleados(new PlantaTemporaria(80,0,true));
		acme.agregarEmpleados(new PlantaPermanente(80,2,true,6));
		acme.agregarEmpleados(new PlantaPermanente(160,0,false,4));
		acme.agregarEmpleados(new Gerente(160,1,true, 10));
		
		System.out.println(acme.montoTotal());

	}

}
