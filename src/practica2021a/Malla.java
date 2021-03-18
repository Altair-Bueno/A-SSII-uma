package practica2021a;

import java.util.Random;

/**
 * Representa una malla 4-vecinos con obstaculos. Cada casilla contiene
 * un valor que representa el tipo de objeto {EMPTY, START, END, WALL}.
 * Si dos constructores reciben los mismos parámetros, la malla generada
 * es igual en ambas instancias
 */

public class Malla {

    public final static int EMPTY = 0;
    public final static int START = 1;
    public final static int END = 2;
    public final static int WALL = 3;
    private final static char[] alphabet = {'_', 'S', 'E', 'X'};



    private final int obs;
    private final int filas;
    private final int columnas;
    private final int[][] malla;
    private final Random seed;

    private EstadoMalla estadoFinal;
    private EstadoMalla estadoInicial;

    /**
     * Representa una malla 4-vecinos con obstaculos. Cada casilla contiene
     * un valor que representa el tipo de objeto {EMPTY, START, END, WALL}.
     * Si dos constructores reciben los mismos parámetros, la malla generada
     * es igual en ambas instancias
     *
     * @param s           semilla del generador
     * @param f           nº filas de la malla. Mayor que 0
     * @param c           nº columnas de la malla. Mayor que 0
     * @param nObstaculos nº obstaculos presentes dentro de la malla. Menor que el numero de casillas (f*c -2 <nObstaculos)
     * @throws IllegalArgumentException if (f <= 0 || c <= 0 || nObstaculos < 0 || f*c -2 <nObstaculos)
     */



    public Malla(long s, int f, int c, int nObstaculos) {
        if (f <= 0 || c <= 0 || nObstaculos < 0 || f*c -2 <nObstaculos)
            throw new IllegalArgumentException("Cannot build Malla class with args" +
                    s + " " + f + " " + c + " " + nObstaculos);

        seed = new Random();
        seed.setSeed(s);
        malla = new int[f][c];
        obs = nObstaculos;
        filas = f;
        columnas = c;
        generarMalla();
    }

    public int getColumnas() {
        return columnas;
    }

    public int getFilas(){
        return filas;
    }

    /**
     * Genera la malla a partir de los datos especificados. El inicio y el
     * final se generan de manera aleatoria lo primero, y luego se generan
     * los obstáculos con un bucle while que ponga tantos obstáculos
     * como se hayan pedido.
     */

    private void generarMalla() {
        int f, c;
        int n = obs;

        f = seed.nextInt(filas);
        c = seed.nextInt(columnas);
        malla[f][c] = START;
        estadoInicial = new EstadoMalla(f,c,this);

        while(malla[f][c] != EMPTY){
            f = seed.nextInt(filas);
            c = seed.nextInt(columnas);
        }
        malla[f][c] = END;
        estadoFinal = new EstadoMalla(f,c,this);


        while (n > 0){
            f = seed.nextInt(filas);
            c = seed.nextInt(columnas);

            if(malla[f][c] == EMPTY){
                malla[f][c] = WALL;
                n--;
            }
        }
    }

    /**
     * Devuelve la representación de la malla 4-vecinos almacenada
     * en esta instancia de la clase usando la siguiente leyenda:
     * <ul>
     * <li>'_' := Vacío</li>
     * <li>'X' := Muro</li>
     * <li>'S' := Inicio (Start)</li>
     * <li>'E' := Fin (End)</li>
     * </ul>
     *
     * @return representación malla 4-vecinos
     */
    public void ver() {
        System.out.println(toString());
    }

    public int[][] getMalla() {
        return malla;
    }

    public EstadoMalla getEstadoFinal() {
        return estadoFinal;
    }

    public EstadoMalla getEstadoInicial() {
        return estadoInicial;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < filas; i++) {
            for (int u = 0; u < columnas; u++) {
                stringBuilder.append(alphabet[malla[i][u]]);
                stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
