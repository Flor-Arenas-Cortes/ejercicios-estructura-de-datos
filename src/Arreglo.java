public class Arreglo {

    //Clase para representar el Arreglo
    public void mostrarArreglo(String[] carpetas) {

        System.out.println("====== Arreglo sencillo ======");
        for (int i = 0; i < carpetas.length; i++) {
            System.out.println("Cajón " + i + ": " + carpetas[i]);
        }
        
    }

}
