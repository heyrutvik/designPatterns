package state;

public class MachineTest {

    public static void main(String[] args) {
        Machine m = new Machine(10, 10);
        m.coin();
        m.turn();
        m.turn();
        m.coin();
        m.coin();
        m.print();
    }
}
