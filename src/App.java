import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
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
        System.out.println(numerosConstantes[0]);
        System.out.println(numerosConstantes[1]);
        System.out.println(numerosConstantes[2]);
        System.out.println(numerosConstantes[3]);
    }
}
