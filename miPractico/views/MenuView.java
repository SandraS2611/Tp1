package miPractico.views;

import utils.View;

public class MenuView {

    public int elegirOpciones() {
        int opciones;

        opciones = View.getSc().nextInt();

        return opciones;
    }

    public void mostrarMenu() {

        System.out.println("\n");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("**** Elija la opción de acuerdo al Desafío que desea ver ****");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n");
        System.out.println("Desafío 1: Valores Mínimo y Máximo");
        System.out.println("Desafío 2: Diagonales Mayor y Menor");
        System.out.println("Desafío 3: Celdas Pares");
        System.out.println("Desafío 4: Recorrido Caracol");
        System.out.println("Desafío 5: Triángulo Azul");
        System.out.println("Salir");
    }

    public void mensajeEnPantalla(String mensaje) {
        System.out.println("----------------------------------------------");
        System.out.println(mensaje);
        System.out.println("----------------------------------------------");
        System.out.println("\n");

    }
}
