public class Array2dEjercicio {
    public static void main(String[] args) {
        final double numero = 1000;
        double acumulado = numero;
        double interes = 0.10;

        double[][] saldo = new double[5][6];

        for(int i =0; i < 5; i++){
            saldo[i][0] = numero;
            for(int j =1; j < 6; j++){
                acumulado = (acumulado*interes) + acumulado;
                saldo[i][j] = acumulado;
            }
            acumulado = numero;
            interes += 0.02;
        }

        for(double[] year : saldo){

            for(double valor : year){
                System.out.printf("%1.2f", valor);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
