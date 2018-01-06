package command.example.device;

public class Fan {

    String location;

    public Fan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "'s fan on!");
    }

    public void off() {
        System.out.println(location + "'s fan off!");
    }
}
