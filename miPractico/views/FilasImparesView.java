package miPractico.Views;

public class FilasImparesView {
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m"; 
    public static final String ANSI_RESET = "\u001B[0m";    


    public void pintarFilasImparesEnMatriz(int[][] matriz) {
        System.out.println();
        System.out.println("Matriz con las filas impares pintadas: ");
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                if (i % 2 != 0) {
                    System.out.print(ANSI_PURPLE_BACKGROUND + matriz[i][j] + ANSI_RESET + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");  
                }
            }
            System.out.println();  
        }
    }
}
