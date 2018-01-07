package facade;

import facade.subsystems.DvdPlayer;
import facade.subsystems.Projector;
import facade.subsystems.Screen;

public class FacadeTest {
    public static void main(String[] args) {

        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, screen);
        homeTheaterFacade.startMovie();
        homeTheaterFacade.endMovie();
    }
}
