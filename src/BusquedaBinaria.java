
import java.util.Arrays;

public class BusquedaBinaria {
    //Clase que representará el ejericio Busqueda Bianaria

    public void buscar(int[] datosBinarios, int numero) {
        System.out.println("\n====== O(log n) - Búsqueda binaria ======");
        int index = Arrays.binarySearch(datosBinarios, numero);
        if (index >= 0) {
            System.out.println("El número " + numero + " se encuentra en la posición: " + index);
        } else {
            System.out.println("El número " + numero + " no se encuentra en el arreglo.");
        }
    }
}
