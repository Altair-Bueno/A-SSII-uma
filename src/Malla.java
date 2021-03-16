import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

public class Malla {
    private final static int EMPTY = 0;
    private final static int START = 1;
    private final static int END = 2;
    private final static int WALL = 3;
    private final static char [] alphabet = {'_','S','E','X'};

    Random seed;
    int [][] malla;

    public Malla (long seed, int filas , int columnas , int nObstaculos) {

    }

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
