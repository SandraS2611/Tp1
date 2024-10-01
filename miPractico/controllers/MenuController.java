package miPractico.Controllers;

import miPractico.Views.MenuView;


public class MenuController {

    private MenuView view;
    private MatrizController matrizController;
    private ValoresController valoresController;
    private UnaXController unaXController;
    private FilasParesCotroller filasParesCotroller;
    private CaracolController caracolController;


public void execute() {
        int opciones = 0;
        view = new MenuView();
        matrizController = new MatrizController();
        valoresController = new ValoresController();
        unaXController = new UnaXController();
        filasParesCotroller = new FilasParesCotroller();
        caracolController = new CaracolController();
        
        do{
            view.mostrarMenu();
            opciones = view.elegirOpciones();

            switch (opciones) {
                case 1:
                    view.mensajeEnPantalla(" Desafío 1: Pintar los Valores Mínimo y Máximo");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    //uso el controlador para pintar el número mas chico y el más grande
                    valoresController.calcularYMostrarValores(matrizController.getMatriz());
                    break;

                    case 2:
                    view.mensajeEnPantalla(" Desafío 2: Dibujar una X");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    //uso el controlador para pintar la "X"
                    unaXController.pintarX(matrizController.getMatriz());
                    break;

                    case 3:
                    view.mensajeEnPantalla(" Desafío 3: Pintar las Filas Pares");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    int [][] matriz = matrizController.getMatriz();
                    //uso el controlador para pintar las filas pares
                    filasParesCotroller.pintarFilasParesEnMatriz(matriz);
                    break;

                    case 4:
                    view.mensajeEnPantalla(" Desafío 4: Pintar un Caracol");
                    matrizController.pedirFilasyColumnas();
                    matrizController.generarYMostrarMatriz();
                    //uso el controlador para pintar el caracol
                    caracolController.pintarCaracolEnMatriz(matrizController.getMatriz());
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
