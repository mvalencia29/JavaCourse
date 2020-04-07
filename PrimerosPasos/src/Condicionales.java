import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad por favor");
        int edad = sc.nextInt();
        if(edad >= 18){
            System.out.println("Eres Mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
