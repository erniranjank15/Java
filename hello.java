import java.util.Scanner;



public class hello {
    public static void main(String[] args) {
        System.out.println("Hello, NK!");
        System.out.println("Hello, Niranjan!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}