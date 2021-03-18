package practica2021a;

import java.util.ArrayList;
import java.util.List;

/**
 * @author L.Mandow 
 * @date  2021-03-11
 * 
 * Plantilla para representar los estados de la práctica
 *
 */

public class EstadoMalla implements Estado {


    @Override
    public List<? extends Estado> calculaSucesores() {
        return null;
    }

    @Override
    public int coste(Estado e2) {
        return 0;
    }

    @Override
    public int h(Estado objetivo) {
        return 0;
    }

    @Override
    public void ver() {

    }
}
