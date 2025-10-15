public class ListaDoblementeLigada {
    Node cabeza;

    public void Agregar(int data){
        Node newNode = new Node(data);
        if (cabeza == null) {
            cabeza = newNode;
            return;
        }
        //actual es el nodo de control
        //y empezamos desde la cabecera
        Node actual = cabeza;
        while (actual.next != null) {
            actual = actual.next;
        }
        actual.next = newNode;//guarda el nuevo nodo
        newNode.prev = actual; //en el nuevo nodo, guarda la referencia del nodo anterior (previo)
    }


    public void Imprimiradelante(){
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        Node actual = cabeza;
        while (actual != null) {
            System.out.println(actual.data);
            actual = actual.next;

        }
        System.out.println("null");
    }

    public void Imprimiratras(){
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        Node actual = cabeza;
        while (actual.next != null) {
            actual = actual.next;

        }
        while (actual != null) {
            System.out.println(actual.data);
            actual = actual.prev;
        }
        System.out.println("null");
    }

}
