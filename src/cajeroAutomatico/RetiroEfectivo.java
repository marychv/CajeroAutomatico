package cajeroAutomatico;

import javax.swing.JOptionPane;

public class RetiroEfectivo {
      
   
    
    public Cliente cliente= new Cliente();
    
    boolean seguir;
    
    
    
    
     
    public int retirar_efectivo(int saldo){
        
      
        
         do {

            int Opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el monto que desea retirar\n"
                                                                + "a. 50000 colones\n"
                                                                + "b. 10000 colones\n"
                                                                + "c. 20000 colones\n"
                                                                + "d. Otro monto\n"));

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
