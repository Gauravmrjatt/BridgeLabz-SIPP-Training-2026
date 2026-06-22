import java.util.Arrays;

public class MyHashMap {
    private int[] map;

    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }

    public static void main(String[] args) {
        MyHashMap hm = new MyHashMap();
        hm.put(1, 10);
        hm.put(2, 20);
        System.out.println(hm.get(1));
        System.out.println(hm.get(3));
        hm.put(2, 30);
        System.out.println(hm.get(2));
        hm.remove(2);
        System.out.println(hm.get(2));
    }
}
