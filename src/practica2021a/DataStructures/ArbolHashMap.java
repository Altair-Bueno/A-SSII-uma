package practica2021a.DataStructures;

import practica2021a.Estado;

import java.util.HashMap;

public class ArbolHashMap<E extends Estado> extends Arbol<E>{
    private HashMap<Estado,Nodo<E>> arbol;

    public ArbolHashMap(){
        arbol = new HashMap<>();
    }

    @Override
    public void put(Nodo<E> nodo) {
        arbol.put(nodo.getEstado(),nodo);
    }

    @Override
    public boolean containsKey(Estado estado) {
        return arbol.containsKey(estado);
    }

    @Override
    public Nodo<E> get(Estado estado) {
        return arbol.get(estado);
    }

    @Override
    public void ver() {
        System.out.println(this.toString());
    }

    public String toString(){
        return arbol.toString();
    }
}
