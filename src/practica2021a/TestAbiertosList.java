package practica2021a;

import practica2021a.DataStructures.*;

public class TestAbiertosList {
    public static void main(String[] args) {
        Abiertos<EstadoMalla> mallaAbiertos = new AbiertosList();
        Malla malla = new Malla(7,5,5,4);
        EstadoMalla e1 = new EstadoMalla(2,4,malla);
        EstadoMalla e2 = new EstadoMalla(0, 3, malla);
        EstadoMalla e3 = new EstadoMalla(2,3,malla);
        EstadoMalla inicial = malla.getEstadoInicial();
        mallaAbiertos.offer(3,inicial);
        mallaAbiertos.offer(2,e1);
        mallaAbiertos.offer(0, e2);
        mallaAbiertos.ver();
        mallaAbiertos.remove(e3);
        mallaAbiertos.ver();
        mallaAbiertos.remove(e2);
        mallaAbiertos.ver();
        mallaAbiertos.remove(e1);
        mallaAbiertos.ver();
    }
}
