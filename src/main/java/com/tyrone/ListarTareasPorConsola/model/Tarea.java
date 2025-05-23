package main.java.com.tyrone.ListarTareasPorConsola.model;

/**
 * Clase que representa una tarea (Model) con sus propiedades básicas.
 * Permite crear y gestionar tareas individuales con un identificador unico.
 */
public class Tarea {

    /**
     * Atributos principales de la tarea.
     * Se declaran como private para garantizar el encapsulamiento,
     * permitiendo su acceso únicamente a través de getters y setters.
     * @param contador      atributo estatico para generar o sumarle a id numeros secuenciales para cada objeto nuevo
     * @param id            identificador único de la tarea
     * @param nombre        el nombre o título de la tarea
     * @param estado        estado de la tarea (true: completada, false: pendiente)
     * @param descripcion   la descripción detallada de la tarea
     */
    private static long contador = 1;
    private Long id;
    private String nombre;
    private boolean estado;
    private String descripcion;

    /**
     * Constructor que inicializa una nueva instancia de la clase Tarea.
     *
     * Este constructor recibe los datos necesarios para crear una tarea,
     * asigna automáticamente un identificador único(ID) utilizando el contador estático,
     * establece el estado de la tarea como no completada (por defecto) y guarda el nombre
     * y la descripción proporcionados.
     */
    public Tarea(String nombre, String descripcion) {
        this.id = contador++ ;
        this.nombre = nombre;
        this.estado = false;
        this.descripcion = descripcion;
    }


    // Métodos getter y setter

    /**
     * Obtiene el ID único de la tarea
     */
    public Long getId() {
        return id;
    }

    /**
     * Obtiene el nombre o título de la tarea.
     *
     * @return (retorna o devuelve)el nombre de la tarea.
     */
    public String getNombre() {
        return nombre;
    }

//    /**
//     * Establece el nombre o título de la tarea.
//     *
//     * @param nombre el nuevo nombre de la tarea
//     * Esta comentada porq no se usa
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }

    /**
     * Obtiene el estado actual de la tarea.
     *
     * @return true si la tarea está completada, false si la tarea está pendiente.
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la tarea.
     *
     * @param estado el nuevo estado de la tarea (true: completada, false: pendiente)
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la descripción detallada de la tarea.
     *
     * @return la descripción de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }

//    /**
//     * Establece la descripción detallada de la tarea.
//     *
//     * @param descripcion la nueva descripción de la tarea
//     *comentada porq no se usa
//     */
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }

    /**
     * Sobreescribe la representación en cadena, formato o estructura de la clase Tarea, que incluye
     * el identificador, nombre, descripción y el estado de la tarea (completada o pendiente).
     *
     * @return una cadena con el formato: "id. nombre | descripción | estado".
     */
    @Override
    public String toString() {
        return id + ". " + nombre + "  |  " + descripcion + "  |  " + (estado ? "Completada" : "Pendiente");
    }
}