package iterator;

import java.util.Iterator;

public class LunchMenu implements Menu {
    static final int MAX_ITEMS = 3;
    int currentIndex = 0;
    MenuItem[] menuItems;

    public LunchMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("lunch1", "type 1 lunch");
        addItem("lunch2", "type 2 lunch");
        addItem("lunch3", "type 3 lunch");
    }

    public void addItem(String name, String desc) {
        MenuItem mi = new MenuItem(name, desc);
        menuItems[currentIndex] = mi;
        currentIndex++;
    }

    public Iterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }
}
