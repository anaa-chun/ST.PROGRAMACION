package ClasesHerencia;

public class Rectangulo extends FigurasGeometricas {
	private double lado2;

	public Rectangulo(double lado1, double lado2) {
		super(lado1);
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado1 * lado2;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * (lado1 + lado2);
	}

	@Override
	public String toString() {
		return "Rec (" + super.toString() + ',' + lado2 + ")";

	}

}
