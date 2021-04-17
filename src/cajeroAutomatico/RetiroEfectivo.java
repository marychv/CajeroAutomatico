package cajeroAutomatico;

import javax.swing.JOptionPane;

public class RetiroEfectivo {

    public Cliente cliente = new Cliente();

    boolean seguir;

    public int retirarefectivo(int saldo) {

        do {

            int Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el monto que desea retirar\n"
                    + "1.     50000 colones\n"
                    + "2.     10000 colones\n"
                    + "3.     20000 colones\n"
                    + "4.     Otro monto\n", "Retiro de Efectivo",1));

            switch (Opcion) {
                case 1:
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea proceder con el retiro de 5000 colones?", "Retiro de Efectivo",1);
                    if (confirmacion == 0) {
                        if ((saldo - 5000) >= 0) {
                            JOptionPane.showMessageDialog(null, "El retiro de 5000 colones fue reaizado con exito", "Retiro de Efectivo",1);
                            return saldo - 5000;

                        } else {

                            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Retiro de Efectivo",1);

                        }
                    }
                    break;

                case 2:
                    int confirmacion1 = JOptionPane.showConfirmDialog(null, "Desea proceder con el retiro de 10000 colones?", "Retiro de Efectivo",1);
                    if (confirmacion1 == 0) {
                        if ((saldo - 10000) >= 0) {
                            JOptionPane.showMessageDialog(null, "El retiro de 10000 colones fue reaizado con éxito", "Retiro de Efectivo",1);
                            return saldo - 10000;

                        } else {

                            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Retiro de Efectivo",1);

                        }
                    }
                    break;

                case 3:
                    int confirmacion2 = JOptionPane.showConfirmDialog(null, "Desea proceder con el retiro de 20000 colones?", "Retiro de Efectivo",1);
                    if (confirmacion2 == 0) {
                        if ((saldo - 20000) >= 0) {
                            JOptionPane.showMessageDialog(null, "El retiro de 20000 colones fue reaizado con éxito", "Retiro de Efectivo",1);
                            return saldo - 20000;

                        } else {

                            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Retiro de Efectivo",1);

                        }
                    }
                    break;

                case 4:
                    int montoRetirar = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es el monto que desea retirar?", "Retiro de Efectivo",1));

                    int confirmacion3 = JOptionPane.showConfirmDialog(null, "Desea retirar " + montoRetirar + " colones?", "Retiro de Efectivo",1);
                    if (confirmacion3 == 0) {
                        if ((saldo - montoRetirar) >= 0) {
                            JOptionPane.showMessageDialog(null, "El retiro del monto de " + montoRetirar + " colones fue reaizado con éxito", "Retiro de Efectivo",1);
                            return saldo - montoRetirar;

                        } else {

                            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Retiro de Efectivo",1);

                        }
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta", "Retiro de Efectivo",1);

                    seguir = false;

                    break;

            }

        } while (seguir);
        return saldo;

    }

}
