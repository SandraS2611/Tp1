package miPractico.Views;

public class CaracolView {
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void pintarCaracolEnMatriz(int[][] matriz) {

        System.out.println("");
        System.out.println("Matriz con el Caracol pintado:\n");
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(ANSI_PURPLE_BACKGROUND + matriz[i][j] + ANSI_RESET + " ");
            }
            System.out.println();
        }
    }
}
