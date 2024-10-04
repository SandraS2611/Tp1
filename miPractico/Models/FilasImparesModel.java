package miPractico.Models;

public class FilasImparesModel {
    private int fila;

    public void pintarFilaImpar(int[][] matriz) {
        if (fila % 2 != 0) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}