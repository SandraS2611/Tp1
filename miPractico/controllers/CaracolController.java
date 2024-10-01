package miPractico.Controllers;

import miPractico.Models.CaracolModel;
import miPractico.Views.CaracolView;

public class CaracolController {
    private CaracolModel caracolModel;
    private CaracolView caracolView;

    public CaracolController() {
        this.caracolModel = new CaracolModel();
        this.caracolView = new CaracolView();
    }

    public void pintarCaracolEnMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                caracolView.pintarCaracolEnMatriz(matriz);
                System.out.println();
                caracolModel.recorridoCaracol(matriz);
                System.out.println();
                for (int k = 0; k < filas; k++) {
                    System.out.println(matriz[k][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
