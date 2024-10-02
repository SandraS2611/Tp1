package miPractico.Controllers;

import miPractico.Views.MenuView;


public class MenuController {

    private MenuView view;
    private MatrizController matrizController;
    private FilasImparesController filasImparesController;
    private TrianguloAzulController trianguloAzulController;
  


public void execute() {
        int opciones = 0;
        //int [][] matriz = matrizController.getMatriz();
        view = new MenuView();
        matrizController = new MatrizController();
        filasImparesController = new FilasImparesController();
        trianguloAzulController = new TrianguloAzulController();
        
        do{
            view.mostrarMenu();
            opciones = view.elegirOpciones();

            switch (opciones) {
                    case 3:
                    view.mensajeEnPantalla(" Desafío 3: Pintar las Filas Pares");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    //uso el controlador para pintar las filas pares
                    filasImparesController.pintarFilasImparesEnMatriz(matrizController.getMatriz());
                    break;

                    case 5:
                    view.mensajeEnPantalla(" Desafío 5: Pintar un Triángulo Azul");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    //uso el controlador para pintar el triángulo azul
                    trianguloAzulController.pintarTrianguloAzul(matrizController.getMatriz());

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
