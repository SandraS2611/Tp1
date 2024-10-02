package miPractico.Models;

public class TrianguloAzulModel {

    public void pintarTrianguloAzul(int[][] matriz) {
        int filas = matriz.length;

        // la base de mi triangulo
        int base = (filas * 2) - 1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }

        // pinto la base
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < (2 * i + 1); j++) {
                int centro = (base / 2) - i + j;

                if (centro >= 0 && centro < matriz[i].length) {
                    matriz[i][centro] = 1;
                }
            }
        }
    }

}
