package org.example.SpringMenu.task;

import org.example.SpringMenu.menu.Menu;
import org.example.SpringMenu.menu.menuitems.CreateItem;
import org.example.SpringMenu.menu.menuitems.DeleteItem;
import org.example.SpringMenu.menu.menuitems.EditItem;
import org.example.SpringMenu.menu.menuitems.ExitItem;

public class TaskManager {
    private final Menu taskMenu;
    private final Menu noTaskMenu;

    public TaskManager() {
        final Menu.Builder prototypeMenu = Menu.newBuilder()
                .addItem(new ExitItem())
                .addItem(new CreateItem());

        noTaskMenu = prototypeMenu.clone()
                .build();

        taskMenu = prototypeMenu.clone()
                .addItem(new EditItem())
                .addItem(new DeleteItem())
                .build();
    }

    public void show(TaskList taskList) {
        System.out.printf("\n====My tasks====\n%s\n=====Menu===\n", taskList.toString());

        if (taskList.getSize() == 0) {
            System.out.println(noTaskMenu);
        } else {
            System.out.println(taskMenu);
        }

        System.out.println("Введите номер пункта меню: ");
    }
}
