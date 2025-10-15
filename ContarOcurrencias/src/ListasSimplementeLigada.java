public class ListasSimplementeLigada {
    private Node cabeza;

    public void agregar(int data) {
        Node nuevo = new Node(data);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Node actual = cabeza;
        while (actual.next != null) {
            actual = actual.next;
        }
        actual.next = nuevo;
    }

    public int contarOcurrencias(int x) {
        int contador = 0;
        Node actual = cabeza;
        while (actual != null) {
            if (actual.data == x) {
                contador++;
            }
            actual = actual.next;
        }
        return contador;
    }

    public void imprimir() {
        Node actual = cabeza;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }
}

