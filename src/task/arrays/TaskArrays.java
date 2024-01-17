package task.arrays;

public class TaskArrays {
    public static void main(String[] args) {
        int[][] result = new int[2][5];
        int[][] array = {
                {0,1},
                {2,3},
                {4,5},
                {6,7},
                {8,9},
        };
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array[j][i];
            }
        }
        System.out.println("------");
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static class Main {
        public static void main(String[] args) {

        }
    }
}


