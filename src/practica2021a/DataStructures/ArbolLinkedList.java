package practica2021a.DataStructures;

import practica2021a.Estado;

import java.util.Iterator;
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
        return get(estado)!= null;
    }

    @Override
    public Nodo get(Estado estado) {
        Iterator<Nodo<E>> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Nodo<E> temp = iterator.next();
            if (temp.getEstado().equals(estado)) return temp;
        }
        return null;
    }

    @Override
    public void ver() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
