// // Java loops

// // for loop
// public class Main {
//     public static void main(String[] args) {

//         for (int day = 1; day <= 5; day++) {
//             System.out.println(day);
//         }
//     }
// }



// // while loop
// public class Main {
//     public static void main(String[] args) {

//         int count = 1;

//         while (count <= 5) {
//             System.out.println(count);
//             count++;
//         }
//     }
// }



// // do-while loop

// public class Main {
//     public static void main(String[] args) {

//         int revisionRound = 1;

//         do {
//             System.out.println("Revision Round: " + revisionRound);
//             revisionRound++;
//         } while (revisionRound <= 3);
//     }
// }


// // Infinite loop
// // Infinite while loops
// while (true) {
//     System.out.println("This keeps running forever");
// }


// // infinite for loops
// int num = 1;

// while (num <= 5) {
//     System.out.println(num);
// }



// // Nested loops
// public class Main {
//     public static void main(String[] args) {

//         for (int row = 1; row <= 3; row++) {
//             for (int col = 1; col <= 3; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// // break and continue
// public class Main {
//     public static void main(String[] args) {

//         for (int testCase = 1; testCase <= 6; testCase++) {
//             if (testCase == 4) {
//                 break;
//             }
//             System.out.println(testCase);
//         }
//     }
// }




// public class Main {
//     public static void main(String[] args) {

//         for (int day = 1; day <= 5; day++) {
//             if (day == 3) {
//                 continue;
//             }
//             System.out.println(day);
//         }
//     }
// }



// // For-each loop
// public class Main {
//     public static void main(String[] args) {

//         String[] fruits = {"Apple", "Banana", "Cherry"};

//         for (String fruit : fruits) {
//             System.out.println(fruit);
//         }
//     }
// }