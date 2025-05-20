package main.java.com.tyrone.ListarTareasPorConsola.controller;

import main.java.com.tyrone.ListarTareasPorConsola.model.Tarea;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
   private List<Tarea> tareas = new ArrayList<>();


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

   public void agregarTarea(Tarea tarea) {
      tareas.add(tarea);
      System.out.println("Tarea agregada con exito."+ tarea);
   }

   public Tarea buscarTareaPorId(long id) {
      for (Tarea t : tareas) {
         if (t.getId() == id) {
            return t;
         }
      }
      System.out.println("Su tarea no existe");
      return null;
   }

   public boolean actualizarEstado(long id/*, boolean nuevoEstado*/) {
      for (Tarea t : tareas) {
         if (t.getId() == id) {
//            t.setEstado(nuevoEstado);
            t.setEstado(true);
            System.out.println("El estado de su tarea se actualizo con exito");
            return true; // éxito
         }else {
            System.out.println("Su tarea no existe");
         }
      }
      return false; // no se encontró la tarea
   }

   public boolean borrarTarea(long id) {
      for (int i = 0; i < tareas.size(); i++) {
         if (tareas.get(i).getId() == id) {
            tareas.remove(i);
            System.out.println("Tarea eliminada con exito");
            return true;
         }
      }
      System.out.println("Indice invalido");
      return false;
   }

   public boolean isEmpty() {
      return tareas.isEmpty();
   }
}
