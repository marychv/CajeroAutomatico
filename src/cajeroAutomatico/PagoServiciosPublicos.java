package cajeroAutomatico;

import javax.swing.JOptionPane;

public class PagoServiciosPublicos {

    int cnfl = 45000;
    int aya = 9000;
    int cabletica = 29900;
    int opcion;
    boolean seguir;
    public Cliente cliente = new Cliente();


    public int pagoServicios(int saldo) {

        do {

            int escogerOpcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el servicio que desea pagar\n"
                    + "1. Compañia Nacional de Fuerza y Luz \n"
                    + "2. Acueductos y Alcantarillados \n"
                    + "3. Cabletica \n"));

            switch (escogerOpcion) {
                case 1:
                    int confirmacion = JOptionPane.showConfirmDialog(null, "El monto total a pagar de su factura es: " + cnfl + "\n\n ¿Desea continuar con el pago?");
                    if (confirmacion == 0) {
                        if ((saldo - cnfl) >= 0) {
                            JOptionPane.showMessageDialog(null, "Su pago ha sido realizado con éxito");
                            return saldo-cnfl;

                           
                            
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");

                    }
                    seguir = false;
                    
                    break;
                case 2:
                    int confirmacionaya = JOptionPane.showConfirmDialog(null, "El monto total a pagar de su factura es: " + aya + "\n\n ¿Desea continuar con el pago?");
                    if (confirmacionaya == 0) {
                        if ((saldo - aya) >= 0) {
                            JOptionPane.showMessageDialog(null, "Su pago ha sido realizado con éxito");
                            return saldo-aya;

                           
                            
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");

                    }
                    seguir = false;
                    
                    break;
                case 3:
                    int confirmacioncable = JOptionPane.showConfirmDialog(null, "El monto total a pagar de su factura es: " + cabletica + "\n\n ¿Desea continuar con el pago?");
                    if (confirmacioncable == 0) {
                        if ((saldo - cabletica) >= 0) {
                            JOptionPane.showMessageDialog(null, "Su pago ha sido realizado con éxito");
                            return saldo-cabletica;

                           
                            
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");

                    }
                    seguir = false;
                    
                    break;
            }

        } while (seguir);
        return saldo;
    }

}