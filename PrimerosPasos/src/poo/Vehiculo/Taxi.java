package poo.Vehiculo;

public class Taxi extends Vehiculo {
    private int numeroLicencia;

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public Taxi(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Taxi(int numeroLicencia, String matricula) {
        super(matricula);
        this.numeroLicencia = numeroLicencia;
    }

    public void mostrarInformacion(){
        System.out.println(getModelo());
        System.out.println(getMatricula());
        System.out.println(getPotencia());
        System.out.println(getNumeroLicencia());
        System.out.println("==============================");
    }
}
