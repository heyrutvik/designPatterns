package iterator;

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
}
