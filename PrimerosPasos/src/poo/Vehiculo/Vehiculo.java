package poo.Vehiculo;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private String potencia;

    public Vehiculo() {
        matricula= "HOL23A";
        modelo = "Bmw";
        potencia = "16CV";
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        modelo = "Bmw";
        potencia = "16CV";
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
