
public class Grafo {

    //Clase que representará el ejercicio Grafo
    public void mostrarGrafo() {
        System.out.println("\n====== Grafo ======");
        int[][] grafo = {
            {0, 1, 0, 1},
            {1, 0, 1, 0},
            {0, 1, 0, 1},
            {1, 0, 1, 0}
        };
        System.out.println("Nodo 0 conectado con: ");
        for (int i = 0; i < grafo[0].length; i++) {
            if (grafo[0][i] == 1) {
                System.out.println("Nodo " + i);
            }
        }
    }
}
