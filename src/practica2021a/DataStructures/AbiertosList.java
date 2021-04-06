package practica2021a.DataStructures;

import practica2021a.Estado;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class AbiertosList<E extends Estado> extends Abiertos<E> {

    private List<NodoAB> list;

    public AbiertosList() {
        list = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void offer(int f, E e) {
        NodoAB nodo = new NodoAB(f, e);
        if (isEmpty()) {
            list.add(nodo);
        } else if(list.size() == 1) {
            if(list.get(0).compareTo(nodo) > 0){
                NodoAB temp = list.get(0);
                list.add(0, nodo);
                list.add(temp);
            }else{
                list.add(nodo);
            }
        } else {
            int i = 0;
            while (i < list.size() && list.get(i).compareTo(nodo) < 0){
                i++;
            }
            if(i == list.size()-1){
                list.add(nodo);
            }else{
                for(int cont = list.size(); cont >= i; i--){
                    list.add(cont, list.get(cont-1));
                }
                list.add(i-1, nodo);
            }
        }
    }

    @Override
    public E poll() {
        if (list.isEmpty()) throw new EmptyStackException();
        E elem = list.get(0).getEstado();
        list.remove(0);

        List<NodoAB> list2 = new ArrayList<>(list.size());
        for (int i = 1; i < list.size(); i++) {
            list2.add(list.get(i));
        }
        list = list2;
        return elem;
    }

    @Override
    public void remove(E e) {
        int i = 0;
        while(i < list.size() && !list.get(i).getEstado().equals(e)){
            i++;
        }
        if(i != list.size() - 1){
            list.remove(i);
            for(int j = i; j < list.size()-1; j++){
                list.add(j, list.get(j+1));
            }
        }
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
