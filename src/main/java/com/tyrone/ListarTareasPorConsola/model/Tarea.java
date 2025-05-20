package main.java.com.tyrone.ListarTareasPorConsola.model;

public class Tarea {

    // Atributos y estan con el tipo private para ocultarlas en otras clase y sirvan los metodos getter y setter
    private static long contador = 1;
    private Long id;
    private String nombre;
    private boolean estado;
    private String descripcion;

    // Constructor recibira los datos de tarea
    public Tarea(String nombre, String descripcion) {
        this.id = contador++;
        this.nombre = nombre;
        this.estado = false;  // por defecto, no está completada como lo pide la tarea
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    // Metodo getter para mostrar nombre
    public String getNombre() {
        return nombre;
    }

    // Metodo setter para insertar o modificar nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo getter para revisar si esta o no completada
    public boolean getEstado() {
        return estado;
    }

    // Metodo setter para actualizar este boolean
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
