import javax.swing.*;

public class CompruebaEmail {
    public static void main(String[] args) {

        int aprobado = 0;
        do{
            aprobado = 0;
            int arroba = 0;
            boolean punto = false;
            String email = "";

            email = JOptionPane.showInputDialog("Introduce tu email");
            for (int i = 0; i < email.length(); i++){
                if(email.charAt(i)=='@'){
                    arroba++;
                }
                if(email.charAt(i)=='.'){
                    punto = true;
                }
            }

            if(arroba == 0) {
                JOptionPane.showMessageDialog(null, "No contiene @");
                aprobado++;
            }
            else if(arroba > 1){
                JOptionPane.showMessageDialog(null, "Contiene mas de una @");
                aprobado++;
            }

            if(!punto){
                JOptionPane.showMessageDialog(null, "No contiene punto");
                aprobado++;
            }

        }while (aprobado != 0);

        JOptionPane.showMessageDialog(null,"Email Correcto");
    }
}
