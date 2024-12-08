package ToDoListApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println(" To-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Tasks");
            System.out.println("4. Exit\n");

            System.out.print("Choose an Option: ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println();

            switch (choice) {
                case 1: // Add Task
                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task Added!");
                    System.out.println();
                    break;
                case 2: //View Tasks
                    System.out.println("Your Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Found!");
                        System.out.println();
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.println();
                    }
                    break;
                case 3: //Remove Tasks
                    System.out.print("Enter the task number to remove : ");
                    int taskNumber = Integer.parseInt(sc.nextLine());

                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Task Removed!");
                    } else {
                        System.out.println("Invalid Task Number!");
                    }
                    System.out.println();
                    break;
                case 4: //Exit
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Number!");
            }
        }


    }

}
