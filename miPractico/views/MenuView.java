package miPractico.Views;

import utils.View;

public class MenuView {

    public int elegirOpciones() {
        int opciones;

        opciones = View.getSc().nextInt();

        return opciones;
    }

    public void mostrarMenu() {

        System.out.println("\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" **** Ingrese un número de acuerdo a la opción que desea elegir ****");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n");
        System.out.println("1- Desafío 1");
        System.out.println("2- Desafío 2");
        System.out.println("3- Desafío 3");
        System.out.println("4- Desafío 4");
        System.out.println("5- Desafío 5");
        System.out.println("6- Salir");
        System.out.println("\n");
    }

    public void mensajeEnPantalla(String mensaje) {
        System.out.println("\n");
        System.out.println("--------------------------------------------------");
        System.out.println(mensaje);
        System.out.println("--------------------------------------------------");
        System.out.println("\n");

    }
}
