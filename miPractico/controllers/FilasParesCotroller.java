package miPractico.Controllers;

import miPractico.Models.FilasParesModel;
import miPractico.Views.FilasParesView;

public class FilasParesCotroller {
    private FilasParesView filasParesView;
    private FilasParesModel filasParesModel;
   
   
    public FilasParesCotroller() {
        this.filasParesView = new FilasParesView();
        this.filasParesModel = new FilasParesModel();
    }

    public void pintarFilasParesEnMatriz(int [][] matriz) {
        filasParesModel.encontrarFilasPares(matriz);
        filasParesView.pintarFilasParesEnMatriz(matriz);
    }  

}
