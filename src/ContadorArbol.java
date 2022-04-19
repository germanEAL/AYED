import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
    
    public void paresInOrden(ArbolBinario<Integer> arbol){
        if(arbol.tieneHijoIzquierdo())
            ContadorArbol.paresInOrden(arbol.getHijoIzquierdo);
        if(arbol.getDato() % 2 == 0)
            System.out.print(arbol.getDato());
        if(arbol.tieneHijoDerecho())
            ContadorArbol.paresInOrden(arbol.getHijoDerecho());
    }

    public void paresPostOrden(ArbolBinario<Integer> arbolito){
        if(arbolito.tieneHijoIzquierdo())
            ContadorArbol.paresPostOrden(arbolito.getHijoIzquierdo());
        if(arbolito.tieneHijoDerecho())
            ContadorArbol.paresPostOrden(arbolito.getHijoDerecho());
    }
    
}
