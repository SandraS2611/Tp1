package miPractico.Views;

public class MatrizView {
    public void mostrarMatriz(int[][] datos) {
        System.out.println("");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
