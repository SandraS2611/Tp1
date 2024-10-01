package miPractico.Models;

public class CaracolModel {

    public void recorridoCaracol(int [][] matriz) {
int filas = matriz.length;

 for (int i = 0; i < filas; i++){
     for (int j = 0; j < filas; j ++) {
        System.out.println(matriz[i][j] + " ");
     }
 }
        }
    }