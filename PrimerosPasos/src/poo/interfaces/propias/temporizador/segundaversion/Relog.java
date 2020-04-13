package poo.interfaces.propias.temporizador.segundaversion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class Relog {

    private boolean timbre;

    private int intervalos;

    public Relog(int intervalos, boolean timbre) {
        this.intervalos = intervalos;
        this.timbre = timbre;
    }

    public void mostrarHora(){
        ActionListener dameHora = new DameHora();
        Timer timer = new Timer(intervalos, dameHora);
        timer.start();
    }

    private class DameHora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
            System.out.println("Hora : " + formato.format(date));
            if(timbre){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

}
