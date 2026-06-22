public class MyHashSet {
    private boolean[] storage;

    public MyHashSet() {
        storage = new boolean[1000001];
    }

    public void add(int key) {
        storage[key] = true;
    }

    public void remove(int key) {
        storage[key] = false;
    }

    public boolean contains(int key) {
        return storage[key];
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(3));
        set.add(2);
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));
    }
}
