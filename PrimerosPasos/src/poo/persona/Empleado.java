package poo.persona;

public class Empleado extends Persona {

    private static int idSiguienteEmpleado = 1;

    private int idEmpleado;

    public Empleado(String nombre){
        super(nombre);
        idEmpleado = idSiguienteEmpleado;
        idSiguienteEmpleado++;
    }

    @Override
    public String getInfoPersona() {
        return "Tipo Persona : Empleado, Nombre : " + getNombre() + ", Id Persona : " + getId() + ", Id Empleado : " + idEmpleado ;
    }
}
