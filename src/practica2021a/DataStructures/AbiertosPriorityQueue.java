package practica2021a.DataStructures;

import practica2021a.Estado;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.PriorityQueue;

public class AbiertosPriorityQueue <E extends Estado> extends Abiertos<E> {

    private PriorityQueue<NodoAB> queue;

    public AbiertosPriorityQueue(){
        queue = new PriorityQueue<>();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void offer(int f, E estado) {
        queue.offer(new NodoAB(f,estado));
    }

    @Override
    public E poll() {
        if (queue.isEmpty()) throw new EmptyStackException();
        return queue.poll().getEstado();
    }

    @Override
    public void remove(Estado estado) {
        if(queue.isEmpty()) throw new EmptyStackException();
        queue.remove(estado);
    }

    @Override
    public int size() {
        if(queue.isEmpty()) return 0;
        return queue.size();
    }

    @Override
    public void ver() {
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return queue.toString();
    }
}
