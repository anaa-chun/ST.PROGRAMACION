package EjercicioDeDificultadMedia_SistemaDeEmpleados;

public abstract class Empleado {// atributos
	private String nombre;
	private int ID;
	private double Salario;

	// metodo abstracto
	public abstract double calcularSalario();

	public abstract void mostrarDetalles();

	public Empleado(String nombre, int ID, double Salario) {// constructo
		this.nombre = nombre;
		this.ID = ID;
		this.Salario = Salario;
	}

	// Constructor con información básica
	public Empleado(String nombre, int ID) {
		this.nombre = nombre;
		this.ID = ID;
	}

	// getter y setter para el nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//getter y setter para el ID
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	//getter y setter para el Salario
	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

}
