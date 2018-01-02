package observer.subscriber;

import observer.Publisher;

public interface Subscriber {
    /**
     * use 'Publisher p' for pull mechanism
     * use 'Object o' for push mechanism
     */
    void update(Publisher p, Object o);
}
