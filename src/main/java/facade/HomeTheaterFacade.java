package facade;

import facade.subsystems.*;

public class HomeTheaterFacade {

    DvdPlayer dvdPlayer;
    Projector projector;
    Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
    }

    public void startMovie() {
        screen.down();
        projector.on();
        projector.wideScreenMode();
        dvdPlayer.on();
        dvdPlayer.playMovie();
    }

    public void endMovie() {
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
        projector.off();
        screen.up();
    }
}
