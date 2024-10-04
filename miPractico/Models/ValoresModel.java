package miPractico.Models;

public class ValoresModel {
    private int mayorValor;
    private int menorValor;

    public void encontrarValores(int[][] matriz) {
        if (matriz == null || matriz.length == 0) return;

        mayorValor = matriz[0][0];
        menorValor = matriz[0][0];

        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor > mayorValor) {
                    mayorValor = valor;
                }
                if (valor < menorValor) {
                    menorValor = valor;
                }
            }
        }
    }

    public int getMayorValor() {
        return mayorValor;
    }

    public int getMenorValor() {
        return menorValor;
    }
}
