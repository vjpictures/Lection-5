package task.arrays;

public class TaskArrays {
    public static int[][] transpose(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        int[][] transposeArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeArray[j][i] = array[i][j];
            }
        }
        return transposeArray;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {0, 1},
                {2, 3},
                {4, 5},
                {6, 7},
                {8, 9},
        };

        int[][] transposeArray = transpose(array);

        System.out.println("Original Array:");
        printArray(array);

        System.out.println("\nTranspose Array:");
        printArray(transposeArray);
    }
}



