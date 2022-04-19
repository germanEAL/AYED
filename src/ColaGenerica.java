

import ListasGenericas.ListaEnlazadaGenerica;

public class ColaGenerica<T>{
	private ListaEnlazadaGenerica<T> c = new ListaEnlazadaGenerica<T>();
	

	public void encolar(T elem) {
		c.agregarFinal(elem);
	}
	
	public T desencolar() {
		T elem= c.elemento(1);
		c.eliminar(elem);
		return elem;
	}
	
	public T tope() {
		T elem= c.elemento(1);
		return elem;
	}
	
	public boolean esVacia() {
		return c.esVacia();
	}
}
