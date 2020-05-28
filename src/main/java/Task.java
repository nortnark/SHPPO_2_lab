import java.util.Scanner;

public class Task {

    // Объявление используемой переменной
    //==================
    private String task;
    Scanner scanner = new Scanner(System.in);
    //=================
    //Конструктор
    public Task() {
    }

    //=================

    // Геттер для вывода значения приватной переменной
    public String getTask() {
        return task;
    }

    //Метод класса Task для создания новой задачи
    public String makeNewTask() {
        System.out.println("Новая задача: ");
        task = scanner.nextLine();
        return task;
    }

    //==================

    //Метод класса Task для изменения существующей задачи
    public  String editTheTask() {
        String check;
        System.out.println("Изменить задачу '" + task + "': ");
        check = scanner.nextLine();
        if (!check.equals("")) {
            task = check;
        }
        return task;
    }

    //==================
//
//    //Метод класса Task для удаления задачи
//    public String deleteTheTask() {
//        String text = task;
//        task = "";
//        return task;
//    }

    //==================

}