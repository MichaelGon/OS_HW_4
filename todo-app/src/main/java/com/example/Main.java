package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Введите команду (add, complete, list, exit):");
            String command = scanner.nextLine();
            
            switch (command) {
                case "add":
                    System.out.println("Введите название задачи:");
                    String taskName = scanner.nextLine();
                    taskManager.addTask(taskName);
                    break;
                case "complete":
                    System.out.println("Введите номер задачи для завершения:");
                    int index = Integer.parseInt(scanner.nextLine());
                    taskManager.completeTask(index);
                    break;
                case "list":
                    for (int i = 0; i < taskManager.getTasks().size(); i++) {
                        System.out.println(i + ": " + taskManager.getTasks().get(i));
                    }
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Неизвестная команда.");
            }
        }
    }
}
