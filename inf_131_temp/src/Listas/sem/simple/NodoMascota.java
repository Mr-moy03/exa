package Listas.sem.simple;


public class NodoMascota {
	private Mascota ma;
	private NodoMascota sig;
	
	public NodoMascota() {  //constructor
		sig = null;
	}

	public Mascota getMa() {
		return ma;
	}

	public void setMa(Mascota ma) {
		this.ma = ma;
	}

	public NodoMascota getSig() {
		return sig;
	}

	public void setSig(NodoMascota sig) {
		this.sig = sig;
	}
	
}
