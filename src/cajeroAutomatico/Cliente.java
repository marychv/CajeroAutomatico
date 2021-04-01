
package cajeroAutomatico;


public class Cliente {

    final int PIN = 1234;
    int dinero = 500000;

    public Cliente() {
    }

    public int getPIN() {
        return PIN;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero += dinero;
       
    }


    
}
