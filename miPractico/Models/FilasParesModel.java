package miPractico.Models;

public class FilasParesModel {
    private int[][]matriz; 

    public void pintarFilaPar(){

        System.out.println("Filas pares pintadas: ");
        for (int i = 0; i < 10; i +=2){
            System.out.println("Fila " + i);
            for(int j = 0; j < 10; j +=2) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void encontrarFilasPares(int[][] matriz2) {
        this.matriz = matriz2;
    }

}
