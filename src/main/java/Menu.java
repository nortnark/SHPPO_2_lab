import java.util.ArrayList;
import java.util.List;

public class Menu {

    public void addExit() {
        System.out.println(new ExitItem().addItem());
    }

    public void addCreator() {
        System.out.println(new CreateItem().addItem());
    }

    public void addEditor() {
        System.out.println(new EditItem().addItem());
    }

    public void addCleaner() {
        System.out.println(new DeleteItem().addItem());
    }

}
