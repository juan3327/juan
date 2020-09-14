package figurasGeometricas;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Figura cuadri = new Cuadrado(new Punto(2,2), 4);
		Figura triangulito = new Triangulo(new Punto(0,0), new Punto(4,0), new Punto(0,4));
		Figura eli = new Elipse(new Punto(-10,-10),4,2);
		Figura circulito = new Circulo(new Punto(1,1),3); 
				
		Figura figuras[] = new Figura[4];
		
		figuras[0]=cuadri;
		figuras[1]=triangulito;
		figuras[2]=eli;
		figuras[3]=circulito;
		
		for(Figura f : figuras)
			System.out.println(f.calcularArea());
		
		//ordenamos el arreglo de menor a mayor area
		Arrays.sort(figuras);
		
		for(Figura f : figuras)
			System.out.println(f.calcularArea());
	}

}
