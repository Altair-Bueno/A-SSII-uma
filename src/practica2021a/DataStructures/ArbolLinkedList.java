package practica2021a.DataStructures;

import practica2021a.Estado;

import java.util.LinkedList;

public class ArbolLinkedList<E extends Estado> extends Arbol<E> {

    private LinkedList<Nodo<E>> linkedList;

    public ArbolLinkedList(){
        linkedList = new LinkedList<>();
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
