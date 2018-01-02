package observer;

import observer.comic.Hulk;
import observer.comic.Ironman;
import observer.subscriber.ComicReader;

public class Marvel extends Publisher {
    public static void main(String[] args) {
        Marvel ironman = new Marvel();
        Marvel hulk = new Marvel();

        ComicReader rutvik = new ComicReader("rutvik",ironman);
        ComicReader pinak = new ComicReader("pinak",ironman);
        ComicReader shikha = new ComicReader("shikha",ironman);

        ComicReader pooja = new ComicReader("pooja",hulk);
        ComicReader komal = new ComicReader("komal",hulk);
        ComicReader kanti = new ComicReader("kanti",hulk);

        ironman.pushMechanism(new Ironman("001"));
        hulk.pushMechanism(new Hulk("001"));

        pinak.removeSubscription();
        shikha.changeSubscription(hulk);

        kanti.changeSubscription(ironman);
        pooja.removeSubscription();

        ironman.pushMechanism(new Ironman("002"));
        hulk.pushMechanism(new Hulk("002"));
    }
}
