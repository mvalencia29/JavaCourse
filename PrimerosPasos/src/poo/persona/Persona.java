package poo.persona;

public abstract class Persona {

    private static int idSiguiente = 1;
    private int id = 0;
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
        id = idSiguiente;
        idSiguiente++;
    }

    public abstract String getInfoPersona();

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

}
