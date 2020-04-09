import java.sql.SQLOutput;

public class ArraysBidimensionales {
    public static void main(String[] args) {

        int[][] dosDimensiones = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {9, 8, 7, 6, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 9, 8, 7, 6},
                {9, 8, 7, 6, 1, 2, 3, 4, 5}
        };

        for (int i = 0;i < 4; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(dosDimensiones[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
