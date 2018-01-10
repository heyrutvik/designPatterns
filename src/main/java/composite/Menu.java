package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    ArrayList menuComponents = new ArrayList();
    Iterator iterator = null;
    String name;
    String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void print() {
        System.out.println("\n" + name + " " + desc);
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent mc = (MenuComponent) iterator.next();
            mc.print();
        }
    }

    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}
