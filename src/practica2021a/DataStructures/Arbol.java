package practica2021a.DataStructures;

import practica2021a.Estado;

public abstract class Arbol<E extends Estado> {
	
	public abstract void put(Nodo<E> nodo);
	
	public abstract boolean containsKey(E estado);
	
	public abstract Nodo<E> get(E estado);
	
	public abstract void ver();
}
