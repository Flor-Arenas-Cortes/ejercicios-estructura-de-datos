
import java.util.Queue;

public class Cola {

    //Clase que representará a Cola

    public void atenderClientes(Queue<String> fila) {
        
        System.out.println("\n====== Cola ======");
        while (!fila.isEmpty()) {
            System.out.println("Atendiendo: " + fila.poll());
        }
    }
}
