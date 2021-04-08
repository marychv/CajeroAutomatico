package cajeroAutomatico;

import javax.swing.JOptionPane;

public class Menu {

    public boolean opciones = true;
    public int input;
    public Deposito deposito = new Deposito();
    public Cliente cliente = new Cliente();
    public PagoServiciosPublicos pagoServiciosPublicos = new PagoServiciosPublicos();
    
    public RetiroEfectivo retiroEfectivo= new RetiroEfectivo();
    

    public void menu() {

        while (opciones) {

            try {

                String opcion = JOptionPane.showInputDialog("Seleccione la opcion que desea realizar\n"
                        + "1. Realizar deposito \n"
                        + "2. Realizar consulta \n"
                        + "3. Pago de servicios \n"
                        + "4. Realizar retiro   \n"
                        + "5. Cambiar contrasena\n"
                        + "6. Salir \n");

                if (opcion != null) {

                    int escogerOpcion = Integer.parseInt(opcion);
                    switch (escogerOpcion) {
                        case 1:
                            cliente.setDinero(deposito.realizarDeposito(cliente.getDinero()));
                            input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?");
                            break;
                        case 2:

                            JOptionPane.showMessageDialog(null, "El balance actual de su cuenta es " + cliente.getDinero() + " colones");
                            input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?");

                            break;
                        case 3:
                            
                            
                            cliente.setDinero(pagoServiciosPublicos.pagoServicios(cliente.getDinero()));
                            input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?");

                            break;
                        case 4:
                            //RetiroEfectivo ret_efec= new RetiroEfectivo();
                            //ret_efec.retirar_efectivo(cliente.getDinero());
                            cliente.setDinero(retiroEfectivo.retirar_efectivo(cliente.getDinero()));
                            input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?");
                            break;

                        case 5:
                            PIN pin = new PIN();
                            pin.cambiarPin();

                        case 6:
                            opciones = false;
                            JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema bancario.");

                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto");

                    }
                    if (input == 1 || input == 2) {

                        opciones = false;
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema bancario.");

                    }

                } else {

                  opciones=false;

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto");
                e.printStackTrace();
            }

        }
    }
}
