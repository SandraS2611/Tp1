package miPractico.Controllers;

import java.util.Scanner;
import miPractico.Models.MatrizModel;
import miPractico.Views.MatrizView;

public class MatrizController {

    private MatrizModel matriz;
    private MatrizView matrizView;
    private Scanner scanner;

    public MatrizController() {
        this.matrizView = new MatrizView();
        //matrizView = new MatrizView();
        scanner = new Scanner(System.in);
    }

    public void pedirFilasyColumnas() {
        System.out.println("Ingresa la cantidad de filas: ");
        int filas = scanner.nextInt();
        System.out.println("Ingresa la cantidad de columnas: ");
        int columnas = scanner.nextInt();

        matriz = new MatrizModel(filas, columnas);
    }

    public void generarYMostrarMatriz() {
        matriz.generarNumerosAleatorios();
        matrizView.mostrarMatriz(matriz.getDatos());
    }
 public int[][] getMatriz() {
        return matriz.getDatos();
    }

}
