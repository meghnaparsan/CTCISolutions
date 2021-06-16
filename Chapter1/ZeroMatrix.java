// Given an m x n matrix. If an element is 0, set its entire row and column to 0
public class ZeroMatrix {

    public static void main (String [] args) {
        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);

        System.out.println ("Result: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix [row].length; column++) {
                System.out.print(matrix [row][column] + "\t");
            }

            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) { 
        
        boolean zeroInColumn = false;
        boolean zeroInRow = false;
        
        for (int column = 0; column < matrix[0].length; column++) {
            if (matrix [0][column] == 0) {
                zeroInRow = true;
                break;
            }
        }
        
        for (int row = 0; row < matrix.length; row++) {
            if (matrix [row][0] == 0) {
                zeroInColumn = true;
                break;
            }
        }
        
        for (int row = 1; row < matrix.length; row++) {
            for (int column = 1; column < matrix [row].length; column++) {
                if (matrix [row][column] == 0) {
                    matrix [row][0] = 0;
                    matrix [0][column] = 0;
                }
            }
        }
        
        for (int column = 1; column < matrix [0].length; column++) {
            if (matrix [0][column] == 0) {
                setColumnZero (matrix, column);
            }
        }
        
        for (int row = 1; row < matrix.length; row++) {
            if (matrix [row][0] == 0) {
                setRowZero (matrix, row);
            }
        }
        
        if (zeroInColumn) {
            setColumnZero (matrix, 0);
        }
        
        if (zeroInRow) {
            setRowZero (matrix, 0);
        }
    }
    
    private static void setColumnZero (int [][] matrix, int column) {
        for (int col = 0; col < matrix.length; col++) {
            matrix [col][column] = 0;
        }
    }
        
    private static void setRowZero (int [][] matrix, int row) {
        for (int r = 0; r < matrix [0].length; r++) {
            matrix [row][r] = 0;
        }
    }   
}