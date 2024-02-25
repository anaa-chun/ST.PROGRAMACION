package ejercicio02_Calculadora_de_Salario;

//@author: Ana Chun Gómez de Castro DAM1

public class Empleado {

	/*
	 * 2.Calculadora de Salario: Desarrolla una clase Empleado con atributos para
	 * nombre, horas trabajadas y tarifa por hora. Usa getters y setters para
	 * manipular estos atributos. En el archivo principal, usa un bucle for para
	 * ingresar los datos de 5 empleados mediante JOptionPane y calcula su salario
	 * (horas trabajadas * tarifa por hora).
	 */

	private String nombre;
	private int horasTrabajadas;
	private double tarifaHora;

	public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
	}

	// Método getter y setter para el atributo de nombre
	public String get_nombre() {
		return nombre;
	}

	public void set_nombre(String nombre) {
		this.nombre = nombre;
	}

	// Método getter y setter para el atributo de horas trabajadas
	public int get_horasTrabajadas() {
		return horasTrabajadas;
	}

	public void set_horasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	// Método getter y setter para el atributo de tarifas por horas
	public double get_horasTarifas() {
		return tarifaHora;
	}

	public void set_tarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}

}
