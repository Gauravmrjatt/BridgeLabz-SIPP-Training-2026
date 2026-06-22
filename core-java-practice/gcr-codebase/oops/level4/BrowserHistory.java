public class BrowserHistory {
    private String[] history;
    private int current;
    private int size;

    public BrowserHistory(String homepage) {
        history = new String[5000];
        history[0] = homepage;
        current = 0;
        size = 1;
    }

    public void visit(String url) {
        current++;
        history[current] = url;
        size = current + 1;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history[current];
    }

    public String forward(int steps) {
        current = Math.min(size - 1, current + steps);
        return history[current];
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("google.com");
        bh.visit("youtube.com");
        bh.visit("github.com");
        System.out.println(bh.back(1));
        System.out.println(bh.back(1));
        System.out.println(bh.forward(1));
        bh.visit("stackoverflow.com");
        System.out.println(bh.forward(2));
        System.out.println(bh.back(2));
    }
}
