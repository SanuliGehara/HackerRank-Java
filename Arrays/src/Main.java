public class Main {
    public static void twoDArray() {
        int[][] nums2D = new int[3][4];

        // Initialize 2D Array as 1
        for (int[] rowArray: nums2D) {
            for (int index = 0; index < rowArray.length; index++) {
                rowArray[index] = 1;
            }
        }

        // Display array
        for (int row=0; row<nums2D.length; row++) {
            for(int j=0; j<nums2D[row].length; j++) {
                System.out.print( nums2D[row][j] + " " );
            }
            System.out.println();
        }
    }

    public static void jaggedArray() {int[][] jaggedArray = new int[4][];  // doesn't specify the size for internal arrays
        jaggedArray[0] = new int[10]; // length = 2
        jaggedArray[1] = new int[9];
        jaggedArray[2] = new int[13];
        jaggedArray[3] = new int[11];

        for (int i=0; i< jaggedArray.length; i++) {
            for (int j=0; j<jaggedArray[i].length; j++) {
                // Assign a random value from 1 -10
                int random = (int)(Math.random() * 10);
                jaggedArray[i][j] = random;
            }
        }

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }}

    public static void threeDArray() {
        /*
         * [2] => Two rows
         * [5] => Five Columns
         * [3] => Three elements per array in each column
         * */
        int[][][] threeDArray = new int[2][5][3];

        for (int[][] twoD: threeDArray) {
            for(int[] array: twoD) {
                for (int i = 0; i<array.length; i++) {
                    array[i] = (int)(Math.random() * 10);
                }
            }
        }

        // print values
        for (int[][] twoD: threeDArray) {
            for(int[] array: twoD) {
                for (int i : array) {
                    System.out.print(i + " ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Simple 2D array creation
        twoDArray();

        // Jagged Array -> MultiDimenional Array with Different number of length
        System.out.println("\nJagged Array");
        jaggedArray();

        // 3D Array
        System.out.println("\n3D Array -> int [2][5][3]");
        threeDArray();
    }

}