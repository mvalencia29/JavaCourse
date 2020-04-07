import javax.swing.*;

public class EntradaEjemplo3 {
    public  static void main(String[] args){
        ///Formatos para un double
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));

        System.out.print("La raiz es : ");
        System.out.printf("%1.2f", Math.sqrt(x));
    }
}
