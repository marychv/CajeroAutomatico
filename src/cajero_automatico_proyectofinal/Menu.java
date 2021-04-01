package cajero_automatico_proyectofinal;

import javax.swing.JOptionPane;

public class Menu {

    boolean opciones = true;
    int input;
    Deposito deposito = new Deposito();
    
    public void menu() {

        
        while (opciones) {

            int escogerOpcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion que desea realizar\n"
                    + "1. Realizar deposito \n"
                    + "2. Realizar consulta \n"
                    + "3. Pago de servicios \n"
                    + "4. Realizar retiro   \n"
                    + "5. Salir \n"));

            switch (escogerOpcion) {
                case 1:
                    
                    deposito.realizarDeposito();
                    input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?"); 
                    break;
                case 2:
       
                    JOptionPane.showMessageDialog(null, "El balance actual de su cuenta es " + deposito.cliente.getDinero() +" colones");
                    input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?");

                    break;
                case 3:
                    input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?");

                    break;
                case 4:
                    input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?");
                    break;
                case 5:
                    opciones=false;
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema bancario."); 
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto");

            }

            if (input == 1 || input == 2) {

                opciones = false;
                JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema bancario.");

            }

        }

    }
}
