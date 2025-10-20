public class ListaSimplementeLigada {
    private Node cabeza;

     public void agregarcancion(String nombre, int duracion) {
        Node nuevo = new Node(nombre, duracion, cabeza);
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

    public int getTotalDuracion() {
        int total = 0;
        Node actual = cabeza;
        while (actual != null) {
            total += actual.duracion;
            actual = actual.next;
        }
        return total;
    }
    
    public void eliminarCancion(String nombre) {
        if (cabeza == null) {
            System.out.println("la lista esta vacia.");
            return;
        }

        if (cabeza.nombre.equals(nombre)) {
            cabeza = cabeza.next;
            System.out.println("cancion eliminada: " + nombre);
            return;
        }

        Node actual = cabeza;
        while (actual.next != null && !actual.next.nombre.equals(nombre)) {
            actual = actual.next;
        }

        if (actual.next == null) {
            System.out.println("no se encontro la cancion: " + nombre);
        } else {
            actual.next = actual.next.next;
            System.out.println("cancion eliminada: " + nombre);
        }
    }

    public void imprimir() {
        Node cancion = cabeza;
        while (cancion != null) {
            System.out.print(cancion.nombre + "" );
            System.out.println(cancion.duracion + "");
            cancion = cancion.next;
        }
        System.out.println("la duracion total es: "+getTotalDuracion());
    }
}
