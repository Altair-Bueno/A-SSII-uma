import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

public class Malla {
    private final static int EMPTY = 0;
    private final static int START = 1;
    private final static int END = 2;
    private final static int WALL = 3;
    private final static char [] alphabet = {'_','S','E','X'};
    private int obs;
    private int [][] malla;
    private Random seed;

    /**
     * Representa una malla 4-vecinos con obstaculos. Cada casilla contiene
     * un valor que representa el tipo de objeto {EMPTY, START, END, WALL}.
     * Si dos constructores reciben los mismos parámetros, la malla generada
     * es igual en ambas instancias
     *
     * @param seed semilla del generador
     * @param filas nº filas de la malla
     * @param columnas nº columnas de la malla
     * @param nObstaculos nº obstaculos presentes dentro de la malla
     */
    
    public Malla (long s, int f , int c , int nObstaculos) {
        seed = new Random();
        seed.setSeed(s);
        malla = new int[f][c];
        obs = nObstaculos;
        generarMalla();
    }

    private void generarMalla(){

    }

    /**
     * Devuelve la representación de la malla 4-vecinos almacenada
     * en esta instancia de la clase
     * @return representación malla 4-vecinos
     */
    public String ver() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i< malla.length ; i++) {
            for (int u = 0 ; u<malla[0].length ; u++) {
                stringBuilder.append(alphabet[malla[i][u]]);
                stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public int[][] getMalla() {
        return malla;
    }

    @Override
    public String toString() {
        return ver();
    }
}
