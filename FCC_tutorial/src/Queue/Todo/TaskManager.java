package Queue.Todo;

import java.util.*;

public class TaskManager {
    private Scanner scanner = new Scanner(System.in);
    private Queue<Task> taskList = new PriorityQueue<>((o1, o2) -> -o1.getPriority().compareTo(o2.getPriority()));

    private void addTask(Task newTask) {
        Optional<Task> task = Optional.ofNullable(newTask);

        if (task.isPresent()) {
            taskList.add(task.get());
        } else {
            throw new IllegalArgumentException("Not a valid input");
        }
    }

    private Task handleGetTaskData() {
        System.out.println("Enter Task name:");
        String taskName = scanner.nextLine();

        System.out.println("Enter task description:");
        String description = scanner.nextLine();

        System.out.println("Enter task priority: " + "LOW= 0, MEDIUM= 1, HIGH= 2");
        Integer selectedPriority = Integer.valueOf(scanner.nextLine());
        Priority priority = handlePriorityInput(selectedPriority);
        System.out.println(priority);

        return new Task(taskName, description, priority);
    }

    private Priority handlePriorityInput(Integer selectedPriority) {
//        while (!selectedPriority.equals(Priority.LOW.getValue()) ||
//                !selectedPriority.equals(Priority.MODERATE.getValue()) ||
//                !selectedPriority.equals(Priority.HIGH.getValue())) {
//        }
        Priority taskPriority = null;
        for (Priority priority : Priority.values()) {
            if (priority.getValue() == selectedPriority) {
                taskPriority = priority;
            }
        }
        System.out.println(taskPriority);
        return taskPriority;
    }

    public void init() {
        System.out.println("Select app mode: 1: Add task, 2. Poll task, 3. Exit app");
        Integer userInput = Integer.valueOf(scanner.nextLine());

        if (userInput.equals(AppMode.ADD_TASK.getValue())) {
             Task task = handleGetTaskData();
             addTask(task);
             System.out.println(taskList);
        }
        if (userInput.equals(AppMode.POLL_TASK.getValue())) {
            taskList.poll();
            System.out.println(taskList);

        }
        if (userInput.equals(AppMode.EXIT.getValue())) {
            System.out.println("exit");
            return;
        }

        init();
    }
}
