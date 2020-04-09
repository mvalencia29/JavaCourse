public class UsoArray {
    public static void main(String[] args) {
        int[] numeros = new int[30];

        for (int i = 0; i<numeros.length; i++){
            numeros[i] = (int)Math.round(Math.random()*1000000);
        }

        for(int n : numeros){
            System.out.println(n);
        }
    }
}
