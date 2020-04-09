package poo.Constantes;

public class Empleados {
    private final String nombre;
    private String seccion;

    public Empleados(String nombre){
        this.nombre = nombre;
        seccion = "Administracion";
    }

    public String getNombre() {
        return nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

}
