package miPractico.Views;

public class FilasParesView {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void pintarFilasParesEnMatriz(int[][] matriz) {

        System.out.println();
        System.out.println("Filas Pares de la Matriz:\n");

        if (matriz != null) {
            for (int i = 0; i < matriz[i].length; i++) {
                if (i % 2 == 0) {
                    System.out.println(ANSI_CYAN + "Fila" + i + ANSI_RESET);
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (j % 2 == 0) {
                            System.out.println(ANSI_CYAN + matriz[i][j] + " " + ANSI_RESET);
                        } else {
                            System.out.println(matriz[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("La matriz está vacía. ");
        }
    }
}