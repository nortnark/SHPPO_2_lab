import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TaskManager taskManager = context.getBean("taskManager", TaskManager.class);
        TaskList taskList = context.getBean("taskList", TaskList.class);
        int choose = 1;
        int index;
        Scanner scanner = new Scanner(System.in);
        while (choose != 0) {
            taskManager.showInterface(taskList);
            choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Goodbye.");
                    break;
                case 1:
                    taskList.addTask(new Task());
                    break;
                case 2:
                    System.out.println("Введите номер задачи, которую хотите изменить: ");
                    index= scanner.nextInt();
                    taskList.editTask(index);
                    break;
                case 3:
                    System.out.println("Введите номер задачи, которую хотите удалить: ");
                    index = scanner.nextInt();
                    taskList.deleteTask(index);
                    break;
            }
        }
    }
}
