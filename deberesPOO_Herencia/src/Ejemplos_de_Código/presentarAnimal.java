package Ejemplos_de_Código;

/*2)Polimorfismo de Inclusión:*/
public class presentarAnimal {
    // Método que recibe un objeto de tipo Animal
    public static void presentarAnimal(Animal a) {
        // Llama al método emitirSonido() del objeto
        a.emitirSonido();
    }

    public static void main(String[] args) {
        // Creación de objetos de tipo Vaca y Gallo
        Vaca p = new Vaca("Highland");
        Gallo g = new Gallo("Gallo blue");

        // Llamada al método presentarAnimal con diferentes objetos
        presentarAnimal(p); // La vaca Highland hace ¡Muuu, muuu!
        presentarAnimal(g); // El gallo Gallo blue hace Quiquiriquí!!!
    }
}