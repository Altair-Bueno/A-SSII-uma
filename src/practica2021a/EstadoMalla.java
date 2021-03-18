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

    public EstadoMalla(int fila, int columna, Malla malla) {
        this.fila = fila;
        this.columna = columna;
        this.malla = malla;
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
        List<EstadoMalla> sucs = new ArrayList<>();
        int[][] m = malla.getMalla();
        if(this.columna + 1 < malla.getColumnas()){ //Vecino derecho
           if(m[this.fila][this.columna+1] == 0){ //¿Está libre?
               sucs.add(new EstadoMalla(this.fila,this.columna+1,malla));
           }
        } else if(this.columna - 1 >= 0){ //Vecino izquierdo
            if(m[this.fila][this.columna+1] == 0){ //¿Está libre?
                sucs.add(new EstadoMalla(this.fila,this.columna-1,malla));
            }
        } else if(this.fila+1 < malla.getFilas() ){ //Hacia arriba
            if(m[this.fila][this.columna+1] == 0){ //¿Está libre?
                sucs.add(new EstadoMalla(this.fila+1,this.columna,malla));
            }
        } else if(this.fila-1 >= 0){
            if(m[this.fila][this.columna+1] == 0){ //¿Está libre?
                sucs.add(new EstadoMalla(this.fila-1,this.columna,malla));
            }
        }
        return sucs;
    }

    @Override
    public int coste(Estado e2) {
        return 1;
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
