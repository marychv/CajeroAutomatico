package cajeroAutomatico;

import javax.swing.JOptionPane;

public class Deposito {

   
    public String montoDeposito;
    
    public Cliente cliente = new Cliente(); 
    
    public int realizarDeposito(int saldo) {

        montoDeposito = JOptionPane.showInputDialog(null, "Por favor introduzca el monto a depositar", "Depósito", -1);
        
        JOptionPane.showMessageDialog(null, "Su depósito fue realizado con éxito por el monto de " + montoDeposito +" colones");
        JOptionPane.showMessageDialog(null, "El balance actual de su cuenta es " + (saldo + Integer.parseInt(montoDeposito))+ " colones"); 
        return saldo + Integer.parseInt(montoDeposito);
    }
    
    
}
