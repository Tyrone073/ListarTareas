package main.java.com.tyrone.ListarTareasPorConsola.view;

import main.java.com.tyrone.ListarTareasPorConsola.controller.TareaController;
import main.java.com.tyrone.ListarTareasPorConsola.model.Tarea;

import java.util.Scanner;

public class SistemaDeListasDeTareas {

    private TareaController tareaController = new TareaController();
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
                tareaController.agregarTarea(nuevatarea);

            } else if (opcion == 2) {
                System.out.print("Seleccione que tarea desea macar como completada: ");
                tareaController.mostrarTareas();
                idTarea = scanner.nextLong();
                System.out.println("Usted acab de seleccioan la tarea: " + tareaController.buscarTareaPorId(idTarea));
                System.out.println("Escriba 'false' si desea actalizar a pendiente  o 'true' si desea macarla como completada");
                boolean estado = scanner.nextBoolean();
                tareaController.actualizarEstado(idTarea, estado);
            }else if (opcion == 3) {
                System.out.print("Seleccione que tarea desea eliminar: ");
                tareaController.mostrarTareas();
                System.out.println("Escriba el indice de la tarea");
                idTarea = scanner.nextLong();
                System.out.println("Usted acaba de seleccioar la tarea: \n" + tareaController.buscarTareaPorId(idTarea));
                tareaController.borrarTarea(idTarea);

            }else if (opcion == 4) {
                tareaController.mostrarTareas();
            }
        }while (opcion != 0);
    }



}
