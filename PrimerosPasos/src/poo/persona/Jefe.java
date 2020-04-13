package poo.persona;

public abstract class Jefe extends Empleado{

    private String nombreJefe;

    public Jefe(String nombreJefe){
        super(nombreJefe);
    }

    public abstract void hola();

}
