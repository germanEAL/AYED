package tp02.ejercicio3;

import ListasGenericas.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
	private ListaEnlazadaGenerica<T> p = new ListaEnlazadaGenerica<T>();
	

	public void apilar(T elem) {
		p.agregarInicio(elem);
	}
	
	public T desapilar() {
		T elem= p.elemento(1);
		p.eliminar(elem);
		return elem;
	}
	
	public T tope() {
		T elem= p.elemento(1);
		return elem;
	}
	
	public boolean esVacia() {
		return p.esVacia();
	}
}
