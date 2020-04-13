package poo.interfaces.propias.temporizador.segundaversion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Relog relog = new Relog(2000, true);
        relog.mostrarHora();
        JOptionPane.showMessageDialog(null, "Click en Ok para Salir");
        System.exit(0);

    }
}
