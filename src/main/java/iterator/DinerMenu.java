package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class DinerMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public DinerMenu() {
        addItem("diner1", "type 1 diner");
        addItem("diner2", "type 2 diner");
        addItem("diner3", "type 3 diner");

    }

    public void addItem(String name, String desc) {
        MenuItem mi = new MenuItem(name, desc);
        menuItems.put(mi.getName(), mi);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
