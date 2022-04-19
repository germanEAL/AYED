import tp03.ejercicio1.ArbolBinario;

public class TestContadorArbol {
    public static void main(String[] args){
        ArbolBinario<Integer> arbol = new ArbolBinario<T>(11);

        ArbolBinario<Integer> arbolIzq = new ArbolBinario<T>(14);
        arbolIzq.agregarHijoIzquierdo( new ArbolBinario<T>(18));
        arbolIzq.agregarHijoDerecho( new ArbolBinario<T>(12));
        ArbolBinario<Integer> arbolDer = new ArbolBinario<T>(5);
        arbolDer.agregarHijoIzquierdo( new ArbolBinario<T>(2));
        arbolDer.agregarHijoDerecho( new ArbolBinario<T>(7));

        arbol.agregarHijoIzquierdo(arbolIzq);
        arbol.agregarHijoDerecho(arbolDer);

        ContadorArbol.paresInOrden(arbol);

    }
}
