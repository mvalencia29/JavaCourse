package poo.Empleados;

import javax.swing.*;

public class UsoEmpleado {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[2];

        empleados[0]= new Empleado("Miguel");
        empleados[1]= new Empleado("Miguel", 10000, 2020, 1, 1);

        for(Empleado e : empleados){
            e.mostrarInformacion();
        }

    }
}
