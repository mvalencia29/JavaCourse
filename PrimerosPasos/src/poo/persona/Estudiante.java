package poo.persona;

public class Estudiante extends Persona{

    private static int idSiguienteEstudiante = 1;

    private int idEstudiante;

    public Estudiante(String nombre){
        super(nombre);
        idEstudiante = idSiguienteEstudiante;
        idSiguienteEstudiante++;
    }

    @Override
    public String getInfoPersona() {
        return "Nombre : " + getNombre() + ", Id Persona : " + getId() + ", Id Estudiante : " + idEstudiante ;
    }
}
