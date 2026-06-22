import java.util.*;

public class MovieRentalSystem {
    private TreeSet<int[]> rented;
    private HashMap<Integer, TreeSet<int[]>> inventory;

    public MovieRentalSystem(int n, int[][] entries) {
        rented = new TreeSet<>((a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        inventory = new HashMap<>();
        for (int[] e : entries) {
            int shop = e[0], movie = e[1], price = e[2];
            inventory.computeIfAbsent(movie, k -> new TreeSet<>((a, b) -> {
                if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
                return Integer.compare(a[0], b[0]);
            })).add(new int[]{shop, price});
        }
    }

    public void rent(int shop, int movie, int price) {
        rented.add(new int[]{shop, price, movie});
        inventory.get(movie).remove(new int[]{shop, price});
    }

    public void drop(int shop, int movie, int price) {
        rented.remove(new int[]{shop, price, movie});
        inventory.computeIfAbsent(movie, k -> new TreeSet<>((a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        })).add(new int[]{shop, price});
    }

    public List<List<Integer>> report() {
        List<List<Integer>> result = new ArrayList<>();
        for (int[] r : rented) {
            if (result.size() == 5) break;
            result.add(Arrays.asList(r[0], r[2]));
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] entries = {{1, 101, 5}, {2, 101, 7}, {3, 102, 3}};
        MovieRentalSystem mrs = new MovieRentalSystem(3, entries);
        System.out.println(mrs.report());
        mrs.rent(1, 101, 5);
        System.out.println(mrs.report());
        mrs.drop(1, 101, 5);
        System.out.println(mrs.report());
    }
}
