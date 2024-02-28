package ClasesHerencia;

public class Cuadrado extends FigurasGeometricas {

	public Cuadrado(double lado1) {
		super(lado1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(lado1, 2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4 * lado1;
	}

}
