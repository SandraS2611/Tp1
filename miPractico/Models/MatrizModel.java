package miPractico.Models;

import java.util.Random;

import miPractico.Controllers.MatrizController;

public class MatrizModel {
    private int[][] matriz;
    private int filas;
    private int columnas;


    public static void main(String[] args) {
        MatrizController matrizController = new MatrizController();
        matrizController.pedirFilasyColumnas();
        matrizController.generarYMostrarMatriz();
    }

    public MatrizModel(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }

    public void generarNumerosAleatorios() {
        Random numeros = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = numeros.nextInt(99 - 10) + 10;
            }
        }
    }

    public int[][] getDatos() {
        return matriz;
    }
}
