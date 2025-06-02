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
    }
}
