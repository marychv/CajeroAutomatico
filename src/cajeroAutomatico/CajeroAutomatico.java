package cajeroAutomatico;

import javax.swing.JOptionPane;

public class CajeroAutomatico {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        int pin = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor introduzca su PIN", "PIN", 1));

        if (pin == cliente.getPIN()) {

            Menu menu = new Menu();
            menu.menu();

        } else {
            JOptionPane.showMessageDialog(null, "El PIN ingresado es incorrecto. Por favor introduzca su tarjeta de nuevo");

        }

    }

}
