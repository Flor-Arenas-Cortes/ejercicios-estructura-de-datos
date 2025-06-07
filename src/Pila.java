import java.util.Stack;

public class Pila {

    //Clase que representara la Pila

    public void lavarPlatos(Stack<String> platos) {

        System.out.println("\n====== Pila ======");
        
        while (!platos.isEmpty()) {
            System.out.println("Lavando: " + platos.pop());
        }
    }
}
