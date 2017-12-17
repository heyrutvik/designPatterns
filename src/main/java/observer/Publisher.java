package observer;

import observer.subscriber.Subscriber;

import java.util.ArrayList;

public abstract class Publisher {

    private ArrayList subscribers;
    protected Object data;

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

    public void send() {
        for (Object sub : subscribers) {
            Subscriber s = (Subscriber)sub;
            s.update(data);
        }
    }

    public void setData(Object o) {
        data = o;
        send();
    }
}

/*
1) strive for loosely coupled designs
   between objects that interact
 */