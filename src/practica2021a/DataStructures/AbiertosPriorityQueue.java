package practica2021a.DataStructures;

import practica2021a.Estado;

import java.util.PriorityQueue;

public class AbiertosPriorityQueue <E extends Estado> extends Abiertos<E> {

    private PriorityQueue<E> queue;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void offer(int f, Estado estado) {

    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public void remove(Estado estado) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void ver() {

    }
}
