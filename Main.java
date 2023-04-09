package main;

import javax.swing.JOptionPane;
import sobrecarga.SobreCargaHija;
import sobrecarga.SobreCargaPadre;

/**
 *
 * @author DevBuster
 */
public class Main {

    public static void main(String[] args) {
        // llamada al constructor
        SobreCargaPadre objeto1SobreCarga = new SobreCargaPadre("DevBuster");
        JOptionPane.showMessageDialog(null, "Usuario: " + objeto1SobreCarga.getUsuario());

        // sobrecargamos volviendo a llamar al constructor
        SobreCargaPadre objeto2SobreCarga = new SobreCargaPadre("root", 'M');
        JOptionPane.showMessageDialog(null, "Contraseña: " + objeto2SobreCarga.getContrasena() + "\n"
                + "Genero: " + objeto2SobreCarga.getContrasena());

        // sobrecarga del metodo saludar desde la clase padre o superclase
        SobreCargaPadre objeto3SobreCarga = new SobreCargaPadre();
        objeto3SobreCarga.Saludar();

        // sobrecarga del metodo saludar de la clase padre o superclase desde la clase hija o subclase
        SobreCargaPadre objeto4SobreCarga = new SobreCargaHija();
        objeto4SobreCarga.Saludar();
    }
}
