package composite;

public class WaitressTest {

    public static void main(String[] args) {
        MenuComponent breakfast = new Menu("Breakfast Menu", "breakfast");
        breakfast.add(new MenuItem("breakfast 1", "type 1 breakfast"));
        breakfast.add(new MenuItem("breakfast 2", "type 2 breakfast"));
        breakfast.add(new MenuItem("breakfast 3", "type 3 breakfast"));

        MenuComponent lunch = new Menu("Lunch Menu", "lunch");
        lunch.add(new MenuItem("lunch 1", "type 2 lunch"));

        MenuComponent diner = new Menu("Dinner Menu", "diner");
        diner.add(new MenuItem("diner 1", "type 1 diner"));

        MenuComponent dessert = new Menu("Dessert Menu", "dessert");
        dessert.add(new MenuItem("dessert 1", "type 1 dessert"));
        diner.add(dessert);

        MenuComponent allMenu = new Menu("All Menu", "combined");
        allMenu.add(breakfast);
        allMenu.add(lunch);
        allMenu.add(diner);
        
        Waitress waitress = new Waitress(allMenu);
        waitress.print();
    }
}
