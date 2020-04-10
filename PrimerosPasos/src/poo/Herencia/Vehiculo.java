package poo.Herencia;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private String potencia;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public Vehiculo(String matricula, String modelo, String potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Vehiculo() {

    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPotencia() {
        return potencia;
    }
}
