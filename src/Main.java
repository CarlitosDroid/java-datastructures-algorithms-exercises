public class Main {

    public static void main(String[] args) {
        int [][]matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        printDiagonalsSums(matrix, 4);
    }

    /**
     * The Principal Diagonal: row = column (00, 11, 22, 33)
     * The Secondary Diagonal: row = numberOfRows - column - 1 (03, 12, 21, 30)
     * Time Complexity: O(n*n)
     * Auxiliary Space: O(1)
     */
    static void printDiagonalsSums(int [][]mat, int n) {
        int principal = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) // row = column
                    principal += mat[i][j];

                if((i + j) == (n - 1)) // row + column = numberOfRows - 1
                    secondary += mat[i][j];
            }
        }

        System.out.println("Principal Diagonal: " + principal);
        System.out.println("Secondary Diagonal: " + secondary);
    }
}
