package practica2021a.DataStructures;

import practica2021a.Estado;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class AbiertosList <E extends Estado> extends Abiertos<E> {

    private List<NodoAB> list;

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void offer(int f, E e) {

    }

    @Override
    public E poll() {
        if (list.isEmpty()) throw new EmptyStackException();
        E elem = list.get(0).getEstado();
        list.remove(0);

        List<NodoAB> list2 = new ArrayList<>(list.size());
        for (int i = 1 ; i<list.size(); i++) {
            list2.add(list.get(i));
        }
        list = list2;
        return elem;
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void ver() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
