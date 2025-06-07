
import java.util.LinkedList;

public class ListaEnlazada {

    //Clase queva a representar la Lista Enlazada
    public void mostrarListaEnlazada(LinkedList<String> correos) {
        
        System.out.println("\n====== Lista enlazada ======");
        for (String correo : correos) {
            System.out.println("Reenviado a: " + correo);
        }
        
    }
}
