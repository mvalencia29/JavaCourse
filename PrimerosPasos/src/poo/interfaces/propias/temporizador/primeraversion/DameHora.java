package poo.interfaces.propias.temporizador.primeraversion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DameHora implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Date date = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        System.out.println("Hora : " + formato.format(date));
        Toolkit.getDefaultToolkit().beep();

    }
}
