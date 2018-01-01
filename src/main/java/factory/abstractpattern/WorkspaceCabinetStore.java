package factory.abstractpattern;

public class WorkspaceCabinetStore extends CabinetStore {

    CabinetFactory fc = new WorkspaceCabinetFactory();

    public Cabinet create(String type) {
        if (type.compareTo("cheap") == 0) {
            return new WorkspaceCabinet(fc, 512);
        } else if (type.compareTo("expensive") == 0) {
            return new WorkspaceCabinet(fc, 1024);
        }
        return null;
    }
}
