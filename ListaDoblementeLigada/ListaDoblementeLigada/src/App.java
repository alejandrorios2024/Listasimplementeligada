public class App {
    public static void main(String[] args) throws Exception {
        ListaDoblementeLigada doblementeLigada= new ListaDoblementeLigada();

        doblementeLigada.Imprimiradelante();
        doblementeLigada.Agregar(1);
        doblementeLigada.Agregar(2);
        doblementeLigada.Agregar(3);
        doblementeLigada.Agregar(5);
        System.out.println("--------------------------");
        doblementeLigada.Imprimiradelante();
        doblementeLigada.Imprimiratras();

    }   
}
