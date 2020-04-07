import java.util.Scanner;

public class EntradaEjemplo1 {
    public  static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce tu nombre");
        String nombre = entrada.nextLine();
        System.out.println("introduce tu edad");
        int edad = entrada.nextInt();
        System.out.println("===========================");
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("===========================");
    }
}
