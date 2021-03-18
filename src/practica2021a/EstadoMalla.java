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
    private final int fila;
    private final int columna;

    private Malla malla;

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
        if (objetivo instanceof EstadoMalla) {
            EstadoMalla estadoMalla = (EstadoMalla) objetivo;
            return Math.abs(estadoMalla.getColumna() - columna) + Math.abs(estadoMalla.getFila() - fila);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void ver() {

    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
}
