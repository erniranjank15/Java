// // Array Basics

// // Declaring an array
// int[] arr;

// // Initializing an array
// int[] arr = new int[5];
// int[] arr = {1, 2, 3, 4, 5};

// // Accessing array elements or traversing an array
// for (int i = 0; i < arr.length; i++) {
//     System.out.println(arr[i]);
// }


// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
//     sum += arr[i];
// }



// // 2D Arrays

// // Declaring a 2D array
// int[][] matrix;


// // Initializing a 2D array
// int[][] matrix = new int[3][3];
// int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };


// // Accessing 2D array elements
// System.out.println(matrix[1][2]); // 6

// // Traversing a 2D array
// for (int i = 0; i < matrix.length; i++) {
//     for (int j = 0; j < matrix[i].length; j++) {
//         System.out.print(matrix[i][j] + " ");
//     }
//     System.out.println();
// }


// for (int i = 0; i < matrix.length; i++) {
//     for (int j = 0; j < matrixi.length; j++) {
//         System.out.print(matrixij + " ");
//     }
//     System.out.println();
// }




public class arrays {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}