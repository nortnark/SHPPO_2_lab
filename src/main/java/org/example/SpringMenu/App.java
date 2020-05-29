package org.example.SpringMenu;

import org.example.SpringMenu.task.TaskList;
import org.example.SpringMenu.task.TaskManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App implements Runnable {

    private final TaskManager taskManager;
    private final TaskList taskList;

    public App(TaskManager taskManager, TaskList taskList) {
        this.taskManager = taskManager;
        this.taskList = taskList;
    }

    public static void main(String[] args) {
        try (
                ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                        "/applicationContext.xml"
                )
        ) {
            context.getBean(App.class).run();
        }
    }

    @Override
    public void run() {
        try (final Scanner scanner = new Scanner(System.in)){
            int choose;
            do {
                taskManager.show(taskList);
                choose = scanner.nextInt();
                switch (choose) {
                    case 0:
                        System.out.println("Goodbye.");
                        break;
                    case 1:
                        taskList.addTask();
                        break;
                    case 2:
                        System.out.println("Введите номер задачи, которую хотите изменить: ");
                        taskList.editTask(scanner.nextInt() - 1);
                        break;
                    case 3:
                        System.out.println("Введите номер задачи, которую хотите удалить: ");
                        taskList.removeTask(scanner.nextInt() - 1);
                        break;
                }
            } while (choose != 0);
        }
    }
}
