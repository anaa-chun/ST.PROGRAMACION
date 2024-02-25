package Ejercicio02_Uso_de_Constructores_en_Herencia;

//@author: Ana Chun Gómez de Castro DAM1

public class Estudiante extends Persona {
    
    // Atributo específico para "Estudiante".
    private String carrera;

    // Constructor de la clase "Estudiante" que inicializa los atributos heredados y el atributo específico.
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); 
        this.carrera = carrera;
    }

    // Método getter y setter para obtener el valor del atributo "carrera".
    public String getCarrera() {
        return carrera;
    }

   
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}