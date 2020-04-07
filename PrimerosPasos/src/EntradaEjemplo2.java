import javax.swing.*;

public class EntradaEjemplo2 {
    public  static void main(String[] args){
        String nombreU = JOptionPane.showInputDialog("Por favor digita tu nombre");
        int edadU =Integer.parseInt(JOptionPane.showInputDialog("Por favor digita tu edad"));

        System.out.println("Nombre : " + nombreU);
        System.out.println("Edad : " + edadU);
    }
}
