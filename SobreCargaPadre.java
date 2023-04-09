package sobrecarga;

import javax.swing.JOptionPane;

/**
 *
 * @author DevBuster
 */
public class SobreCargaPadre {

    public String usuario;
    private String contrasena;
    private char genero;

    public SobreCargaPadre() {
    }

    public SobreCargaPadre(String usuario) {
        this.usuario = usuario;
    }

    public SobreCargaPadre(String contrasena, char genero) {
        this.contrasena = contrasena;
        this.genero = genero;
    }

    public void Saludar() {
        JOptionPane.showMessageDialog(null, "Hola, soy el metodo saludar de la clase padre");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
