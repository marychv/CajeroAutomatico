package cajeroAutomatico;

import javax.swing.JOptionPane;

public class CajeroAutomatico {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        PIN pin = new PIN();
        JOptionPane.showMessageDialog(null, "Bienvenido a nuestro cajero automático\n\n\n ES UN PLACER ATENDERLO\n\n","Cajero Automático",1);
        pin.contrasena();

    }

}
