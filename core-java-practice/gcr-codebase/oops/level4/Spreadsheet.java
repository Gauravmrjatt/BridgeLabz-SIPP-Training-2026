import java.util.*;

public class Spreadsheet {
    private int[][] cells;
    private int rows;
    private int cols;

    public Spreadsheet(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cells = new int[rows][cols];
    }

    public void setCell(int row, int col, int value) {
        cells[row][col] = value;
    }

    public int getCell(int row, int col) {
        return cells[row][col];
    }

    public int sumRow(int row) {
        int sum = 0;
        for (int j = 0; j < cols; j++) sum += cells[row][j];
        return sum;
    }

    public int sumCol(int col) {
        int sum = 0;
        for (int i = 0; i < rows; i++) sum += cells[i][col];
        return sum;
    }

    public void reset(int row, int col) {
        cells[row][col] = 0;
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(cells[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Spreadsheet ss = new Spreadsheet(3, 3);
        ss.setCell(0, 0, 10);
        ss.setCell(0, 1, 20);
        ss.setCell(1, 2, 30);
        ss.display();
        System.out.println("Row 0 sum: " + ss.sumRow(0));
        System.out.println("Col 2 sum: " + ss.sumCol(2));
    }
}
