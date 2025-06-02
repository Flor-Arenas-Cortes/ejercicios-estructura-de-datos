public class NodoBinario {
    String nombre;
    NodoBinario hijo;

    public NodoBinario (String nombre){
        this.nombre = nombre;
    }

    public void imprimir () {
        System.out.println(nombre);
        if (hijo != null) hijo.imprimir();
    }
}
