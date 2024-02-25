package Ejercicio2_ClaseCuentaBancaria; 

//@author: Ana Chun Gómez de Castro DAM1

public class cuentaBancaria { // DeclarO de la clase principal cuentaBancaria

	/*
	 * Objetivo: Diseña una clase CuentaBancaria con dos propiedades privadas:
	 * titular (String) y saldo (double). Crea los métodos getter y setter para
	 * ambas propiedades.
	 * 
	 * Desafío adicional: En el setter del saldo, no permitas que el saldo sea
	 * negativo.
	 */

	//Propiedades privadas que almacenan el titular y el saldo de la cuenta bancaria
	private String titular; 
	private double saldo; 

	// Constructor de la clase CuentaBancaria que inicializa las propiedades
	public cuentaBancaria(String titular, double saldo) {

		this.titular = titular; // Asigno el valor del titular proporcionado
		if (saldo >= 0) {
			this.saldo = saldo; // Nombro el valor del saldo si es no negativo
		} else {
			this.saldo = 0; // Evita que  saldos sea negativos
		}

		saldo = 999.990; 
	}

	// Método getter para obtener el titular de la cuenta bancaria y el saldo de la cuenta 
	
	public String dimeTitular() {
		return " El titular de la cuenta bancaria es " + titular;
	}

	
	public double dimeSaldo() {
		return saldo;
	}

}
