
import java.util.Scanner;

public class OrdancionBurbujas {
    //Clase que representará el ejercicio de ordenación de  burbujas

    public void ordenar(int[] datosComparaciones) {
        System.out.println("\n ====== O(n²) - Comparaciones dobles (burbujas) ======");
        Scanner scannerComparaciones = new Scanner(System.in);
        System.out.print("Por favor, ingrese un número para agregar al arreglo: ");
        if (scannerComparaciones.hasNextInt()) {
            int nuevoNumero = scannerComparaciones.nextInt();
            int[] arregloConNuevoNumero = new int[datosComparaciones.length + 1];
            System.arraycopy(datosComparaciones, 0, arregloConNuevoNumero, 0, datosComparaciones.length);
            arregloConNuevoNumero[datosComparaciones.length] = nuevoNumero;

            for (int i = 0; i < arregloConNuevoNumero.length; i++) {
                for (int j = i + 1; j < arregloConNuevoNumero.length; j++) {
                    if (arregloConNuevoNumero[i] > arregloConNuevoNumero[j]) {
                        int temp = arregloConNuevoNumero[i];
                        arregloConNuevoNumero[i] = arregloConNuevoNumero[j];
                        arregloConNuevoNumero[j] = temp;
                    }
                }
            }
            System.out.println("\nEl arreglo ordenado es:");
            for (int num : arregloConNuevoNumero) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Error: No se ha ingresado un número válido.");
        }
        scannerComparaciones.close();
    }
}
