package Ejemplos_de_Código;

public class Pareja<T, U> {
    // Atributos
    private T primero;
    private U segundo;

    // Constructor
    public Pareja(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    // Métodos para obtener y modificar los atributos
    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }

    // Método para mostrar el contenido de la pareja
    public void mostrar() {
        System.out.println("(" + primero + ", " + segundo + ")");
    }

    // Método genérico que recibe dos objetos de tipo genérico T y los intercambia
    public static <T> void intercambiar(Pareja<T, ?> pareja) {
        T aux = pareja.getPrimero();
        pareja.setPrimero((T) pareja.getSegundo());
        pareja.setSegundo(aux);
    }

    public static void main(String[] args) {
        // Creación de objetos de tipo Pareja con diferentes tipos
        Pareja<Integer, String> p1 = new Pareja<>(1, "uno");
        Pareja<Double, Boolean> p2 = new Pareja<>(3.14, true);

        // Llamada al método mostrar de cada pareja
        p1.mostrar(); // (1, uno)
        p2.mostrar(); // (3.14, true)

        // Llamada al método intercambiar con diferentes tipos
        intercambiar(p1);
        intercambiar(p2);

        // Llamada al método mostrar de cada pareja después del intercambio
        p1.mostrar(); // (uno, 1)
        p2.mostrar(); // (true, 3.14)
    }
}
