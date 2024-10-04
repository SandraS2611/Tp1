package miPractico.Controllers;

import miPractico.Views.MenuView;
import miPractico.Controllers.UnaXController;
import miPractico.Views.ValoresController;


public class MenuController {

    private MenuView view;
    private MatrizController matrizController;
    private UnaXController unaXController;


public void execute() {
        int opciones = 0;
        view = new MenuView();
        matrizController = new MatrizController();
        unaXController = new UnaXController();
        
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
