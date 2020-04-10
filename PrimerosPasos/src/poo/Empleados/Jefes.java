package poo.Empleados;

public class Jefes extends Empleado{

    private double incentivo;

    public Jefes(String nombreEmpleado, double sueldo, int year, int mes, int dia) {
        super(nombreEmpleado, sueldo, year, mes, dia);
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }


    public double getSueldo() {
        double sueldo = super.getSueldo();
        return sueldo + incentivo;
    }
}
