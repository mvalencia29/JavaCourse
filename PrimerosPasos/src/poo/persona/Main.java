package poo.persona;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];
        personas[0] = new Estudiante("Daniela");
        personas[1] = new Estudiante("Ana");
        personas[2] = new Empleado("Miguel");
        personas[3] = new Gerente("Jesus");

        for(Persona p: personas){
            if(p instanceof Estudiante) {
                System.out.println("Es un estudiante");
            }
             else if(p instanceof Gerente){
                ((Gerente) p).hola();
            }

            System.out.println(p.getInfoPersona());
        }
    }
}
