package _2_Colas;

public class ColaSimple {
    private int datos[];
    private int frente;
    private int fin;
    private int maximo;

    public ColaSimple(int tamaño){
        this.maximo = tamaño;
        this.datos = new int [maximo];
        this.frente = -1;
        this.fin = -1;

    }
    public boolean esLlena(){
        return (fin == maximo -1);
    }

    public boolean esVacia(){
        return (fin == frente);
    }

    public void push(int elemento){
        if (esLlena()){
            System.out.println("Cola llena");
        }else {
            fin ++;
            datos[fin] = elemento;
        }
    }

    public int pop(){
        int elemento = 0;
        if (esVacia()){
            System.out.println("Cola vacia");
        } else {
            frente ++;
            elemento = datos[frente];
        }
        return elemento;
    }

    public int nroElem(){
        return (fin - frente);
    }

    public void vaciar(ColaSimple c){
        while (!c.esVacia()){
            push(c.pop());
        }
    }
    /*
    public void llenar (int n){
        for (int i = 1;i<n;i++){
            System.out.println("ingrese los datos;");
            int x = sc.nextInt();
            push(x);
        }
    }*/

    public void mostrar(){
        ColaSimple aux = new ColaSimple(maximo);
        int elemento = 0;
        while (!esVacia()){
            elemento = pop();
            System.out.print(elemento + " - ");
            aux.push(elemento);
        }
        System.out.println();
        vaciar(aux);
    }

}
