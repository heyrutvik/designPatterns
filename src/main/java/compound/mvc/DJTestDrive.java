package compound.mvc;

import compound.mvc.controller.BeatController;
import compound.mvc.controller.ControllerInterface;
import compound.mvc.model.BeatModel;
import compound.mvc.model.BeatModelInterface;

public class DJTestDrive {
    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
