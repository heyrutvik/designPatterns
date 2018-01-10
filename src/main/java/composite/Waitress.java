package composite;

import java.util.Iterator;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void internalIteratorPrint() {
        allMenus.print();
    }

    public void externalIteratorPrint() {
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent m = (MenuComponent)iterator.next();
            System.out.println(m.getName() + " " + m.getDesc());
        }
    }
}
