package poo.persona;

public class Gerente extends Jefe {

    public Gerente(String nombreJefe) {
        super(nombreJefe);
    }

    @Override
    public void hola() {
        System.out.println("Gerente");
    }
}
