package main.java.com.tyrone.ListarTareasPorConsola.view;

import main.java.com.tyrone.ListarTareasPorConsola.controller.ListaTareas;
import main.java.com.tyrone.ListarTareasPorConsola.model.Tarea;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase VistaConsolaSLT que representa una interfaz o sistema de consola interactiva para la gestión
 * de tareas. Proporciona opciones para ejecutar los metodos agregar, marcar como completada, eliminar y listar tareas.
 *
 * La clase utiliza la clase ListaTareas para realizar las operaciones CRUD de las tareas y Scanner
 * para la entrada de datos del usuario.
 */
public class VistaConsolaSLT {

    private ListaTareas listaTareas = new ListaTareas();
    private Scanner scanner= new Scanner(System.in);

    /**
     * Metodo que gestiona el flujo principal de ejecución que se ocupa en el MAIN y muestra un menú interactivo en la consola.
     * Permite al usuario realizar diversas operaciones relacionadas con la gestión de tareas, como
     * agregar, marcar como completadas, eliminar, y visualizar tareas. El menú se repite hasta que
     * el usuario seleccione la opción "Salir"(0).
     *
     * Funcionalidades principales:
     * - Opción 1: Permite al usuario agregar una nueva tarea solicitando su nombre y descripción.
     * - Opción 2: Marca una tarea específica como completada, basándose en su identificador.
     * - Opción 3: Elimina una tarea específica seleccionándola por su identificador.
     * - Opción 4: Muestra todas las tareas junto con su detalle.
     * - Opción 0: Permite cerrar este ciclo y salir de la consola.
     * - Manejo de excepciones para entradas no numéricas en campos que requieren números.
     *
     * Utiliza un bucle `do-while` para mantener el menú en ejecución mientras el usuario
     * no seleccione la opción de salir(0).
     *
     * Maneja los siguientes casos:
     * - Entrada inválida generada por el usuario.
     * - Operaciones sobre una lista vacía.
     * - Entrada de Indices fuera del menu.
     *
     * Dependencias:
     * - `listaTareas`: Gestor que almacena y organiza las tareas.
     * - `scanner`: Objeto que captura la entrada del usuario mediante la consola.
     */
    public void ejecutar() {
        int opcion = 5;
        Long idTarea;

        do {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            try {
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
                    if (listaTareas.isEmpty()) {
                        System.out.println("Agrege una tarea");
                    } else {
                        System.out.println("Escriba el indice de la tarea: ");
                        idTarea = scanner.nextLong();
                        listaTareas.actualizarEstado(idTarea);
                    }

                } else if (opcion == 3) {
                    System.out.print("Seleccione que tarea desea eliminar: ");
                    listaTareas.mostrarTareas();
                    if (listaTareas.isEmpty()) {
                        System.out.println("Agrege una tarea");
                    } else {
                        System.out.println("Escriba el indice de la tarea");
                        idTarea = scanner.nextLong();
                        listaTareas.borrarTarea(idTarea);
                    }
                } else if (opcion == 4) {
                    listaTareas.mostrarTareas();
                }else if (opcion > 4 || opcion < 0) {
                    System.out.println("\u001B[31mOpcion inválida. Elija una del menu.\u001B[0m");
                }

            }catch (InputMismatchException e) {
                System.out.println("\u001B[31mEntrada invalida. Elija una opcion del menu.\u001B[0m");// Muestra mensaje de error en color rojo usando códigos ANSI (\u001B[31m: iniciiar tod* el mensaje rojo, \u001B[0m: resetear este color para las demas lineas)

                scanner.nextLine(); // limpiar buffer
            }
        }while (opcion != 0);
    }



}
