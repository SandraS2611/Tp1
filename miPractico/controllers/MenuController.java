package miPractico.Controllers;

import miPractico.Views.MenuView;
import miPractico.Controllers.UnaXController;
import miPractico.Views.ValoresController;


public class MenuController {

    private MenuView view;
    private MatrizController matrizController;
<<<<<<< HEAD
    private UnaXController unaXController;
<<<<<<< HEAD
=======
    private FilasImparesController filasImparesController;
    private TrianguloAzulController trianguloAzulController;
  
>>>>>>> TriánguloAzul
=======
>>>>>>> CeldasPares


public void execute() {
        int opciones = 0;
        //int [][] matriz = matrizController.getMatriz();
        view = new MenuView();
        matrizController = new MatrizController();
<<<<<<< HEAD
        unaXController = new UnaXController();
<<<<<<< HEAD
=======
        filasImparesController = new FilasImparesController();
        trianguloAzulController = new TrianguloAzulController();
>>>>>>> TriánguloAzul
=======
>>>>>>> CeldasPares
        
        do{
            view.mostrarMenu();
            opciones = view.elegirOpciones();

            switch (opciones) {
<<<<<<< HEAD
                case 1:
                    view.mensajeEnPantalla(" Desafío 1: Pintar los Valores Mínimo y Máximo");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    valoresController.calcularYMostrarValores(matrizController.getMatriz());
=======
                    case 3:
                    view.mensajeEnPantalla(" Desafío 3: Pintar las Filas Pares");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
<<<<<<< HEAD
                    //uso el controlador para pintar las filas pares
                    filasImparesController.pintarFilasImparesEnMatriz(matrizController.getMatriz());
=======
                    break;

                    case 4:
                    view.mensajeEnPantalla(" Desafío 4: Pintar un Recorrido Caracol");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
>>>>>>> CeldasPares
                    break;

                    case 5:
                    view.mensajeEnPantalla(" Desafío 5: Pintar un Triángulo Azul");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    //uso el controlador para pintar el triángulo azul
                    trianguloAzulController.pintarTrianguloAzul(matrizController.getMatriz());

>>>>>>> TriánguloAzul
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
