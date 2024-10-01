package miPractico.Views;

public class ValoresView {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void pintarValoresEnMatriz(int[][] matriz, int mayorValor, int menorValor) {
        System.out.println("");
        System.out.println("Matriz con valores resaltados:\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == mayorValor) {
                    System.out.print(ANSI_RED + matriz[i][j] + ANSI_RESET + " ");
                } else if (matriz[i][j] == menorValor) {
                    System.out.print(ANSI_CYAN + matriz[i][j] + ANSI_RESET + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
