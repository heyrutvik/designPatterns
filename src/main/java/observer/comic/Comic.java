package observer.comic;

public abstract class Comic {
    private String name;
    private String issueNumber;
    public Comic(String s, String issue) {
        name = s;
        issueNumber = issue;
    }
    public void read(String subscriber) {
        System.out.println(subscriber + " reading " + issueNumber + " of " + name);
    }
}
