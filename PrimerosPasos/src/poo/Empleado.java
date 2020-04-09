package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    private String nombreEmpleado;
    private double sueldo;
    private Date altaContrato;

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }


    public Empleado(String nombreEmpleado, double sueldo, int year, int mes, int dia){
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(year, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    public void subirSueldo(double porcentaje){
        sueldo += (sueldo*porcentaje)/100;
        System.out.println("El sueldo quedo en " + sueldo);
    }

}
