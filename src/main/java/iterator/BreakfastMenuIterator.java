package iterator;

import java.util.ArrayList;

public class BreakfastMenuIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;

    public BreakfastMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        MenuItem mi = (MenuItem) menuItems.get(position);
        position++;
        return mi;
    }

    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
}
