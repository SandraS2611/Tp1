package miPractico.Views;

public class FilasImparesView {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void pintarFilasImparesEnMatriz(int[][] matriz) {
        System.out.println();
        System.out.println("Matriz con las filas impares pintadas: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 != 0) {
                    System.out.println(ANSI_YELLOW + i + ANSI_RESET);
                } else {
                    System.out.println(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
