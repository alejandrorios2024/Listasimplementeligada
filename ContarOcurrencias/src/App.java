public class App {
    public static void main(String[] args) {
        ListasSimplementeLigada lista = new ListasSimplementeLigada();

        lista.agregar(3);
        lista.agregar(1);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(3);

        int numeroBuscado = 3;

        int ocurrencias = lista.contarOcurrencias(numeroBuscado);
        System.out.println("El numero " + numeroBuscado + " aparece "+ocurrencias+" veces.");

        System.out.println("Contenido de la lista:");
        lista.imprimir();
    }
}