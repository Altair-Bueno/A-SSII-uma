package practica2021a.DataStructures;

import practica2021a.Estado;

import java.util.List;

public class AbiertosList <E extends Estado> extends Abiertos<E> {

    private List<E> list;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void offer(int f, E e) {

    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void ver() {

    }
}