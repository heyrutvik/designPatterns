package command.example.device;

public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "'s light on!");
    }

    public void off() {
        System.out.println(location + "'s light off!");
    }
}
