package miPractico.Views; 

public class UnaXView {
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
 // Color para la diagonal principal
 public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
 // Color para la diagonal secundaria
    public static final String ANSI_RESET = "\u001B[0m";     // Reset de color

    public void pintarValoresEnMatriz(int[][] matriz) {
        System.out.println("");
        System.out.println("Matriz con la 'X' pintada:\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // busca la 1er diagonal 
                if (j == i) {  
                    System.out.print(ANSI_BLUE_BACKGROUND + matriz[i][j] + ANSI_RESET + " ");
                } 
                // busca la 2da diagonal
                else if (j == (matriz.length - 1 - i)) {  
                    System.out.print(ANSI_YELLOW_BACKGROUND + matriz[i][j] + ANSI_RESET + " ");
                } 
                // Si no imprime el número normalmente
                else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println(); 
        }
    }
}
