import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        //Arreglo (cajones con carpetas)
        String [] carpetas = {"Matematicas", "Español", "Ciencias", "Fisica"};
        System.out.println("====== Arreglo sencillo ======");
        for (int i = 0; i < carpetas.length; i++){
            System.out.println("Cajón " + i + ": " + carpetas[i]);
        }

        //Lista enlazada (cadena de correos)
        LinkedList<String> correos = new LinkedList<>();
        correos.add("correo_ejemplo1@correo.com");
        correos.add("correo_ejemplo2@correo.com");
        correos.add("correo_ejemplo3@correo.com");
        correos.add("correo_ejemplo4@correo.com");

        System.out.println("\n====== Lista enlazada ======");
        for (String correo : correos){
            System.out.println("Reenviado a: " + correo);
        }

        //Pila de platos
        System.out.println("\n====== Pila ======");
        Stack<String> platos = new Stack<>();

        platos.push("plato 1");
        platos.push("plato 2");
        platos.push("plato 3");

        while (!platos.isEmpty()){
            System.out.println("Lavando: " + platos.pop());
        }

        //Cola (turno en el banco)
        System.out.println("\n====== Cola ======");
        Queue<String> fila = new LinkedList<>();

        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");

        while (!fila.isEmpty()) {
            System.out.println("Atendiendo: " + fila.poll());
            //System.out.println("Atendiendo: " + fila);
        }

        //HashMap (tabla hashmap / diccionario)
        System.out.println("\n====== HashMap ======");
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");

        System.out.println("Traducción de 'gato': " + diccionario.get("gato"));
        System.out.println("Traducción de 'perro': " + diccionario.get("perro"));
        System.out.println("Traducción de 'casa': " + diccionario.get("casa"));

        //Arbol binario (organización jerárquica simple - recursiva)
        //Ejemplo conceptual usando clases anidadas
        System.out.println("\n====== Árbol binario ======");
        NodoBinario raiz = new NodoBinario("Carpeta Raiz");
        raiz.hijo = new NodoBinario("Subcarpeta 1");
        raiz.hijo.hijo = new NodoBinario("Subcarpeta 2");

        raiz.imprimir();

        //Grafo (red de amigos como matriz de adyacencia)
        System.out.println("\n====== Grafo ======");
        int [][] grafo = {
            {0, 1, 0, 1}, // nodo 0 está conectado con 1 y 3
            {1, 0, 1, 0}, // nodo 1 con 0 y 2
            {0, 1, 0, 1}, // nodo 2 con 1 y 3
            {1, 0, 1, 0}  // nodo 3 con 0 y 2
        };

        System.out.println("Nodo 0 conectado con: ");
        for (int i = 0; i < grafo[0].length;i++){
            if (grafo[0][i] == 1) {
                System.out.println("Nodo " + i);
            }
        }

        //Ejemplos de Big-O
        
        // O(1) - Acceso Constantes
        System.out.println("\n====== O(1) - Acceso Constantes ======");
        int [] numerosConstantes = {10, 20, 30, 40};
        
        System.out.println("Tenemos la siguiente lista de números");
        System.out.println("\nLa lista de números constantes que estan acomodandonse: {10, 20, 30, 40}");
        System.out.println("Recuerden que empezamos con las siguientes posiciones: {0, 1, 2, 3}\n");
        System.out.println("Posición 0: " + numerosConstantes[0]); //siempre tarda lo mismo
        System.out.println("Posición 1: " + numerosConstantes[1]);
        System.out.println("Posición 2: " + numerosConstantes[2]);
        System.out.println("Posición 3: " + numerosConstantes[3]);

        // O(n) - Recorrido Lineal
        System.out.println("\n====== O(1) - Acceso Constantes ======");
        int [] numerosLineales = {5, 9, 2, 7, 3};

        
        System.out.println("Tenemos la siguiente lista de números");
        System.out.println("\nLa lista de números constantes que estan acomodandonse: {5, 9, 2, 7, 3}");
        System.out.println("Recuerden que empezamos con las siguientes posiciones: {0, 1, 2, 3, 4}\n");
        
        /*
        //opción 1
        for(int n : numerosLineales){
            System.out.println(n); //recorre todos, uno por uno
        }*/

        //opción 2
        for (int i = 0; i < numerosLineales.length; i++) {
            System.out.println("Posición " + i + ": " + numerosLineales[i]); // Muestra el índice y el valor
        }

        // O(log n) - Búsqueda binaria (en arreglo ordenado)
        System.out.println("\n====== O(log n) - Búsqueda binaria ======");
        int [] datosBinarios = {1, 3, 5, 7, 9, 11};

        System.out.println("Tenemos la siguiente lista de números");
        System.out.println("\nLa lista de números constantes que estan acomodandonse: {1, 3, 5, 7, 9, 11}");
        System.out.println("Recuerden que empezamos con las siguientes posiciones: {0, 1, 2, 3, 4, 5}\n");

        /* Primera Opción 
        int index = Arrays.binarySearch(datosBinarios, 7);
        System.out.println("Encontrando en posición: " + index);
        */

        // Segunda opción
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese un número para buscar en el arreglo: ");
        int numero = scanner.nextInt();
        
        int index = Arrays.binarySearch(datosBinarios, numero);
        
        if (index >= 0) {
            System.out.println("El número " + numero + " se encuentra en la posición: " + index);
        } else {
            System.out.println("El número " + numero + " no se encuentra en el arreglo.");
        }
        
        scanner.close();

        // O(n²) – Comparaciones dobles (burbujas)
        System.out.println("\n ====== O(n²) - Comparaciones dobles (burbujas) ======");
        int [] datosComparaciones = {5, 2, 4, 1};

        System.out.println("Tenemos la siguiente lista de números");
        System.out.println("\nLa lista de números constantes que estan acomodandonse: {5, 2, 4, 1}");
        System.out.println("Recuerden que empezamos con las siguientes posiciones: {0, 1, 2, 3}\n");

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
