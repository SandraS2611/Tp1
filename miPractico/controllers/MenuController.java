package miPractico.Controllers;

import miPractico.Views.MenuView;


public class MenuController {

    private MenuView view;
    private MatrizController matrizController;
    private CaracolController caracolController;


public void execute() {
        int opciones = 0;
        //int [][] matriz = matrizController.getMatriz();
        view = new MenuView();
        matrizController = new MatrizController();
        caracolController = new CaracolController();
        
        do{
            view.mostrarMenu();
            opciones = view.elegirOpciones();

            switch (opciones) {
                    case 4:
                    view.mensajeEnPantalla(" Desafío 4: Pintar un Caracol");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();                   
                    //uso el controlador para pintar el caracol
                    caracolController.pintarCaracolEnMatriz(matrizController.getMatriz());
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
