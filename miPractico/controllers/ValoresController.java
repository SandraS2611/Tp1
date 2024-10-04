package miPractico.Controllers;

import miPractico.Models.ValoresModel;
import miPractico.Views.ValoresView;

public class ValoresController {
    private ValoresModel valoresModel;
    private ValoresView valoresView;

    public ValoresController() {
        this.valoresModel = new ValoresModel();
        this.valoresView = new ValoresView();
    }

    public void calcularYMostrarValores(int[][] matriz) {
        valoresModel.encontrarValores(matriz);
        int mayorValor = valoresModel.getMayorValor();
        int menorValor = valoresModel.getMenorValor();


        valoresView.pintarValoresEnMatriz(matriz, mayorValor, menorValor);
    }
}
