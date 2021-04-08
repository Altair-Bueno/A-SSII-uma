import practica2021a.*;

public class PruebaResolver {

    public List<Estado> resuelve(Estado salida, Estado objetivo){
        Arbol<Estado> arbol = new ArbolL<Estado>();
        Nodo n = new Nodo(e, 0, null);
        arbol.put(n);
        Abiertos<Estado> abiertos = new AbiertosL<Estado>();
        Estado e = salida;
        abiertos.offer(e.h(objetivo), e);
        while (!abiertos.isEmpty()){
            e = abiertos.poll();
            n = arbol.get(e);
            if(e.equals(objetivo)){
                return camino solución;
            } else
                int ge = n.getG();
            for(Estado e2: e.calculaSucesores()){
                int nuevoCoste = ge + e.coste(e2);
                if (!arbol.containsKey(e2)){
                    arbol.put(new Nodo(e2, nuevoCoste, n));
                    abiertos.offer(nuevoCoste + e2.h(objetivo), e2);
                } else {
                    Nodo n2 = arbol.get(e2);
                    int antiguoCoste = n2.getG();
                    if (nuevoCoste < antiguoCoste) {
                        n2.setPadre(n);
                        n2.setG(nuevoCoste);
                        abiertos.remove(e2);
                        abiertos.offer(nuevoCoste + e2.h(objetivo), e2);
                    }
                }
            }//for e2
        }//if-else
    }//while
    return fracaso;
}

    public static void main(String[] args) {

    }
}
