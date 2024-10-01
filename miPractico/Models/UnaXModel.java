package miPractico.Models;

import java.util.Random;

public class UnaXModel {
    
    public void pintarEnDiagonal(int[][] matriz) {
        int diagonal = matriz.length;
        Random random = new Random();

        for (int i = 0; i < diagonal; i++) {
            // me mustro la 1er diagonal, la marco con 1
            matriz[i][i] = random.nextInt(100);

            // muestro la 2da diagonal, la marco con 2
            matriz[i][diagonal - 1 - i] = random.nextInt(100);
        }
    }
}
