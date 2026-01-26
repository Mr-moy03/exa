package _5_Lista_Simple.simple;

//Lic. Aruquipa Marcelo
public class LS_NormalMascota extends ListaSimpleMascota{

	public LS_NormalMascota() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Mascota z) {
		NodoMascota nuevo = new NodoMascota(); //composicion
		nuevo.setMa(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Mascota z) {
		NodoMascota nuevo = new NodoMascota();
		nuevo.setMa(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoMascota R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoMascota R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getMa().mostrar();
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoMascota R = P;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
	
	public NodoMascota eliPrincipio() {
		NodoMascota x = null;    
		if(!esVacia()) {
			x = P ;     // x apunta a la raiz P
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoMascota eliFinal() {
		NodoMascota x = null;
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;      //x apunta a la raiz P
				P = null;
			}else {
				NodoMascota R = P;
				NodoMascota S = P;
				while(R.getSig() != null) {
					S = R;         //S apunta a R
					R = R.getSig(); //R apunta al siguiente de R
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
	
	public void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Mascota z = new Mascota();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Mascota z = new Mascota();
			z.leer();
			adiFinal(z);
		}
	}
}
