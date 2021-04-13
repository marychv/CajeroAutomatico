/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroAutomatico;

import javax.swing.JOptionPane;

/**
 *
 * @author Moisés
 */
public class retiro_efectivo {
    
     public Cliente cliente= new Cliente();
    
    boolean seguir;
    
    
    
    
     
    public int retirar_efectivo(int saldo){
        
      
        
         do {

            int Opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el monto que desea retirar\n"
                                                                + "1.     50000 colones\n"
                                                                + "2.     10000 colones\n"
                                                                + "3.     20000 colones\n"
                                                                + "4.     Otro monto\n"));

            switch (Opcion) {
                case 1:
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea retirar 5000 colones?");
                    if (confirmacion == 0) {
                        if ((saldo -5000)>=0) {
                            JOptionPane.showMessageDialog(null, "El retiro de 5000 fue reaizado con exito");
                            return saldo-5000;

                         }
                        else {
                        
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");

                    }
                    } 
                    break;
                 
                case 2:
                    int confirmacion1 = JOptionPane.showConfirmDialog(null, "Desea retirar 10000 colones?");
                    if (confirmacion1 == 0) {
                        if ((saldo -10000)>=0) {
                            JOptionPane.showMessageDialog(null, "El retiro de 10000 fue reaizado con exito");
                            return saldo-10000;

                         }
                        else {
                        
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");

                    }
                    }
                    break;
                    
                case 3:
                    int confirmacion2 = JOptionPane.showConfirmDialog(null, "Desea retirar 20000 colones?");
                    if (confirmacion2 == 0) {
                        if ((saldo -20000)>=0) {
                            JOptionPane.showMessageDialog(null, "El retiro de 20000 fue reaizado con exito");
                            return saldo-20000;

                         }
                        else {
                        
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");

                    }
                    } 
                    break;
                    
                case 4:
                    int montoRetirar= Integer.parseInt(JOptionPane.showInputDialog("Cual es el monto que desea retirar?"));
                    
                    int confirmacion3 = JOptionPane.showConfirmDialog(null, "Desea retirar "+ montoRetirar+ " colones?");
                    if (confirmacion3 == 0) {
                        if ((saldo -montoRetirar)>=0) {
                            JOptionPane.showMessageDialog(null, "El retiro de " +montoRetirar+" fue reaizado con exito");
                            return saldo-montoRetirar;

                         }
                        else {
                        
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");

                    }
                    } 
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcion ingresada es incorrecta");
                    
                            
                       
                    seguir = false;
                    
                    break;

            }

        } while (seguir);
        return saldo;
        
            
            
            
        
        
        
        
       
    
}

    
}
