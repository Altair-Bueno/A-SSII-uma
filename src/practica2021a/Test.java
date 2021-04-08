package practica2021a;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        long time = System.nanoTime();
        AgenteA agenteA = new AgenteA();
        Malla malla = new Malla(69,100,100,4000);
        System.out.println(malla);
        List<Estado> sol= agenteA.resuelve(malla.getEstadoInicial(),malla.getEstadoFinal());
        System.out.println(sol);

        System.out.println("Elapsed time: " + (System.nanoTime() - time)/1000000 + " ms");
    }
}
