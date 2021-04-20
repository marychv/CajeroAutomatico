package cajeroAutomatico;

import javax.swing.JOptionPane;

public class CajeroAutomatico {

    public static void main(String[] args) {

        Cliente cliente[] = new Cliente[8];

        cliente[0] = new Cliente(500000, 1234, 15674890, "Fabián", "Heredia");
        cliente[1] = new Cliente(650000, 5678, 15674891, "Sofía", "San José");
        cliente[2] = new Cliente(605000, 4321, 15674892, "Adriana", "Alajuela");
        cliente[3] = new Cliente(800000, 7895, 15674893, "Andrés", "Heredia");
        cliente[4] = new Cliente(300000, 3421, 15674894, "Valeria", "Cartago");
        cliente[5] = new Cliente(505000, 9087, 15674895, "Carlos", "Puntarenas");
        cliente[6] = new Cliente(450000, 5680, 15674896, "Tomás", "Limón");
        cliente[7] = new Cliente(475000, 2346, 15674897, "Elías", "Alajuela");

        JOptionPane.showMessageDialog(null, "Bienvenido a nuestro cajero automático\n\n\n Es un placer atenderlo\n\n", "Cajero Automático", 1);
        boolean seguir = true;
        while (seguir) {

            String claveDigitada = JOptionPane.showInputDialog(null, "Digite su clave", "Clave de usuario", 1);

            if (claveDigitada.length() != 4) {
                JOptionPane.showMessageDialog(null, "La clave no es de 4 dígitos\n intente nuevamente", "Clave de usuario", 1);

            }

            for (int i = 0; i < cliente.length; i++) {

                if (claveDigitada.equals(Integer.toString(cliente[i].getPin()))) {
                    Menu menu = new Menu();
                    menu.menu(cliente[i].getDinero(), cliente[i].getPin());

                    seguir = false;
                    i=cliente.length; 
                    
                } else {
                    if (i == cliente.length - 1) {
                        JOptionPane.showMessageDialog(null, "La clave digitada no es correcta", "Clave de usuario", 1);

                    }
                }

            }

        }
    }

}
