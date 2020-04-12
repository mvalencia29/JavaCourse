package poo.persona;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];
        personas[0] = new Estudiante("Daniela");
        personas[1] = new Estudiante("Ana");
        personas[2] = new Empleado("Miguel");
        personas[3] = new Empleado("Jesus");

        for(Persona p: personas){
            System.out.println(p.getInfoPersona());
        }
    }
}
