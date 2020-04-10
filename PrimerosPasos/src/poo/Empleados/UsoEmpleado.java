package poo.Empleados;

import javax.swing.*;

public class UsoEmpleado {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new Jefes("Miguel", 55000, 2018, 10, 17);
        empleados[1] = new Empleado("Miguel", 55000, 2018, 10, 17);
        Jefes jefa = (Jefes)empleados[0];
        jefa.setIncentivo(450000);

        for(Empleado e : empleados){
            System.out.println(e.getSueldo());
        }
    }
}
