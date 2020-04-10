package poo.Herencia;

public class Taxi extends Vehiculo {
    private int numeroLicencia;

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public Taxi() {
    }

    public Taxi(String matricula, String modelo, String potencia, int numeroLicencia ) {
        super(matricula, modelo, potencia);
        this.numeroLicencia = numeroLicencia;
    }
}
