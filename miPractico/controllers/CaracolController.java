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
        caracolView.pintarCaracolEnMatriz(matriz);
        System.out.println();
        caracolModel.recorridoCaracol(matriz);
        System.out.println();
}
}
