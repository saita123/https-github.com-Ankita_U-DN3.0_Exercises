import java.util.Scanner;

public class Main {

    static class Task {
        private int taskId;
        private String taskName;
        private String status;
        private Task next;

        public Task(int taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
            this.next = null;
        }

        public int getTaskId() {
            return taskId;
        }

        public String getTaskName() {
            return taskName;
        }

        public String getStatus() {
            return status;
        }

        public Task getNext() {
            return next;
        }

        public void setNext(Task next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Task ID: " + taskId + ", Task Name: " + taskName + ", Status: " + status;
        }
    }

    private static Task head = null;

    public static void addTask(int taskId, String taskName, String status) {
        Task newTask = new Task(taskId, taskName, status);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newTask);
        }
        System.out.println("Task added successfully!");
    }

    public static Task searchTask(int taskId) {
        Task current = head;
        while (current != null) {
            if (current.getTaskId() == taskId) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public static void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public static void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task not found.");
            return;
        }

        if (head.getTaskId() == taskId) {
            head = head.getNext();
            System.out.println("Task deleted successfully!");
            return;
        }

        Task current = head;
        while (current.getNext() != null) {
            if (current.getNext().getTaskId() == taskId) {
                current.setNext(current.getNext().getNext());
                System.out.println("Task deleted successfully!");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Task not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   System.out.println("Task Management System");

        while (true) {
         
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Traverse Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine(); // consume the newline

                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine();

                    System.out.print("Enter Status: ");
                    String status = scanner.nextLine();

                    addTask(taskId, taskName, status);
                    break;
                case 2:
                    System.out.print("Enter Task ID to search: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine(); // consume the newline

                    Task foundTask = searchTask(searchId);
                    if (foundTask != null) {
                        System.out.println("Task found: " + foundTask);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    System.out.println("Tasks:");
                    traverseTasks();
                    break;
                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // consume the newline

                    deleteTask(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
