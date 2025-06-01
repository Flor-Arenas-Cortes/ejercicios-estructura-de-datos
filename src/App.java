import java.util.LinkedList;

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

        System.out.println("====== Lista enlazada ======");
        for (String correo : correos){
            System.out.println("Reenviado a: " + correo);
        }
    }
}
