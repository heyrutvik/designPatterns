package iterator;

import java.util.Iterator;

public class LunchMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public LunchMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        MenuItem mi = menuItems[position];
        position++;
        return mi;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        // remove only if next
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you have done at least one next()");
        }
        // remove previous item using shifting
        if (menuItems[position-1] != null) {
            for (int i = (position-1); i < (menuItems.length - 1); i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
