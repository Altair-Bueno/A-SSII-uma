package practica2021a;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * empty;
 *
 */

public class EstadoMalla implements Estado {
    int fila;
    int columna;

    Malla malla;

    final int[][] matrizObstaculos;

    public EstadoMalla(int fila, int columna, Malla malla) {
        this.fila = fila;
        this.columna = columna;
        this.malla = malla;
        matrizObstaculos = malla.getMalla();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoMalla that = (EstadoMalla) o;
        return fila == that.fila && columna == that.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    @Override
    public List<? extends Estado> calculaSucesores() {
        return null;
    }

    @Override
    public int coste(Estado e2) {
        return 0;
    }

    @Override
    public int h(Estado objetivo) {
        //int distanciaManhattan = (this.fila - objetivo) + ()
        return 0;//distanciaManhattan;
    }

    @Override
    public void ver() {

    }
}
