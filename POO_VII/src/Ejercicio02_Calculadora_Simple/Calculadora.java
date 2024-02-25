package Ejercicio02_Calculadora_Simple;

import javax.swing.JOptionPane;

//@author: Ana Chun Gómez De Castro DAM1

public class Calculadora {

    /*
     * Objetivo: Implementar una calculadora simple con métodos estáticos.
     * 
     * Descripción: 
     * - Crea una clase llamada Calculadora. 
     * - Añade métodos estáticos para operaciones básicas: suma, resta, multiplicación y división. 
     *   Cada método debe tomar dos parámetros numéricos y devolver el resultado. 
     * - Prueba estos métodos en el método main.
     */

    public static void main(String[] args) {
        // Métodos estáticos
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ahora dime el segundo número:"));

        // Suma
        double resultadoSuma = sumar(numero1, numero2);

        // Resta
        double resultadoResta = restar(numero1, numero2);

        // Multiplicación
        double resultadoMultiplicacion = multiplicar(numero1, numero2);

        // División
        double resultadoDivision = dividir(numero1, numero2);

        // Creamos el mensaje combinando los resultados
        String mensaje = "Suma: " + resultadoSuma + "\nResta: " + resultadoResta + "\nMultiplicación: "
                + resultadoMultiplicacion + "\nDivisión: " + resultadoDivision;

        // Mostramos el mensaje
        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Método estático para sumar dos números
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Método estático para restar dos números
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Método estático para multiplicar dos números
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método estático para dividir dos números
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
            return 0;
        }
    }
}
