public class TaskManagerApp {
        public static void main(String[] args) {
            DataServer priorityQueueDataServer = new PriorityQueueDataServer();
            DataServer diskAuxiliaryDataServer = new DiskAuxiliaryDataServer();

            Task[] tasks = {
                    new Task("Tarea 1", 1),
                    new Task("Tarea 2", 2),
                    new Task("Tarea 3", 1),
                    new Task("Tarea 4", 3),
                    new Task("Tarea 5", 1),
                    new Task("Tarea 6", 2),
                    new Task("Tarea 7", 3),
                    new Task("Tarea 8", 1),
                    new Task("Tarea 9", 2),
                    new Task("Tarea 10", 3),
                    new Task("Tarea 11", 10),
                    new Task("Tarea 12", 1),
                    new Task("Tarea 13", 3),
                    new Task("Tarea 14", 2),
                    new Task("Tarea 15", 3)
            };

            for (Task task : tasks) {
                priorityQueueDataServer.addTask(task);
            }

            priorityQueueDataServer.processTasks();

            for (int i = 16; i <= 20; i++) {
                diskAuxiliaryDataServer.addTask(new Task("Tarea " + i, 1));
            }

            diskAuxiliaryDataServer.processTasks();
        }
    }