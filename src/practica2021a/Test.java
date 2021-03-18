package practica2021a;

public class Test {
    public static void main(String[] args) {
        Malla malla = new Malla(7,5,5,4);

        System.out.println(malla);

        System.out.println("Inicial: " +malla.getEstadoInicial());
        System.out.println("Final: " +malla.getEstadoFinal());

        System.out.println("Sucesores de inicial: " + malla.getEstadoInicial().calculaSucesores());
        System.out.println("Heuristico: " + malla.getEstadoInicial().h(malla.getEstadoFinal()));
    }
}
