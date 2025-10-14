public class App {
    public static void main(String[] args) throws Exception {
        
        ListasSimplementeLigada list = new ListasSimplementeLigada();
        list.agregar(1);
        list.agregar(2);
        list.agregar(3);
        list.agregar(4);
        //imprimir la lista original
        list.imprimir();
        //imprimir eliminando el tercer elemento
        list.eliminar(3);
        list.imprimir();



    }
}
