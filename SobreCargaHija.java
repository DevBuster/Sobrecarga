package sobrecarga;

import javax.swing.JOptionPane;

/**
 *
 * @author DevBuster
 */
public class SobreCargaHija extends SobreCargaPadre {

    // sobrecarga del metodo saludar
    @Override
    public void Saludar() {
        JOptionPane.showMessageDialog(null, "Hola, soy una sobrecarga del metodo saludar de la clase padre o superclase ");
    }
}
