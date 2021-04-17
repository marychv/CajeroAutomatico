package cajeroAutomatico;

import javax.swing.JOptionPane;

public class PIN {

    String clave = "1234";
    //contrasena por defecto 1234
    //

    public void contrasena() {

        String claveDigitada = JOptionPane.showInputDialog(null, "Digite su clave","Clave de usuario", 1);

        if (claveDigitada.length() != 4) {
            JOptionPane.showMessageDialog(null, "La clave no es de 4 dígitos\n intente nuevamente","Clave de usuario", 1);
            contrasena();

        } else if (claveDigitada.equals(clave)) {
            Menu menu = new Menu();
            menu.menu();
        } else {
            JOptionPane.showMessageDialog(null, "La clave digitada no es correcta", "Clave de usuario", 1);
            contrasena();
        }

    }

    //Cambio de contraseña, la clave debe de ser diferente a la anterior 
    
    public void cambiarPin() {
        String auxiliar;
        String claveNueva;

        auxiliar = JOptionPane.showInputDialog(null, "Digite su clave actual", "Cambio de clave", 1);

        if (auxiliar.equals(clave)) {
            claveNueva = JOptionPane.showInputDialog(null, "Digite su nueva clave", "Cambio de clave", 1);
            String claveVerificar = JOptionPane.showInputDialog(null, "Digite la clave nuevamente para verificar", "Cambio de clave", 1);

            if (!claveNueva.equals(claveVerificar)) {

                JOptionPane.showMessageDialog(null, "Las claves no coinciden", "Cambio de clave", 1);
                cambiarPin();
            }

            if (claveNueva.length() != 4) {
                JOptionPane.showMessageDialog(null, "La clave debe contener 4 caracteres", "Cambio de clave", 1);
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea intentar de nuevo?", "Cambio de clave", 1);
                if (opcion == 0) {
                    cambiarPin();
                } else {
                    Menu menu = new Menu();
                    menu.menu();
                }
            }
            if (claveNueva.equals(clave)) {
                JOptionPane.showMessageDialog(null, "La clave debe ser diferente a la anterior", "Cambio de clave", 1);
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea intentar de nuevo?", "Cambio de clave", 1);
                if (opcion == 0) {
                    cambiarPin();
                } else {
                    Menu menu = new Menu();
                    menu.menu();
                }

            }

            clave = claveNueva;
            JOptionPane.showMessageDialog(null, "La clave ha sido cambiada satisfactoriamente", "Clave de usuario", 1);
            contrasena();

        } else {
            JOptionPane.showMessageDialog(null, "La clave no coincide con la anterior", "Cambio de clave", 1);
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea intentar de nuevo?", "Cambio de clave", 1);
            if (opcion == 0) {
                cambiarPin();
            } else {
                Menu menu = new Menu();
                menu.menu();
            }
        }
    }

}
