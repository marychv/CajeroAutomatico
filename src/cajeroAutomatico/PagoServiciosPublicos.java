package cajeroAutomatico;

import javax.swing.JOptionPane;

public class PagoServiciosPublicos {

    int cnfl = 45000;
    int aya = 9000;
    int cabletica = 29900;
    int opcion;
    boolean seguir;
    public Cliente cliente = new Cliente();

    //Pago de servicios, en esta se pueden realizar el pago de 3 opciones diferentes las cuales despues de ejecutarse se resta del fondo actual. 
    

    public int pagoServicios(int saldo) {

        do {

            int escogerOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el servicio que desea pagar\n"
                    + "1. Compañia Nacional de Fuerza y Luz \n"
                    + "2. Acueductos y Alcantarillados \n"
                    + "3. Cabletica \n", "Pago de Servicios", 1));

            switch (escogerOpcion) {
                case 1:
                    int confirmacion = JOptionPane.showConfirmDialog(null, "El monto total a pagar de su factura es: " + cnfl + "\n\n ¿Desea continuar con el pago?", "Pago CNFL",1);
                    if (confirmacion == 0) {
                        if ((saldo - cnfl) >= 0) {
                            JOptionPane.showMessageDialog(null, "Su pago ha sido realizado con éxito", "Pago CNFL", 1);
                            return saldo-cnfl;

                           
                            
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Pago CNFL", 1);

                    }
                    seguir = false;
                    
                    break;
                case 2:
                    int confirmacionaya = JOptionPane.showConfirmDialog(null, "El monto total a pagar de su factura es: " + aya + "\n\n ¿Desea continuar con el pago?", "Pago AyA", 1);
                    if (confirmacionaya == 0) {
                        if ((saldo - aya) >= 0) {
                            JOptionPane.showMessageDialog(null, "Su pago ha sido realizado con éxito", "Pago AyA", 1);
                            return saldo-aya;

                           
                            
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Pago AyA", 1);

                    }
                    seguir = false;
                    
                    break;
                case 3:
                    int confirmacioncable = JOptionPane.showConfirmDialog(null, "El monto total a pagar de su factura es: " + cabletica + "\n\n ¿Desea continuar con el pago?","Pago Cabletica", 1);
                    if (confirmacioncable == 0) {
                        if ((saldo - cabletica) >= 0) {
                            JOptionPane.showMessageDialog(null, "Su pago ha sido realizado con éxito", "Pago Cabletica", 1);
                            return saldo-cabletica;

                           
                            
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Pago Cabletica", 1);

                    }
                    seguir = false;
                    
                    break;
            }

        } while (seguir);
        return saldo;
    }

}