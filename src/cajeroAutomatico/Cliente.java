
package cajeroAutomatico;


public class Cliente {

    
 //Get y Set para obtener el dinero y el PIN que el cliente tiene en su cuenta. 
    
    
    int dinero, pin, cedula; 
    String nombre, provincia; 
    
    public Cliente() {
    }

    public Cliente(int dinero, int pin, int cedula, String nombre, String provincia) {
        this.dinero = dinero;
        this.pin = pin;
        this.cedula = cedula;
        this.nombre = nombre;
        this.provincia = provincia;
    }


   

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
       
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    
    


    
}
