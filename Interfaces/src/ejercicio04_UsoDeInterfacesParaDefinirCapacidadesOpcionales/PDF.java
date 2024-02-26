package ejercicio04_UsoDeInterfacesParaDefinirCapacidadesOpcionales;

import javax.swing.JOptionPane;

// Clase PDF que implementa la interfaz Exportable
class PDF implements Exportable {

    // Implementación del método exportarDatos de la interfaz Exportable
    @Override
    public void exportarDatos() {
        JOptionPane.showMessageDialog(null, "Datos exportados a formato PDF");
    }
}
