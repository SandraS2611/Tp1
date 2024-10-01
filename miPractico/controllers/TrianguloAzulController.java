package miPractico.Controllers;

import miPractico.Models.TrianguloAzulModel;
import miPractico.Views.TrianguloAzulView;

public class TrianguloAzulController {
private TrianguloAzulModel trianguloAzulModel;
private TrianguloAzulView trianguloAzulView;

public TrianguloAzulController() {
    this.trianguloAzulModel = new TrianguloAzulModel();
    this.trianguloAzulView = new TrianguloAzulView();
}

public void pintarTrianguloAzul(int[][] matriz){
    trianguloAzulModel.pintarTrianguloAzul(matriz);
    trianguloAzulView.mostrarTrianguloAzul(matriz);
}

}
