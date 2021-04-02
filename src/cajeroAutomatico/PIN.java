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
public class PIN {
    
    String clave ="1234";
    //contrasena por defecto 1234
    
    public void contrasena(){
        
        
        JOptionPane.showMessageDialog(null, "Bienvendio a nuestro cajero automatico\n\n\n ES UN PLACER ATENDERLO\n\n");
        String clave_digitada = JOptionPane.showInputDialog("DIgite la contrasena"); 
       
        
        
        if(clave_digitada.length()>4 || clave_digitada.length()<4){
            JOptionPane.showMessageDialog(null, "La clave es de 4 digitos\n intente nuevamente");
            contrasena();
            
        }
        else if(clave_digitada.equals(clave)){
            Menu menu =new Menu();
            menu.menu();
        }
        else{
            JOptionPane.showMessageDialog(null, "La clave digitada no es correcta");
            contrasena();
        }
      
    }    
        
    
     public void cambiar_pin(){
         String auxiliar;
         String clave_nueva;
         
         auxiliar = JOptionPane.showInputDialog("Digite su clave actual.");
         
         if (auxiliar.equals(clave)){
             clave_nueva= JOptionPane.showInputDialog("Digite su clave nueva");
             String clave_veri= JOptionPane.showInputDialog("Digite la clave nuevamente para verificar");
             
             
             if(clave_nueva.length()<4 || clave_nueva.length()>4){
                 JOptionPane.showMessageDialog(null, "Clave debe contener 4 caracteres");
                 int opcion= JOptionPane.showConfirmDialog(null, "Desea intentar de nuevo");
                 if (opcion == 0){
                     cambiar_pin();
                 }
                 else {
                     Menu menu= new Menu();
                     menu.menu();
                 }
             }
             if(clave_nueva.equals(clave)){
                 JOptionPane.showMessageDialog(null, "La contrasena debe ser diferente");
                 int opcion= JOptionPane.showConfirmDialog(null, "Desea intentar de nuevo");
                 if (opcion == 0){
                     cambiar_pin();
                 }
                 else {
                     Menu menu= new Menu();
                     menu.menu();
                 }
                 
             }
             
             clave = clave_nueva;
             JOptionPane.showMessageDialog(null, "Clave cambiada satisfactoriamente");
             contrasena();
                 
             }
         else{
             JOptionPane.showMessageDialog(null, "Contrasena no coincide con la anterior");
             int opcion= JOptionPane.showConfirmDialog(null, "Desea intentar de nuevo");
                 if (opcion == 0){
                     cambiar_pin();
                 }
                 else {
                     Menu menu= new Menu();
                     menu.menu();
                 }
         }
     }      
        
                
        
    
}
