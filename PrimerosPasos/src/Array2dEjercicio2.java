public class Array2dEjercicio2 {
    public static void main(String[] args) {
        double[][] array = new double[10][12];
        double acumulado = 1000000;
        System.out.println(acumulado);

        for(int i = 0; i<10; i++){
            System.out.println((i+1) + " year");
            for(int j = 0; j<12; j++){
                acumulado = (acumulado*0.10) + acumulado;
                array[i][j] = acumulado;
                System.out.printf("%1.3f",array[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
