import java.util.LinkedList;
import java.util.Queue;

public class DiskAuxiliaryDataServer implements DataServer {
    private Queue<Task> auxiliaryQueue = new LinkedList<>();

    @Override
    public void addTask(Task task) {
        auxiliaryQueue.offer(task);
    }

    @Override
    public void processTasks() {
        while (!auxiliaryQueue.isEmpty()) {
            Task task = auxiliaryQueue.poll();
            System.out.println("Moving task from disk auxiliary to priority queue: " + task.getName() + " with priority: " + task.getPriority());
        }
    }
}
