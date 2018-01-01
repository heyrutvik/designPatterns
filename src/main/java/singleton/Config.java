package singleton;

public class Config {

    private volatile static Config c = null;
    int count;

    private Config() {
        count = 0;
    }

    public void inc() {
        count++;
    }

    public int get() {
        return count;
    }

    /**
     * c may override while using with multi-threaded code
     */
    public static Config getInstance() {
        if (c == null) {
            c = new Config();
        }
        return c;
    }

    /**
     * synchronization in getInstance()
     */
    public synchronized static Config getInstanceSync() {
        if (c == null) {
            c = new Config();
        }
        return c;
    }

    /**
     * double-checked locking to reduce the use of
     * synchronization in getInstance()
     */
    public static Config getInstanceDoubleCheck() {
        if (c == null) {
            synchronized (Config.class) {
                if (c == null) {
                    c = new Config();
                }
            }
        }
        return c;
    }
}
