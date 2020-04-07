import javax.swing.*;

public class Condicionales2 {
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion : \n1. Cuadrado \n2. Circulo \n3. Rectangulo \n4. Triangulo"));
        switch (opcion){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                JOptionPane.showMessageDialog(null,"El area del cuadrado es : " + Math.pow(lado, 2));
                break;
            case 2:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                JOptionPane.showMessageDialog(null,"El area del rectangulo es : " + Math.PI*(Math.pow(radio, 2)));
                break;
            case 3:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                JOptionPane.showMessageDialog(null,"El area del rectangulo es : " + base*altura);
                break;
            case 4:
                System.out.println("Escogiste Triangulo");
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                JOptionPane.showMessageDialog(null,"El area del Triangulo es : " + ((base*altura)/2));
                break;
            default:
                JOptionPane.showMessageDialog(null,"No escogiste una opcion valida");
        }
    }
}
