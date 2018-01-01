package factory.abstractpattern;

public class AlienwareCabinetStore extends CabinetStore {

    CabinetFactory fc = new AlienwareCabinetFactory();

    public Cabinet create(String type) {
        if (type.compareTo("cheap") == 0) {
            return new AlienwareCabinet(fc, 512);
        } else if (type.compareTo("expensive") == 0) {
            return new AlienwareCabinet(fc, 1024);
        }
        return null;
    }
}
