package poo.enumaraciones;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Tallas.Talla.XS);
        System.out.println(Tallas.Talla.S);
        System.out.println(Tallas.Talla.M);
        System.out.println(Tallas.Talla.L);
        System.out.println(Tallas.Talla.XL);
        System.out.println(Tallas.Talla.XXL);

        System.out.println("=====================================================");

        String resultado = JOptionPane.showInputDialog("Introduce un Dia").toUpperCase();

        Dia.Dias dia = Enum.valueOf(Dia.Dias.class, resultado);

        System.out.println(dia.getApodo());

        System.out.println("=====================================================");
    }
}