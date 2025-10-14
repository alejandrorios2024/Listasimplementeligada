public class ListasSimplementeLigada {
    private Node cabeza;

    public void agregar(int data){
        //creacion de un nodo
        Node nexNode = new Node(data);
        //en este if estamos verificando si la lista esta vacia, 
        //entonces el nuevp nodo es la cabeza
        if (cabeza == null) {
            cabeza = nexNode;
            return;
        }

        //en caso de que no este vacia la lista vamos a reccorer todods los nodos
        //hasta encontrar el que tenga la referencia next en null
        Node actual = cabeza;
        while (actual.next != null) {
            actual = actual.next;
        }

        //se agrega el nuevo nodo a la referencia del ultimo
        actual.next = nexNode;

    }

    public boolean contiene(int data){
        
        Node actual = cabeza;
        while (actual != null) {
            if (actual.data == data) {
                return true;
            }else{
              actual = actual.next;  
            }
            
        }
        
        return false;
    }

    //aqui vamos a eliminar un elemento
    //eliminaremos el primer elemento 
    public void eliminar(int data){
        if (cabeza == null) {
            return;
        }

        if (cabeza.data == data) {
            cabeza = cabeza.next;
        }
        Node actual = cabeza;
        while (actual.next != null && actual.next.data != data ) {
        
            actual = actual.next;  
        }
        if (actual.next != null) {
             actual.next = actual.next.next;   
        }
        
    }

    public void imprimir(){
       Node actual = cabeza;
       while (actual != null) {
        System.out.println("" + actual.data);
        actual = actual.next;
       } 
       System.out.println("null");
    }
}
