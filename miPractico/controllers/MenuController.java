package miPractico.Controllers;

import miPractico.Views.MenuView;


public class MenuController {

    private MenuView view;
    private MatrizController matrizController;
    private ValoresController valoresController;


public void execute() {
        int opciones = 0;
        view = new MenuView();
        matrizController = new MatrizController();
        valoresController = new ValoresController();
        
        do{
            view.mostrarMenu();
            opciones = view.elegirOpciones();
            switch (opciones) {
                case 1:
                    view.mensajeEnPantalla(" Desafío 1: Pintar los Valores Mínimo y Máximo");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    valoresController.calcularYMostrarValores(matrizController.getMatriz());
                    break;

                    case 2:
                    view.mensajeEnPantalla(" Desafío 2: Dibujar una X");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    break;

                    case 3:
                    view.mensajeEnPantalla(" Desafío 3: Pintar las Celdas Pares");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    break;

                    case 4:
                    view.mensajeEnPantalla(" Desafío 4: Pintar un Recorrido Caracol");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    break;

                    case 5:
                    view.mensajeEnPantalla(" Desafío 5: Pintar un Triángulo Azul");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
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
