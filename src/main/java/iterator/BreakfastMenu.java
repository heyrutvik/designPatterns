package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakfastMenu implements Menu {
    ArrayList menuItems;

    public BreakfastMenu() {
        menuItems = new ArrayList();
        addItem("breakfast1", "type 1 breakfast");
        addItem("breakfast2", "type 2 breakfast");
        addItem("breakfast3", "type 3 breakfast");
    }

    public void addItem(String name, String desc) {
        MenuItem mi = new MenuItem(name, desc);
        menuItems.add(mi);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
