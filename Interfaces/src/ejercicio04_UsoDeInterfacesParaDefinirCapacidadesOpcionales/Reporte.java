package ejercicio04_UsoDeInterfacesParaDefinirCapacidadesOpcionales;

import javax.swing.JOptionPane;

// Clase Reporte que implementa la interfaz Exportable
class Reporte implements Exportable {


    // Implementación del método exportarDatos de la interfaz Exportable
    @Override
    public void exportarDatos() {
        JOptionPane.showMessageDialog(null, "Reporte exportado");
    }
}
