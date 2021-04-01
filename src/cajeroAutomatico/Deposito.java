package cajeroAutomatico;

import javax.swing.JOptionPane;

public class Deposito {

   
    public String montoDeposito;
    public Cliente cliente = new Cliente(); 
    
    public void realizarDeposito() {

        montoDeposito = JOptionPane.showInputDialog(null, "Por favor introduza el monto a depositar", "Deposito", -1);
        
        JOptionPane.showMessageDialog(null, "Su deposito fue realizado con exito por el monto de " + montoDeposito +" colones");
          
        cliente.setDinero(Integer.parseInt(montoDeposito));
        JOptionPane.showMessageDialog(null, "El balance actual de su cuenta es " + cliente.getDinero() +" colones");
        
    }
    
}
