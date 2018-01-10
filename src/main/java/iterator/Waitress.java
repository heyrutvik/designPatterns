package iterator;

import java.util.ArrayList;

public class Waitress {

    BreakfastMenu breakfastMenu;
    LunchMenu lunchMenu;

    public Waitress(BreakfastMenu breakfastMenu, LunchMenu lunchMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
    }

    public void printMenu() {
        Iterator breakfastItems = breakfastMenu.createIterator();
        System.out.println("---Breakfast Menu---");
        printMenu(breakfastItems);
        Iterator lunchItems = lunchMenu.createIterator();
        System.out.println("\n---Lunch Menu---");
        printMenu(lunchItems);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem mi = (MenuItem)iterator.next();
            System.out.println(mi.getName() + " " + mi.getDesc());
        }
    }
}
