package tp03.ejercicio1;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;
	private ArbolBinario<T> hijoDerecho;

	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * 
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo != null;
	}

	public boolean tieneHijoDerecho() {
		return this.hijoDerecho != null;
	}

	public int contarHojas() {
		int hojas = 0;
		if (this.esHoja()) {
			return 1;
		}
		if (this.tieneHijoDerecho()) {
			hojas += this.contarHojas();
		}
		if (this.tieneHijoIzquierdo()) {
			hojas += this.contarHojas();
		}
		return hojas;
	}

	public ArbolBinario<T> espejo() {
		if (this.esHoja()) {
			return this;
		}
		ArbolBinario<T> aux = this.hijoDerecho;
		this.agregarHijoDerecho(this.hijoIzquierdo);
		this.agregarHijoIzquierdo(aux);
		if (this.tieneHijoDerecho()) {
			this.getHijoDerecho().espejo();
		}
		if (this.tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().espejo();
		}
		return this;
	}

	public void entreNiveles(int n, int m){
		ArbolBinario<T> a= null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		int nivel=0;
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia() && nivel<= m){
			a= cola.desencolar();
			if(a.esVacio()){
				if(nivel=> n){
					System.out.print(a.getDato()+" ");
				}
				if(a.tieneHijoIzquierdo()){
					cola.encolar(a.getHijoIzquierdo());
				}
				if(a.tieneHijoDerecho()){
					cola.encolar(a.getHijoDerecho());
				}
				else (!cola.esVacia()){
					System.out.println();
					nivel++;
					cola.encolar(null);
				}
			}
		}
	}

}
