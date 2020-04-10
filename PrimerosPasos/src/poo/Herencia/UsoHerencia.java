package poo.Herencia;

public class UsoHerencia {
    public static void main(String[] args) {
        Taxi spark = new Taxi(987654321);
        spark.mostrarInformacion();

        Taxi spark2 = new Taxi(987654321,"HOL-212");
        spark2.mostrarInformacion();
    }
}
