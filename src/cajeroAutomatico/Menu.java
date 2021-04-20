package cajeroAutomatico;

import javax.swing.JOptionPane;

public class Menu {

    public boolean opciones = true;
    public int input;
    public Deposito deposito = new Deposito();
    public Cliente cliente = new Cliente();
    public PagoServiciosPublicos pagoServiciosPublicos = new PagoServiciosPublicos();
   
    public RetiroEfectivo retiroEfectivo= new RetiroEfectivo();
    
//Menú del cajero automático para realizar diferentes tipos de consultas
    
    public void menu(int dinero, int pinActual) {

         
        
        while (opciones) {

            try {

                String opcion = JOptionPane.showInputDialog(null, "Seleccione la opción que desea realizar\n"
                        + "1. Realizar depósito \n"
                        + "2. Realizar consulta \n"
                        + "3. Pago de servicios \n"
                        + "4. Realizar retiro   \n"
                        + "5. Cambiar contraseña\n"
                        + "6. Salir \n", "Cajero Automático", 1);

                if (opcion != null) {

                    int escogerOpcion = Integer.parseInt(opcion);
                    switch (escogerOpcion) {
                        case 1:
                            dinero= deposito.realizarDeposito(dinero);
                            input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?");
                            break;
                        case 2:

                            JOptionPane.showMessageDialog(null, "El balance actual de su cuenta es " + dinero + " colones", "Consulta de saldo", 1);
                            input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?", "Cajero Automático", 1);

                            break;
                        case 3:
                            
                            
                            dinero= pagoServiciosPublicos.pagoServicios(dinero);
                            input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?", "Cajero Automático", 1);

                            break;
                        case 4:
                            //RetiroEfectivo ret_efec= new RetiroEfectivo();
                            //ret_efec.retirar_efectivo(cliente.getDinero());
                            dinero = retiroEfectivo.retirarEfectivo(dinero);
                            input = JOptionPane.showConfirmDialog(null, "Desea realizar otro consulta?", "Cajero Automático", 1);
                            break;

                        case 5:
                            PIN pin = new PIN();
                            pin.cambiarPin(Integer.toString(pinActual));
                            break;

                        case 6:
                            opciones = false;
                            JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema bancario","Cajero Automático", 1);

                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto", "Cajero Automático", 1);

                    }
                    if (input == 1 || input == 2) {

                        opciones = false;
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema bancario", "Cajero Automático", 1);

                    }

                } else {

                  opciones=false;

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto", "Cajero Automático", 1);
                e.printStackTrace();
            }

        }
    }
}
