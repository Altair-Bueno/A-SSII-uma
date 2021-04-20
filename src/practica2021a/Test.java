package practica2021a;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AgenteA agenteA = new AgenteA();
        Malla malla;
        malla = new Malla(50,100,100,700);
        //malla = new Malla(0,200,200,10000);
        //malla = new Malla(5,300,300, 30000);
        System.out.println(malla);

        long time = System.nanoTime();
        List<Estado> sol= agenteA.resuelve(malla.getEstadoInicial(),malla.getEstadoFinal());
        System.out.println("Elapsed time: " + (System.nanoTime() - time) + " ns");

        System.out.println("Profundidad de la solución: " + sol.size());
    }
}
