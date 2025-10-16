public class App {
    public static void main(String[] args) throws Exception {
        ListaDoblementeLigada doblementeLigada= new ListaDoblementeLigada();

        doblementeLigada.Imprimiradelante();
        doblementeLigada.Agregar(1);
        doblementeLigada.Agregar(2);
        doblementeLigada.Agregar(3);
        doblementeLigada.Agregar(5);
        System.out.println("--------------------------");
        System.out.println("Lista antes de eliminar:");
        doblementeLigada.Imprimiradelante();

        // Imprimir hacia atrás también
        System.out.println("Impresion hacia atras:");
        doblementeLigada.Imprimiratras();

        System.out.println("--------------------------");
        // Eliminar algunos elementos
        // elimina la cabeza
        doblementeLigada.Eliminar(3); 
        doblementeLigada.Eliminar(9);

        System.out.println("--------------------------");
        System.out.println("Lista despues de eliminar:");
        doblementeLigada.Imprimiradelante();

        System.out.println("Impresion hacia atras:");
        doblementeLigada.Imprimiratras();
    }
}
    
