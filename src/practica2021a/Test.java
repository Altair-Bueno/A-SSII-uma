package practica2021a;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AgenteA agenteA = new AgenteA();
        Malla malla = new Malla(69,4,4,3);
        System.out.println(malla);
        List<Estado> sol= agenteA.resuelve(malla.getEstadoInicial(),malla.getEstadoFinal());
        System.out.println(sol);
    }
}
