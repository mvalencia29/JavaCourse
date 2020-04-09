package poo.Empleados;

import javax.swing.*;

public class UsoEmpleado {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[3];

        for(int i =0; i<empleados.length; i++){
            empleados[i]= new Empleado(JOptionPane.showInputDialog("Nombre Empleado :"),Double.parseDouble(JOptionPane.showInputDialog("Sueldo")),
                    Integer.parseInt(JOptionPane.showInputDialog("Agno de Inicio")), Integer.parseInt(JOptionPane.showInputDialog("Mes de Inicio")), Integer.parseInt(JOptionPane.showInputDialog("Dia de Inicio")));
        }

        for(Empleado e : empleados){
            e.mostrarInformacion();
        }

    }
}
