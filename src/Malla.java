import java.util.Arrays;
import java.util.Random;

public class Malla {
    private final static int EMPTY = 0;
    private final static int START = 1;
    private final static int END = 2;
    private final static int WALL = 3;
    private final static char [] alphabet = {'_','S','E','X'};
    Random seed;
    int [][] malla;

    public Malla (int seed, int filas , int columnas , int nObstaculos) {

    }

    public String ver() {
        return null;
    }

    public int[][] getMalla() {
        return malla;
    }

    @Override
    public String toString() {
        return ver();
    }
}
