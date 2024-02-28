package ClasesHerencia;

public abstract class FigurasGeometricas {
	protected double lado1;

	public FigurasGeometricas(double lado1) {
		super();
		this.lado1 = lado1;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public abstract double area();

	public abstract double perimetro();

	@Override
	public String toString() {
		return "FigurasGeometricas [lado1=" + lado1 + "]";
	}

}
