package ejercicio05_CombinaciónDeInterfacesParaAmpliarFuncionalidades;

import javax.swing.JOptionPane;

// Clase Datos que implementa la interfaz Filtrable
class Datos implements Filtrable {

    // Implementación del método filtrar de la interfaz Filtrable
    @Override
    public void filtrar() {
        JOptionPane.showMessageDialog(null, "Filtrando los datos 📊");
    }

    // Implementación del método ordenar de la interfaz Filtrable
    @Override
    public void ordenar() {
        JOptionPane.showMessageDialog(null, "Ordenando los datos 🔍");
    }
}
