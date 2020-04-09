package poo.Ejercicio;

public class Empleados {

    private static int idSiguiente = 0;
    private int id = 0;
    private final String nombre;
    private String seccion;

    public Empleados(String nombre){
        this.nombre = nombre;
        seccion = "Administracion";
        idSiguiente++;
        id = idSiguiente;
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

    public void mostrarDatosBasicos(){
        System.out.println("id : " + id);
        System.out.println("Nombre : " + nombre);
        System.out.println("Seccion : " + seccion);
    }

}
