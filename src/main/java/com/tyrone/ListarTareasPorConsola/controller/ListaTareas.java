package main.java.com.tyrone.ListarTareasPorConsola.controller;

import main.java.com.tyrone.ListarTareasPorConsola.model.Tarea;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que maneja una lista de objetos de tipo Tarea.
 * Proporciona un menu  de métodos para agregar, actualizar estado, eliminar y mostrar
 * tareas la lista.
 * Las tareas son gestionadas en memoria mientras el programa está en ejecución.
 */
public class ListaTareas {
   private List<Tarea> tareas = new ArrayList<>();

   /**
    * Muestra en la consola una lista de todas las tareas almacenadas en memoria.
    * Este métod* imprime el índice, nombre, descripción y estado de cada tarea.
    * Si no existen tareas en la lista, se muestra un mensaje indicando que no hay tareas para mostrar.
    */
   public void mostrarTareas() {
      System.out.println("\n=== Lista de Tareas ===");
      System.out.println("Indice|   Nombre  |   Tipo  |   Descripcion");
      if (tareas.isEmpty()) {
         System.out.println("No hay tareas para mostrar.");
      } else {
         for (int i = 0; i < tareas.size(); i++) {
            Tarea t = tareas.get(i);
            System.out.println(t.getId() + ". " + t.getNombre() + " | " + t.getDescripcion() +" | " + (t.getEstado() ? "Completada" : "Pendiente"));
         }
      }
   }

   /**
    * Agrega una nueva tarea a la lista de tareas y muestra un mensaje
    * de confirmación en la consola.
    *
    * @param tarea la tarea a agregar a la lista; debe ser una instancia de la clase Tarea
    */
   public void agregarTarea(Tarea tarea) {
      tareas.add(tarea);
      System.out.println("Tarea agregada con exito."+ tarea);
   }

//   /**
//    * Metodo no usado
//    * Busca una tarea en la lista que coincida con el identificador proporcionado.
//    * Si se encuentra, retorna la tarea; de lo contrario, imprime un mensaje indicando
//    * que la tarea no existe y retorna null.
//    *
//    * @param id el identificador único de la tarea a buscar
//    * @return la tarea encontrada que coincide con el ID especificado, o null si no existe
//    */
//   public Tarea buscarTareaPorId(long id) {
//      for (Tarea t : tareas) {
//         if (t.getId() == id) {
//            return t;
//         }
//      }
//      System.out.println("Tarea inexistente");
//      return null;
//   }

   /**
    * Actualiza el estado de una tarea específica en la lista, identificada por su ID unico.
    * Si el ID coincide con una tarea en la lista, el estado de la tarea se actualiza a completado
    * y se muestra un mensaje de exito en la consola.
    * Si no se encuentra una tarea con el ID proporcionado, se muestra un mensaje indicando que la tarea no existe.
    *
    * @param id el identificador unico de la tarea cuyo estado se desea actualizar
    * @return true si la tarea fue encontrada y su estado se actualizó con exito; false en caso contrario
    */
   public boolean actualizarEstado(long id/*, boolean nuevoEstado*/) {
      for (Tarea t : tareas) {
         if (t.getId() == id) {
//            t.setEstado(nuevoEstado);
            t.setEstado(true);
            System.out.println("=== El estado de su tarea se actualizo con exito ===\n");
            System.out.println("Se actualizo el estado de la tarea: " + t );
            return true;
         }
      }
      System.out.println("Indice de tarea inexistente");
      return false;
   }

   /**
    * Elimina una tarea específica de la lista de tareas basada en su identificador unico.
    * Si existe una tarea con el identificador proporcionado, se elimina y se muestra un mensaje de confirmación.
    * Si no se encuentra una tarea con el identificador dado, en la consola se informa que el índice es inexistente por ende la tarea no existe.
    *
    * @param id el identificador unico de la tarea que se desea eliminar
    * @return true si la tarea fue eliminada con exito; false si no se encontro una tarea con el identificador proporcionado
    */
   public boolean borrarTarea(long id) {
      for (int i = 0; i < tareas.size(); i++) {
         if (tareas.get(i).getId() == id) {
            tareas.remove(i);
            System.out.println("Tarea eliminada con exito");
            return true;
         }
      }
      System.out.println("Indice de tarea inexistente");
      return false;
   }

   /**
    * Verifica si la lista de tareas está vacía.
    * Este métod* es utilizado en la clase VistaConsolaSLT para realizar validaciones y mostrar los mensajes de entrada de datos para el usuario
    *
    * @return true si la lista de tareas no contiene elementos, false en caso contrario
    */
   public boolean isEmpty() {
      return tareas.isEmpty();
   }
}
