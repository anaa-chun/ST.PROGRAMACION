package ClasesHerencia;

public class Circulo extends FigurasGeometricas {


	public Circulo(double lado1) {
		super(lado1);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(lado1, 2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*lado1;
	}

	@Override
	public String toString() {
		return "Circulo de radio=" +lado1;
	}
	
	

}
