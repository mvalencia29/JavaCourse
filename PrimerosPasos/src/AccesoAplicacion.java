import javax.swing.*;

public class AccesoAplicacion {
    public static void main(String[] args) {
        final String Password = "M1";
        boolean acceptPassword = false;
        while(!acceptPassword){
            String dialedPassword = JOptionPane.showInputDialog("Por favor digita tu contraseña");
            if(dialedPassword.equals(Password)){ acceptPassword = true; }
            else{ JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Error", JOptionPane.ERROR_MESSAGE); }
        }
        JOptionPane.showMessageDialog(null, "Contraseña Correcta", "Correcto", JOptionPane.INFORMATION_MESSAGE);
    }
}
