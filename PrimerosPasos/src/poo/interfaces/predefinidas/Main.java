package poo.interfaces.predefinidas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Carros[] carros = new Carros[5];

        carros[0] = new Carros("Audi", "A5", "5", 200, "2020", 2000, 168);
        carros[1] = new Carros("Bmw", "SERIE 4", "5", 160, "2020", 3000, 140);
        carros[2] = new Carros("Bmw", "X6", "7", 500, "2019", 4000, 300);
        carros[3] = new Carros("Mercedes Benz", "Clase C", "4", 149, "2017", 2500, 155);
        carros[4] = new Carros("Mercedes Benz", "GLC", "6", 300, "2018", 3467, 220);

        Arrays.sort(carros);

        for(Carros c : carros){
            c.showInfo();
        }
    }
}
