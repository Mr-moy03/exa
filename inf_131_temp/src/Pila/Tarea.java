package Pila;

public class Tarea {
    private String id_tarea;
    private String nombre;
    private String prioridad;
    private String estado;
    private String descripcion;
    private String fecha_asignacion;
    private String fecha_limite;

    public Tarea(String id_tarea,String nombre, String prioridad,String estado,String descripcion,String fecha_asignacion,String fecha_limite) {
        this.id_tarea = id_tarea;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.estado = estado;
        this.descripcion = descripcion;
        this.fecha_asignacion =fecha_asignacion;
        this.fecha_limite = fecha_limite;
    }


    public String getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(String id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(String fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

    public String getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(String fecha_limite) {
        this.fecha_limite = fecha_limite;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Tarea:\n");
        s.append(String.format("> ID TAREA: %s\n",id_tarea));
        s.append(String.format("> Nombre: %s\n",nombre));
        s.append(String.format("> Prioridad: %s\n",prioridad));
        s.append(String.format("> Estado: %s\n",estado));
        s.append(String.format("> Descripcion: %s\n",descripcion));
        s.append(String.format("> Fecha: %s\n",fecha_asignacion));
        s.append(String.format("> Fecha limite: %s\n",fecha_limite));


        return s.toString();
    }
    public void mostrar(){
        System.out.println(toString());
    }



}