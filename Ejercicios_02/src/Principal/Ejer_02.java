package Principal;

import java.util.ArrayList;

import ClasesHerencia.Circulo;
import ClasesHerencia.Cuadrado;
import ClasesHerencia.FigurasGeometricas;
import ClasesHerencia.Rectangulo;

public class Ejer_02 {

	public static void main(String[] args) {
		ArrayList<FigurasGeometricas> lista = new ArrayList<FigurasGeometricas>();

		lista.add(new Cuadrado(10));
		lista.add(new Cuadrado(11));
		lista.add(new Cuadrado(102));
		lista.add(new Cuadrado(103));
		lista.add(new Cuadrado(104));

		lista.add(new Rectangulo(10, 20));
		lista.add(new Rectangulo(10, 21));
		lista.add(new Rectangulo(10, 22));
		lista.add(new Rectangulo(10, 23));
		
		
		lista.add(new Circulo(5));
		lista.add(new Circulo(5));
		lista.add(new Circulo(5));
	

		for (FigurasGeometricas f : lista)
			System.out.printf("area=%.2f perimetro=%.2f %s\n", f.area(), f.perimetro(), f);

	}

}
