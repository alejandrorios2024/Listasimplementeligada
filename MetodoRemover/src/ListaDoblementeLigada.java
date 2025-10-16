public class ListaDoblementeLigada {
    Node cabeza;

    public void Agregar(int data){
        Node newNode = new Node(data);
        if (cabeza == null) {
            cabeza = newNode;
            return;
        }
        //actual es el nodo de control
        //y empezamos desde la cabeza
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


    public void Eliminar(int data) {
    if (cabeza == null) {
        System.out.println("La lista está vacia");
        return;
    }

    Node actual = cabeza;

    while (actual != null && actual.data != data) {
        actual = actual.next;
    }

    if (actual == null) {
        System.out.println("El valor " + data + " no se encontro en la lista");
        return;
    }

    if (actual == cabeza) {
        cabeza = actual.next; 
        if (cabeza != null) {
            cabeza.prev = null; 
        }
        System.out.println("Se elimino el nodo con valor: " + data);
        return;
    }

    if (actual.prev != null) {
        actual.prev.next = actual.next; 
    }

    if (actual.next != null) {
        actual.next.prev = actual.prev;
    }

    System.out.println("Se elimino el nodo con valor: " + data);
}

    

}
