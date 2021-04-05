package cajeroAutomatico;

import javax.swing.JOptionPane;

public class PIN {

    String clave = "1234";
    //contrasena por defecto 1234

    public void contrasena() {

        String claveDigitada = JOptionPane.showInputDialog("Digite la clave");

        if (claveDigitada.length() != 4) {
            JOptionPane.showMessageDialog(null, "La clave no es de 4 dígitos\n intente nuevamente");
            contrasena();

        } else if (claveDigitada.equals(clave)) {
            Menu menu = new Menu();
            menu.menu();
        } else {
            JOptionPane.showMessageDialog(null, "La clave digitada no es correcta");
            contrasena();
        }

    }

    public void cambiarPin() {
        String auxiliar;
        String claveNueva;

        auxiliar = JOptionPane.showInputDialog("Digite su clave actual.");

        if (auxiliar.equals(clave)) {
            claveNueva = JOptionPane.showInputDialog("Digite su clave nueva");
            String claveVerificar = JOptionPane.showInputDialog("Digite la clave nuevamente para verificar");

            if (!claveNueva.equals(claveVerificar)) {

                JOptionPane.showMessageDialog(null, "Las claves no coinciden");
                cambiarPin();
            }

            if (claveNueva.length() != 4) {
                JOptionPane.showMessageDialog(null, "Clave debe contener 4 caracteres");
                int opcion = JOptionPane.showConfirmDialog(null, "Desea intentar de nuevo");
                if (opcion == 0) {
                    cambiarPin();
                } else {
                    Menu menu = new Menu();
                    menu.menu();
                }
            }
            if (claveNueva.equals(clave)) {
                JOptionPane.showMessageDialog(null, "La clave debe ser diferente");
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea intentar de nuevo?");
                if (opcion == 0) {
                    cambiarPin();
                } else {
                    Menu menu = new Menu();
                    menu.menu();
                }

            }

            clave = claveNueva;
            JOptionPane.showMessageDialog(null, "Clave cambiada satisfactoriamente");
            contrasena();

        } else {
            JOptionPane.showMessageDialog(null, "Clave no coincide con la anterior");
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea intentar de nuevo?");
            if (opcion == 0) {
                cambiarPin();
            } else {
                Menu menu = new Menu();
                menu.menu();
            }
        }
    }

}
