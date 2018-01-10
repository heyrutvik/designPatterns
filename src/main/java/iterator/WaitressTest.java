package iterator;

import java.util.ArrayList;

public class WaitressTest {
    public static void main(String[] args) {
        ArrayList menus = new ArrayList();
        menus.add(new BreakfastMenu());
        menus.add(new LunchMenu());
        menus.add(new DinerMenu());
        Waitress w = new Waitress(menus);
        w.printMenu();
    }
}
