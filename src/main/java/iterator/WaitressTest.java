package iterator;

public class WaitressTest {
    public static void main(String[] args) {
        Waitress w = new Waitress(new BreakfastMenu(), new LunchMenu());
        w.printMenu();
    }
}
