package org.example.SpringMenu.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskList {
    private final List<Task> tasks = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public int getSize() {
        return tasks.size();
    }

    public void addTask() {
        System.out.println("Новая задача: ");
        tasks.add(new Task(scanner.nextLine()));
    }

    public void editTask(int index) {
        final Task task = tasks.get(index);
        System.out.printf("Изменить задачу \"%s\"\n", task.getTask());
        String newTask = scanner.nextLine();
        if (newTask.equals("")) {
            removeTask(index);
        } else {
            task.setTask(newTask);
        }
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {
            builder.append(i+1).append(". ").append(tasks.get(i).getTask()).append('\n');
        }
        return builder.toString();
    }

}
