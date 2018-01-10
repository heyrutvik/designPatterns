package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class DinnerMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public DinnerMenu() {
        addItem("dinner1", "type 1 dinner");
        addItem("dinner2", "type 2 dinner");
        addItem("dinner3", "type 3 dinner");

    }

    public void addItem(String name, String desc) {
        MenuItem mi = new MenuItem(name, desc);
        menuItems.put(mi.getName(), mi);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
