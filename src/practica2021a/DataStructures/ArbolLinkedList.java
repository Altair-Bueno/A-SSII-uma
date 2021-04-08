package practica2021a.DataStructures;

import practica2021a.Estado;

public class ArbolLinkedList extends Arbol {

    private Nodo<Estado> root;

    public ArbolLinkedList(){
        root = null;
    }

    @Override
    public void put(Nodo nodo) {

    }

    @Override
    public boolean containsKey(Estado estado) {
        return false;
    }

    @Override
    public Nodo get(Estado estado) {
        return null;
    }

    @Override
    public void ver() {

    }
}
