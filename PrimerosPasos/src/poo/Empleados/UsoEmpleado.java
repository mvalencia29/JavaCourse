package poo.Empleados;

import javax.swing.*;

public class UsoEmpleado {
    public static void main(String[] args) {
        Jefes jefeIT = new Jefes("Miguel", 55000, 2018, 10, 17);

        Empleado[] empleados = new Empleado[2];

        empleados[0] = jefeIT;
        empleados[1] = new Empleado("Miguel", 55000, 2018, 10, 17);

        jefeIT.setIncentivo(1000);
        System.out.println(empleados[0].getSueldo());
        System.out.println(empleados[1].getSueldo());
    }
}
