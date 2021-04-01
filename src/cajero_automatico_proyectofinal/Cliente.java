/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automatico_proyectofinal;

/**
 *
 * @author Administrador
 */
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
