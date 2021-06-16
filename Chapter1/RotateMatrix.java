// Rotate Matrix
public class RotateMatrix {

    public static void main (String [] args) {
        int [][] matrix = {
            {5,1,9,11},
            {2,4,8,10},
            {13,3,6,7},
            {15,14,12,16}
        };

        rotate(matrix);

        System.out.println ("After Rotation");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix [row].length; column++) {
                System.out.print(matrix [row][column] + "\t");
            }

            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = row; column < matrix [row].length; column++) {
                int temp = matrix [row][column];
                matrix [row][column] = matrix [column][row];
                matrix [column][row] = temp;
            }
        }
        
        for (int row = 0; row < matrix.length; row++) {
            int end = matrix [row].length - 1;
            for (int column = 0; column < matrix [row].length / 2; column++) {
                int temp = matrix [row][column];
                matrix [row][column] = matrix [row][end];
                matrix [row][end] = temp;
                end--;
            }
        }
    }   
}