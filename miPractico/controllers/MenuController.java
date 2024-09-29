package miPractico.controllers;

import miPractico.views.MenuView;


public class MenuController {

    private MenuView view;
    private MatrizController matrizController;

    public void execute() {
        int opciones;
        view = new MenuView();
        matrizController = new MatrizController();

        do{
            view.mostrarMenu();
            opciones = view.elegirOpciones();
            switch (opciones) {
                case 1:
                    view.mensajeEnPantalla(" Desafío 1: Valores Mínimo y Máximo");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    break;
                    case 2:
                    view.mensajeEnPantalla(" Desafío 2: Diagonales Mayor y Menor");
                    break;
                    case 3:
                    view.mensajeEnPantalla(" Desafío 3: Celdas Pares");
                    break;
                    case 4:
                    view.mensajeEnPantalla(" Desafío 4: Recorrido Caracol");
                    break;
                    case 5:
                    view.mensajeEnPantalla(" Desafío 5: Triángulo Azul");
                    break;
                    case 6:
                    view.mensajeEnPantalla(" Gracias por ver mi trabajo!!!");
                    break;
                default:
                view.mensajeEnPantalla(" La opción ingresada es incorrecta.");
                    break;
            }
        } while (6 != opciones );
    }
}
