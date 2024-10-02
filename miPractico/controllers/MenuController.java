package miPractico.Controllers;

import miPractico.Views.MenuView;


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
                    case 2:
                    view.mensajeEnPantalla(" Desafío 2: Dibujar una X");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    //uso el controlador para pintar la "X"
                    unaXController.pintarX(matrizController.getMatriz());
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
