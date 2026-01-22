package Pila;

public class PilaTarea {
    protected int max = 50;
    protected Tarea v[] = new Tarea[max];
    private int tope;

    public PilaTarea() {
        this.tope = -1;
    }
    public boolean esVacia(){
        if(this.tope == -1)
            return true;
        else
            return false;
    }
    public boolean esLlena(){
        if(this.tope == max-1)
            return true;
        else
            return false;
    }
    public void push(Tarea elem){
        if(!esLlena()){
            this.tope++;
            this.v[this.tope] = elem;
        }
        else
            System.out.println("Pila Llena!!!");
    }
    public Tarea pop(){
        Tarea elem;
        if(!esVacia()){
            elem = this.v[this.tope];
            this.tope--;
            return elem;
        }
        else{
            System.out.println("Pila es vacia!!!!");
            return null;
        }

    }

    public void mostrar(){
        PilaTarea aux = new PilaTarea();
        System.out.println("Datos de la pila: ");
        while(!esVacia()){
            Tarea elem = pop();
            //System.out.println(elem);
            elem.mostrar();
            aux.push(elem);
        }
        vaciar(aux);
    }
    public void vaciar(PilaTarea p){
        while(!p.esVacia()){  //mientras la pila p NO es vacia
            this.push(p.pop());
        }
    }
    /*
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr datos nombre, materia");
		for (int i = 1; i <= n; i++) {
			String nombre = lee.next();
			String materia = lee.next();

			Tarea elem = new Tarea(nombre, materia);
			//char elem = lee.next().charAt(0);
			this.adi(elem);
		}
	}
	*/
    public int nroElem(){
        return tope + 1;
    }
}
