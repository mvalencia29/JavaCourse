package poo.interfaces.predefinidas;

public class Carros implements Comparable {

    private static int idSiguiente = 1;
    private int id;
    private String marca;
    private String modelo;
    private String puestos;
    private int cv;
    private String year;
    private int cilindrada;
    private double precio;

    public Carros(String marca, String modelo, String puestos, int cv, String year, int cilindrada, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.puestos = puestos;
        this.cv = cv;
        this.year = year;
        this.cilindrada = cilindrada;
        this.precio = precio;
        id = idSiguiente;
        idSiguiente++;
    }

    public void showInfo(){
        System.out.println("==============================");
        System.out.println("Id : " + id );
        System.out.println("Marca : " + marca );
        System.out.println("Modelo : " + modelo );
        System.out.println("Puestos : " + puestos );
        System.out.println("CV : " + cv );
        System.out.println("Year : " + year );
        System.out.println("Cilindrada : " + cilindrada );
        System.out.println("Precio : " + precio );
        System.out.println("==============================");
    }


    @Override
    public int compareTo(Object o) {
        Carros c = (Carros)o;
        if(this.precio < c.precio){
            return 1;
        }else if(this.precio > c.precio){
            return -1;
        }
        return 0;
    }
}