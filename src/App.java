import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {
    Arreglo arreglo = new Arreglo();
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        Pila pila = new Pila();
        Cola cola = new Cola();
        ArbolBinario arbolBinario = new ArbolBinario();
        Grafo grafo = new Grafo();
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        OrdancionBurbujas ordenamientoBurbuja = new OrdancionBurbujas();
        HashMapClass diccionario = new HashMapClass();

        // Ejemplo Arreglo
        String[] carpetas = {"Matematicas", "Español", "Ciencias", "Fisica"};
        arreglo.mostrarArreglo(carpetas);

        // Ejemplo Lista Enlazada
        LinkedList<String> correos = new LinkedList<>();
        correos.add("correo_ejemplo1@correo.com");
        correos.add("correo_ejemplo2@correo.com");
        listaEnlazada.mostrarListaEnlazada(correos);

        // Ejemplo Pila
        Stack<String> platos = new Stack<>();
        platos.push("plato 1");
        platos.push("plato 2");
        platos.push("plato 3");
        pila.lavarPlatos(platos);

        // Ejemplo Cola
        Queue<String> fila = new LinkedList<>();
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");
        cola.atenderClientes(fila);

        // Ejemplo Árbol Binario
        arbolBinario.mostrarArbolBinario();

        // Ejemplo Grafo
        grafo.mostrarGrafo();

        // Ejemplo Búsqueda Binaria
        int[] datosBinarios = {1, 3, 5, 7, 9, 11};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese un número para buscar en el arreglo: ");
        int numero = scanner.nextInt();
        busquedaBinaria.buscar(datosBinarios, numero);

        // Ejemplo Ordenamiento por Burbujas
        int[] datosComparaciones = {5, 2, 4, 1};
        ordenamientoBurbuja.ordenar(datosComparaciones);

        // Ejemplo HashMap
        HashMap<String, String> diccionarioMap = new HashMap<>();
        diccionarioMap.put("gato", "cat");
        diccionarioMap.put("perro", "dog");
        diccionarioMap.put("casa", "house");
        diccionario.traducir(diccionarioMap);
    
    }
}
