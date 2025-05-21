# Lista de Tareas por Consola

Una aplicación de consola para gestionar tareas, desarrollada en Java utilizando el patrón MVC.

## Características
- Crear nuevas tareas
- Listar todas las tareas
- Marcar tareas como completadas/pendientes
- Identificación única para cada tarea

## Requisitos
- Usé Java SDK 22
- IDE compatible con Java (IntelliJ IDEA, Eclipse, etc.)

## Estructura del Proyecto

    ListaTareas/                   - Carpeta raíz del proyecto
    └── src/                       
        └── main/                  
            └── java/              
                └── com/
                    └── tyrone/
                        └── ListarTareasPorConsola/
                            ├── model/
                            │   └── Tarea.java          - Clase modelo que representa una tarea individual
                            ├── view/
                            │   └── ConsoleView.java    - Maneja la interacción con el usuario por consola
                            ├── controller/
                            │   └── TareaController.java - Gestiona la lógica entre el modelo y la vista
                            └── Main.java               - Punto de entrada de la aplicación


## Instalación
1. Clona el repositorio
   ```bash
   git clone https://github.com/Tyrone073/ListarTareas.git
   ```
2. Abre el proyecto en tu IDE
3. Ejecuta la clase Main.java

## Uso
1. Al iniciar el programa, verás un menú con las siguientes opciones:
    - 1: Crear nueva tarea
    - 2: Listar tareas
    - 3: Marcar tarea como completada
    - 4: Salir

## Autor
- Tyrone Gabriel Pilay Menendez

## Licencia
Este proyecto está bajo la Licencia :)
