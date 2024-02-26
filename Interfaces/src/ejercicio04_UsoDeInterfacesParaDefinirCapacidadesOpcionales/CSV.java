package ejercicio04_UsoDeInterfacesParaDefinirCapacidadesOpcionales;

// Importación de la clase JOptionPane desde el paquete javax.swing para la entrada/salida de datos mediante ventanas de diálogo
import javax.swing.JOptionPane;

// Clase CSV que implementa la interfaz Exportable
class CSV implements Exportable {

    // Implementación del método exportarDatos de la interfaz Exportable
    @Override
    public void exportarDatos() {
        JOptionPane.showMessageDialog(null, "Datos exportados a formato CSV");
    }
}
