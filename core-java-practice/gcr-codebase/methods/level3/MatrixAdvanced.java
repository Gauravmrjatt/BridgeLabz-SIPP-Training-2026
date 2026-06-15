import java.util.Random;

public class MatrixAdvanced {
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = matrix[i][j];
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = (double) matrix[1][1] / det;
        inv[0][1] = (double) -matrix[0][1] / det;
        inv[1][0] = (double) -matrix[1][0] / det;
        inv[1][1] = (double) matrix[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];
        inv[0][0] = (double) (e * i - f * h) / det;
        inv[0][1] = (double) -(b * i - c * h) / det;
        inv[0][2] = (double) (b * f - c * e) / det;
        inv[1][0] = (double) -(d * i - f * g) / det;
        inv[1][1] = (double) (a * i - c * g) / det;
        inv[1][2] = (double) -(a * f - c * d) / det;
        inv[2][0] = (double) (d * h - e * g) / det;
        inv[2][1] = (double) -(a * h - b * g) / det;
        inv[2][2] = (double) (a * e - b * d) / det;
        return inv;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void displayDoubleMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a2 = createRandomMatrix(2, 2);
        int[][] a3 = createRandomMatrix(3, 3);
        System.out.println("2x2 Matrix:");
        displayMatrix(a2);
        System.out.println("Transpose:");
        displayMatrix(transpose(a2));
        System.out.println("Determinant: " + determinant2x2(a2));
        System.out.println("Inverse:");
        double[][] inv2 = inverse2x2(a2);
        if (inv2 != null) displayDoubleMatrix(inv2);
        else System.out.println("Matrix is singular");
        System.out.println("\n3x3 Matrix:");
        displayMatrix(a3);
        System.out.println("Transpose:");
        displayMatrix(transpose(a3));
        System.out.println("Determinant: " + determinant3x3(a3));
        System.out.println("Inverse:");
        double[][] inv3 = inverse3x3(a3);
        if (inv3 != null) displayDoubleMatrix(inv3);
        else System.out.println("Matrix is singular");
    }
}
