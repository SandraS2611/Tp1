package miPractico.controllers;

import java.util.Scanner;
import miPractico.views.MatrizView;
import utils.Matriz;

public class MatrizController {

    private Matriz matriz;
    private MatrizView matrizView;
    private Scanner scanner;

    public MatrizController() {
        matrizView = new MatrizView();
        scanner = new Scanner(System.in);
    }

    public void pedirFilasyColumnas() {
        System.out.println("Ingresa la cantidad de filas: ");
        int filas = scanner.nextInt();
        System.out.println("Ingresa la cantidad de columnas: ");
        int columnas = scanner.nextInt();

        matriz = new Matriz(filas, columnas);
    }

    public void generarYMostrarMatriz() {
        matriz.generarNumerosAleatorios();
        matrizView.mostrarMatriz(matriz.getDatos());
    }
}
