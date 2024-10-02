package miPractico.Models;

public class TrianguloAzulModel {

    public void pintarTrianguloAzul(int[][] matriz) {
        int filas = matriz.length;

        // pinto el triangulo
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < (2 * i + 1); j++) {
                
                int centro = (filas - 1) - i + j;
                if (centro >= 0 && centro < matriz[i].length) {
                    matriz[i][centro] = 1;
                }
            }
        }
    }

}
