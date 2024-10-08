package miPractico.Views;

public class TrianguloAzulView {
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void mostrarTrianguloAzul(int[][] matriz) {
        System.out.println();
        System.out.println("Triángulo Azul pintado en la Matriz: ");
        System.out.println();

        if (matriz != null) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == 1) {
                        System.out.println(ANSI_BLUE_BACKGROUND + matriz[i][j] + ANSI_RESET + " ");
                    } else {
                        System.out.println(matriz[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
