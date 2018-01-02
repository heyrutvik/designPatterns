package observer;

import observer.subscriber.Subscriber;

import java.util.ArrayList;

public abstract class Publisher {

    private ArrayList subscribers;

    public Publisher() {
        subscribers = new ArrayList();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        int i = subscribers.indexOf(subscriber);
        if (i >= 0) {
            subscribers.remove(i);
        }
    }

    public void notifySubscribers(Object o) {
        for (Object sub : subscribers) {
            Subscriber s = (Subscriber)sub;
            s.update(this, o);
        }
    }

    public void notifySubscribers() {
        notifySubscribers(null);
    }

    public void pushMechanism(Object o) {
        notifySubscribers(o);
    }

    public void pullMechanism() {
        notifySubscribers();
    }
}

/*
1) strive for loosely coupled designs
   between objects that interact
 */