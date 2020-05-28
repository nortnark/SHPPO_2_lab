import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<Task> taskList = new ArrayList<>();

    public void addTask(Task task){
        task.makeNewTask();
        taskList.add(task);
    }

    public int getSize() {
        return taskList.size();
    }

    public void editTask(int index) {
        taskList.get(index).editTheTask();
    }
    public void deleteTask(int index){
        taskList.remove(index);
    }

    public void printList() {
        if (taskList.size() != 0) {
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println(i + ". " + taskList.get(i).getTask());
            }
        }
    }


}
