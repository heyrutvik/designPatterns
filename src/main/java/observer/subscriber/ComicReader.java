package observer.subscriber;

import observer.Publisher;
import observer.comic.Comic;

public class ComicReader implements Subscriber {

    private String name;
    private Publisher publisher;

    public ComicReader(String s, Publisher p) {
        name = s;
        publisher = p;
        p.addSubscriber(this);
    }

    public void removeSubscription() {
        publisher.removeSubscriber(this);
    }

    public void changeSubscription(Publisher p) {
        publisher.removeSubscriber(this);
        publisher = p;
        publisher.addSubscriber(this);
    }

    public void update(Object o) {
        if (o instanceof Comic) {
            Comic c = (Comic)o;
            c.read(name);
        }
    }

    public String toString() {
        return name;
    }
}
