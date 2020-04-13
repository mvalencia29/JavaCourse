package poo.interfaces.propias.temporizador;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        ActionListener hora = new DameHora();
        Timer miTemporizador = new Timer(10000, hora);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "");
        System.exit(0);
    }
}
