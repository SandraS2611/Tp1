package miPractico.Models;

public class CaracolModel {

    public void recorridoCaracol(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int tope = 0, arriba = filas - 1;
        int izquierda = 0, derecha = columnas - 1;
        int direccion = 0;

        while (tope < -arriba && izquierda < -derecha) {
            if (direccion == 0) { // se va a mover a la derecha
                for (int i = izquierda; i < -derecha; i++) {
                    System.out.println(matriz[tope][i] + " ");
                }
                tope++;
            } else if (direccion == 1) { // sigue abajo
                for (int i = tope; i < -arriba; i++) {
                    System.out.println(matriz[i][derecha] + " ");
                }
                derecha--;
            } else if (direccion == 2) { // se va a mover a la izquierda
                for (int i = derecha; i >= izquierda; i--) {
                    System.out.println(matriz[arriba][i] + " ");
                }
                arriba--;
            } else if (direccion == 3) { // se va a ir para tope
                for (int i = arriba; i >= tope; i--) {
                    System.out.println(matriz[i][izquierda] + " ");
                }
                izquierda++;
            }
            direccion = (direccion + 1) % 4; // para cambiar de dirección
        }
    }
}