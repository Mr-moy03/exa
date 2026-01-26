package _5_Lista_Simple.simple;//Lic. Aruquipa Marcelo

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LS_NormalMascota A = new LS_NormalMascota();
		
		System.out.println(A.esVacia());
		System.out.println("nro de nodos de la lista: " + A.nroNodos());
	
		
		Mascota z1 = new Mascota("kaiser", 123, 715555, 150, 8);
		Mascota z2 = new Mascota("puska", 456, 745454, 100, 5);
		Mascota z3 = new Mascota("coco", 2222, 606677, 170, 3);
		Mascota z4 = new Mascota("choca", 3636, 777777, 120, 8);
		Mascota z5 = new Mascota("blacky", 2525, 74242, 100, 6);
		Mascota z6 = new Mascota("loky", 8898, 60978, 100, 4);
		
		A.adiFinal(z1);
		A.adiFinal(z2);
		A.adiFinal(z3);
		A.adiFinal(z4);
		A.adiFinal(z5);
		A.adiFinal(z6);
		
		A.mostrar();
		System.out.println("\nnro de nodos: "+ A.nroNodos());
		
		//a) Verificar la cantidad de perros y gatos seg�n el precio que se pag� para su corte
		
		int nroPerritos = contarPerritos(A);
		int nroGatitos = contarGatitos(A);
		
		System.out.println("\ncantidad de perritos: " + nroPerritos);
		System.out.println("\ncantidad de gatitos: " + nroGatitos);
		
		//b) Mostrar a las mascotas que tienen una edad mayor a X y especificar si son perros o gatos
		System.out.println("\n mostrar mascotas de edad mayor a 5 y que mascota es:");
		mostrarMascotasMayorEdad(A, 5);
		
		//c) Cambiar el n�mero de celular del due�o con CI X.
		//implementar el procedimiento
		//cambiarCiDuenio(A, 2222)
		//A.mostrar();
		
		
//		System.out.println("\nAdiciona al principio");
//		A.adiPrincipio(z5);
//		A.mostrar();
//		
//		System.out.println("\nelimina nodo del principio");
//		Listas.sem.simple.NodoMascota z = A.eliPrincipio();
//		A.mostrar();
//		System.out.println("\nnodo eliminado:");
//		z.getMa().mostrar();	
	} //fin del main
	
	static void mostrarMascotasMayorEdad(LS_NormalMascota A, int edadx) {
		NodoMascota R = A.getP(); //R apunta al principio de la lista
		while(R != null) {
			Mascota mascota = R.getMa();
			if(mascota.getEdad() > edadx) {
				if(mascota.getCosto() > 100)
					System.out.println(mascota.getNom() + " es un perrito de edad " + mascota.getEdad());
				else
					System.out.println(mascota.getNom() + " es un gatito de edad " + mascota.getEdad());
			}
			
			R = R.getSig(); //R apunta al siguiente nodo
		}
	}

	static int contarPerritos(LS_NormalMascota A) {
		int cnt = 0;
		NodoMascota R = A.getP(); //R apunta a la raiz
		while(R != null) {
			if(R.getMa().getCosto()>100) {
				cnt++;
			}
			R = R.getSig(); //R apunta al siguiente de R
		}
		return cnt;
	}
	static int contarGatitos(LS_NormalMascota A) {
		int cnt = 0;
		NodoMascota R = A.getP(); //R apunta a la raiz
		while(R != null) {
			if(R.getMa().getCosto() == 100) {
				cnt++;
			}
			R = R.getSig(); //R apunta al siguiente de R
		}
		return cnt;
	}
}



