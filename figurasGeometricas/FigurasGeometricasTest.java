package figurasGeometricas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FigurasGeometricasTest {
	Figura cuadradito;
	Figura rectangulito;
	Figura triangulito;
	Figura elipsecita;
	Figura circulito;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void areaRectanguloTest() {
		rectangulito = new Rectangulo(new Punto(1,1), new Punto(5,6));
		double esperado = 5*4;
		double actual = rectangulito.calcularArea();
		assertEquals(esperado, actual, 0.001);
	}
	
	@Test
	public void areaCuadradoTest() {
		cuadradito = new Cuadrado(new Punto(1,1), 4);
		double esperado = 16;
		double actual = cuadradito.calcularArea();
		assertEquals(esperado, actual, 0.001);
	}
	
	@Test
	public void areaTrianguloTest() {
		triangulito = new Triangulo(new Punto(0,0), new Punto(0,4), new Punto(4,0));
		double esperado = 8;
		double actual = triangulito.calcularArea();
		assertEquals(esperado, actual, 0.001);
	}
	@Test
	public void areaCirculoTest() {
		circulito = new Circulo(new Punto(0,0), 1.0);
		double esperado = Math.PI;
		double actual = circulito.calcularArea();
		assertEquals(esperado, actual, 0.001);
	}
	
	// ídem para las figuras que falten o las que deseen agregar a la jerarquía. 
	

}
