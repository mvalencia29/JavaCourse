package poo.Empleados;

import javax.swing.*;

public class UsoEmpleado {
    public static void main(String[] args) {
        Jefes jefe1 = new Jefes("Miguel", 1000000, 2018, 10, 17);
        System.out.println(jefe1.getSueldo());
        jefe1.setIncentivo(100000);
        System.out.println(jefe1.getSueldo());
    }
}
