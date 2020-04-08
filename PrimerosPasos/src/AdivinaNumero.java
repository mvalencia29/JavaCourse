import javax.swing.*;

public class AdivinaNumero {
    public static void main(String[] args) {
        final int aleatorio = (int)(Math.random()*100);
        int numero = 0;
        int intentos = 0;
        int puntos = 100;

        do{
            intentos++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero del 1 al 100"));
            int diferencia = 0;

            
            // si es 1 es mas bajo , si es 2 es mas alto
            String sumarOrestar = "";
            if(aleatorio > numero){
                diferencia = aleatorio - numero;
                sumarOrestar = "Subele";
            }
            else if (aleatorio < numero){
                diferencia = numero - aleatorio;
                sumarOrestar = "Bajale";
            }

            String posibilidades = "Ganasteeeee !!!!!!!!";

            if(diferencia > 0 && diferencia <= 5){
                posibilidades = "Estas muy pero muy cerca";
            }
            else if(diferencia > 5 && diferencia <= 15){
                posibilidades = "Estas cerca";
            }
            else if(diferencia > 15 && diferencia <= 35){
                posibilidades = "Estas un poco lejos";
            }
            else if(diferencia > 35 && diferencia <= 65){
                posibilidades = "Estas lejos";
            }
            else if(diferencia > 65 && diferencia <= 80){
                posibilidades = "Estas re lejos";
            }
            else if(diferencia > 80){
                posibilidades = "Estas en muy muy lejano";
            }

            JOptionPane.showMessageDialog(null, posibilidades + "\n" + sumarOrestar);
        }while(numero!=aleatorio);

        if (intentos > 5){ puntos = puntos - (intentos*2); }
        JOptionPane.showMessageDialog(null,
                "Lo lograste." + "\n" + "Tus Puntos : " + puntos + "\n" + "Intentos : " + intentos);
    }
}
