import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args) {
        final int restaPesoIdealHombre = 110;
        final int restaPesoIdealMujer = 120;

        String genero = "";
        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
        }while (!genero.equalsIgnoreCase("h") && !genero.equalsIgnoreCase("m"));

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));

        int pesoIdeal = 0;

        if(genero.equalsIgnoreCase("h")){
            pesoIdeal = altura - restaPesoIdealHombre;
        }else{
            pesoIdeal = altura - restaPesoIdealMujer;
        }

        JOptionPane.showMessageDialog(null, "Tu peso ideal es " + pesoIdeal + "kg");
    }
}
