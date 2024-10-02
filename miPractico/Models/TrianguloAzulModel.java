package miPractico.Models;

public class TrianguloAzulModel {

    public void pintarTrianguloAzul(int[][] matriz) {
        int filas = matriz.length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
            }
            System.out.println();
        }
    }
}
