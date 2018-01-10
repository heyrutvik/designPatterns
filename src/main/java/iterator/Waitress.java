package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIter = menus.iterator();
        while(menuIter.hasNext()) {
            Menu menu = (Menu)menuIter.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem mi = (MenuItem)iterator.next();
            System.out.println(mi.getName() + " " + mi.getDesc());
        }
    }
}
