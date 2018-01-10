package composite;

public abstract class MenuComponent {
    // for composite objects
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // for leaf objects
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDesc() {
        throw new UnsupportedOperationException();
    }

    // for both objects
    public void print() {
        throw new UnsupportedOperationException();
    }
}
