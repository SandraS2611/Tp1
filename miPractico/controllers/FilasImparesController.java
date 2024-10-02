package miPractico.Controllers;

import miPractico.Views.FilasImparesView;

public class FilasImparesController {
    private FilasImparesView filasImparesView;

    public FilasImparesController() {
        this.filasImparesView = new FilasImparesView();
    }

    public void pintarFilasImparesEnMatriz(int[][] matriz) {
        filasImparesView.pintarFilasImparesEnMatriz(matriz);
    }    

}
