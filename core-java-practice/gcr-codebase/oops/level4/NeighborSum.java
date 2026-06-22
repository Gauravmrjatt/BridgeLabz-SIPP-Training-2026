public class NeighborSum {
    private int[][] grid;
    private int n;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
    }

    public int adjacentSum(int value) {
        int[] pos = find(value);
        int sum = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] d : dirs) {
            int nr = pos[0] + d[0], nc = pos[1] + d[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                sum += grid[nr][nc];
            }
        }
        return sum;
    }

    public int diagonalSum(int value) {
        int[] pos = find(value);
        int sum = 0;
        int[][] dirs = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        for (int[] d : dirs) {
            int nr = pos[0] + d[0], nc = pos[1] + d[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                sum += grid[nr][nc];
            }
        }
        return sum;
    }

    private int[] find(int value) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        NeighborSum ns = new NeighborSum(grid);
        System.out.println(ns.adjacentSum(5));
        System.out.println(ns.diagonalSum(5));
    }
}
