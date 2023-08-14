import java.util.PriorityQueue;

public class PriorityQueueDataServer implements DataServer {
    private PriorityQueue<Task> priorityQueue = new PriorityQueue<>((t1, t2) -> Integer.compare(t2.getPriority(), t1.getPriority()));

    @Override
    public void addTask(Task task) {
        priorityQueue.offer(task);
    }

    @Override
    public void processTasks() {
        while (!priorityQueue.isEmpty()) {
            Task task = priorityQueue.poll();
            System.out.println("Processing task: " + task.getName() + " with priority: " + task.getPriority());
        }
    }
}