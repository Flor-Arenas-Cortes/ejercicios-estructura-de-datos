
import java.util.HashMap;

public class HashMapClass {

    //Clase donde aparecerá el ejercicio de HashMap
    public void traducir(HashMap<String, String> diccionario) {
        System.out.println("\n====== HashMap ======");
        System.out.println("Traducción de 'gato': " + diccionario.get("gato"));
        System.out.println("Traducción de 'perro': " + diccionario.get("perro"));
        System.out.println("Traducción de 'casa': " + diccionario.get("casa"));
    }
}
