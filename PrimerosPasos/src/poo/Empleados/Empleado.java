package poo.Empleados;
import java.text.SimpleDateFormat;
import java.util.*;

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

    public Empleado(String nombreEmpleado){
        this(nombreEmpleado, 2000, 2000, 01, 01);
    }

    public void subirSueldo(double porcentaje){
        sueldo += (sueldo*porcentaje)/100;
        System.out.println("El sueldo quedo en " + sueldo);
    }

    public void mostrarInformacion(){
        System.out.println("Nombre : " + nombreEmpleado);
        System.out.println("Sueldo : " + sueldo);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println("Fecha del contrato : "+sdf.format(altaContrato));
        System.out.println("Fecha del contrato : " + altaContrato);
    }

}
