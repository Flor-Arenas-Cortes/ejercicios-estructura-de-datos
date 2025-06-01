import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        //Arreglo (cajones con carpetas)
        String [] carpetas = {"Matematicas", "Español", "Ciencias", "Fisica"};
        for (int i = 0; i < carpetas.length; i++){
            System.out.println("Cajón " + i + ": " + carpetas[i]);
        }
    }
}
