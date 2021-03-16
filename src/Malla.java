import java.util.Arrays;
import java.util.Random;

public class Malla {
    private final static int EMPTY = 0;
    private final static int START = 1;
    private final static int END = 2;
    private final static int WALL = 3;
    private final static char [] alphabet = {'_','S','E','X'};
    private int obs;
    private int [][] malla;
    private Random seed;


    public Malla (long s, int f , int c , int nObstaculos) {
        seed = new Random();
        seed.setSeed(s);
        malla = new int[f][c];
        obs = nObstaculos;
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
