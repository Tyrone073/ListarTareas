package main.java.com.tyrone.ListarTareasPorConsola.view;

import main.java.com.tyrone.ListarTareasPorConsola.controller.ListaTareas;
import main.java.com.tyrone.ListarTareasPorConsola.model.Tarea;

import java.util.Scanner;

public class SistemaDeListasDeTareas {

    private ListaTareas listaTareas = new ListaTareas();
    private Scanner scanner= new Scanner(System.in);

    public void ejecutar() {
        int opcion;
        Long idTarea;


        do {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer


            if (opcion == 1) {
                System.out.print("Nombre de la tarea: ");
                String nombre = scanner.nextLine();
                System.out.print("Descripcion: ");
                String descripcion = scanner.nextLine();
                Tarea nuevatarea = new Tarea(nombre, descripcion);
                listaTareas.agregarTarea(nuevatarea);

            } else if (opcion == 2) {
                System.out.print("Seleccione que tarea desea macar como completada:");
                listaTareas.mostrarTareas();
                if (listaTareas.isEmpty()){
                    System.out.println("Agrege una tarea");
                }else {
                    System.out.println("Escriba el indice de la tarea: ");
                    idTarea = scanner.nextLong();
                    listaTareas.actualizarEstado(idTarea);
                    System.out.println("Se acaba de marcar como completa la tarea: \n" + listaTareas.buscarTareaPorId(idTarea));
                }

            }else if (opcion == 3) {
                System.out.print("Seleccione que tarea desea eliminar: ");
                listaTareas.mostrarTareas();
                if (listaTareas.isEmpty()){
                    System.out.println("Agrege una tarea");
                }else {
                    System.out.println("Escriba el indice de la tarea");
                    idTarea = scanner.nextLong();
                    listaTareas.borrarTarea(idTarea);
                }
            }else if (opcion == 4) {
                listaTareas.mostrarTareas();
            }
        }while (opcion != 0);
    }



}
