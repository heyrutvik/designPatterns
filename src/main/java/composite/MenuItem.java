package composite;

public class MenuItem extends MenuComponent {
    String name;
    String desc;

    public MenuItem(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void print() {
        System.out.println(name + " " + desc);
    }
}
