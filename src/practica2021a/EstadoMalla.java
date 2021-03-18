package practica2021a;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * Utilizado para representar el espacio de estados de una malla 4-vecinos
 *
 */

public class EstadoMalla implements Estado {
    private final int fila;
    private final int columna;

    private final Malla malla;

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

        if(this.columna - 1 >= 0){ //Vecino izquierdo
            if(m[this.fila][this.columna-1] != Malla.WALL){
                sucs.add(new EstadoMalla(this.fila,this.columna-1,malla));
            }
        }

        if(this.fila-1 >= 0){ //Vecino arriba
            if(m[this.fila-1][this.columna] != Malla.WALL){
                sucs.add(new EstadoMalla(this.fila-1,this.columna,malla));
            }
        }

        if(this.columna + 1 < malla.getColumnas()){ //Vecino derecho
           if(m[this.fila][this.columna+1] != Malla.WALL){
               sucs.add(new EstadoMalla(this.fila,this.columna+1,malla));
           }
        }

        if(this.fila+1 < malla.getFilas()){ //Vecino abajo
            if(m[this.fila+1][this.columna] != Malla.WALL){
                sucs.add(new EstadoMalla(this.fila+1,this.columna,malla));
            }
        }

        return sucs;
    }

    /**
     * Devuelve el coste del arco entre el nodo actual y el nodo que
     * recibe como parámetro
     * @param e2 nodo contiguo
     * @return coste(this,e2)
     */
    @Override
    public int coste(Estado e2) {
        return 1;
    }

    /**
     * Calcula la distancia Manhattan del algoritmo A* utilizando el estado actual y el
     * estado objetivo que recibe como parámetro
     * @param objetivo estado objetivo para calcular distancia Manhattan
     * @return Distancia Manhattan
     * @throws IllegalArgumentException !(objetivo instanceof EstadoMalla)
     */
    @Override
    public int h(Estado objetivo) {
        if (objetivo instanceof EstadoMalla) {
            EstadoMalla estadoMalla = (EstadoMalla) objetivo;
            return Math.abs(estadoMalla.getColumna() - columna) + Math.abs(estadoMalla.getFila() - fila);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Muestra por pantalla el estado actual con el formato
     * (this.fila,this.columna)
     */

    @Override
    public void ver() {
        System.out.println(this.toString());
    }

    /**
     * @return (this.fila,this.columna)
     */
    @Override
    public String toString() {
        return "(" + this.fila + "," + this.columna + ")";
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
}
