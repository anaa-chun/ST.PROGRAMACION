package Ejercicio2_ClaseCuentaBancaria;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_cuentaBancaria {

	public static void main(String[] args) {
		/*
		 * Objetivo: Diseña una clase CuentaBancaria con dos propiedades privadas:
		 * titular (String) y saldo (double). Crea los métodos getter y setter para
		 * ambas propiedades.
		 * 
		 * Desafío adicional: En el setter del saldo, no permitas que el saldo sea
		 * negativo
		 */

		cuentaBancaria cuentaAna = new cuentaBancaria("Ana Chun ", 9999809.990);
		// Istancio de la clase cuentaBancaria llamada cuentaAna

		// Imprime información sobre el titular y el saldo de la cuentaAna
		System.out.println(cuentaAna.dimeTitular());
		System.out.println(cuentaAna.dimeSaldo());

	}

}
