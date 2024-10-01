package miPractico.Controllers;

import miPractico.Models.UnaXModel;
import miPractico.Views.UnaXView;

public class UnaXController {
    private UnaXModel unaXModel;
    private UnaXView unaXView;

    public UnaXController() {
        this.unaXModel = new UnaXModel();
        this.unaXView = new UnaXView();
    }

    public void pintarX(int[][] matriz) {
        unaXModel.pintarEnDiagonal(matriz);
        unaXView.pintarValoresEnMatriz(matriz);
    }
}
