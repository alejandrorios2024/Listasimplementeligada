public class App {
    public static void main(String[] args) throws Exception {
        ListaSimplementeLigada lista = new ListaSimplementeLigada();

        lista.agregarcancion("ayer y hoy", 230);
        lista.agregarcancion("La incondicional", 290);
        lista.agregarcancion("Deja que salga la luna", 360);

        System.out.println();

        lista.eliminarCancion("ayer y hoy");
        lista.imprimir();

    }
}
