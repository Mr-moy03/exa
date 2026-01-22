package Listas.sem.simple;//Lic. Aruquipa Marcelo
import java.util.Scanner;

public class Mascota {
	private String nom;
	private int ci, nroCel, edad;
	private double costo;
	
	public Mascota() {
		
	}
	public Mascota(String nom, int ci, int nroCel, double costo, int edad) {
		this.nom = nom;
		this.ci = ci;
		this.nroCel = nroCel;
		this.costo = costo;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getNroCel() {
		return nroCel;
	}

	public void setNroCel(int nroCel) {
		this.nroCel = nroCel;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Listas.sem.simple.Mascota [nom=" + nom + ", ci=" + ci + ", nroCel=" + nroCel + ", costo=" + costo + ", edad=" + edad + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("\nnom mascota, ci, nro cel, costo, edad");
		this.nom = lee.next();
		this.ci = lee.nextInt();
		this.nroCel = lee.nextInt();
		this.costo = lee.nextDouble();
		this.edad = lee.nextInt();
	}
	
}
