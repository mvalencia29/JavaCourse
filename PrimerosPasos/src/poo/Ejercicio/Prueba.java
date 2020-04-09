package poo.Ejercicio;
import javax.swing.*;

public class Prueba {
    public static void main(String[] args) {
        Empleados[] empleados = new Empleados[5];
        for(int i=0; i <empleados.length; i++){
            empleados[i] = new Empleados(JOptionPane.showInputDialog("Empleados"));
        }
        for(Empleados e: empleados){
            e.mostrarDatosBasicos();
        }
    }
}
