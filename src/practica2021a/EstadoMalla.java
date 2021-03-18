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

    final int[][] matrizObstaculos;

    public EstadoMalla(int fila, int columna, int[][] matrizObstaculos) {
        this.fila = fila;
        this.columna = columna;
        this.matrizObstaculos = matrizObstaculos;
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
        List<? extends Estado> sucs = new ArrayList<>();
        if(this.columna + 1 < matrizObstaculos[0].length){ //Vecino derecho

        }
    }

    @Override
    public int coste(Estado e2) {
        return 1;
    }

    @Override
    public int h(Estado objetivo) {
        return 0;
    }

    @Override
    public void ver() {

    }
}
