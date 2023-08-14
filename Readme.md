# Task Manager Application

This Java program simulates a task manager for a data server that handles tasks based on their priorities.

## SDK FOR EXECUTION:
corretto 19

![img.png](src/img/SDK.png)

## Description

The Task Manager Application demonstrates the handling of tasks with varying priorities using two types of data servers:
1. `PriorityQueueDataServer`: Manages tasks with priorities in a priority queue.
2. `DiskAuxiliaryDataServer`: Handles overflow tasks by storing them in an auxiliary queue on disk.

## How to Run

1. **Compilation**: Open a terminal and navigate to the directory where the `TaskManagerApp.java` file is located:

   ```bash
   cd path/to/directory
2. Compile the Java file using the javac command:
      ```bash
   javac TaskManagerApp.java
   
3. Execution: Still in the terminal and the same directory, run the program using the java command:
      ```bash
    java TaskManagerApp
The program will display the processing of tasks with their priorities.

# example of execution
![img.png](src/img/img.png)

## diagram
![img.png](src/img/img_1.png)


### mermaid code
```mermaid
flowchart LR
    A[Inicio] --> B[Recibir tarea y prioridad]
    B --> C{"¿Lista de prioridades llena?"}
    C -->|No| D[Agregar a la lista de prioridades]
    C -->|Sí| E[Agregar a la lista auxiliar en disco]
    D --> F{"¿Lista auxiliar acepta una tarea nueva"?}
    F -->|Sí| G[Vaciar una tarea de la lista de prioridades]
    F -->|No| H
    E --> I[Atender tarea desde la lista auxiliar]
    I --> J{"¿Lista de prioridades vacía?"}
    J -->|Sí| K[Fin]
    J -->|No| B
    G --> J
    H --> J
```

CARLOS G