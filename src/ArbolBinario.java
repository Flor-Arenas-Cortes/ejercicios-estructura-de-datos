
public class ArbolBinario {

    //Clase que representará el ejercicio de arbol binario
    static class NodoBinario {
        String valor;
        NodoBinario hijo;
        
        NodoBinario(String valor) {
            this.valor = valor;
        }

        public void imprimir() {
            System.out.println("Raíz: " + valor);
            if (hijo != null) {
                System.out.println("Hijo: " + hijo.valor);
            }
        }
    }

    public void mostrarArbolBinario() {
        System.out.println("\n====== Árbol binario ======");
        NodoBinario raiz = new NodoBinario("Carpeta Raiz");
        raiz.hijo = new NodoBinario("Subcarpeta 1");
        raiz.hijo.hijo = new NodoBinario("Subcarpeta 2");
        raiz.imprimir();
    }
}
