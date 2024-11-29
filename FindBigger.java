import java.util.Scanner;

public class FindBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int a = scanner.nextInt();

        System.out.print("Enter second value: ");
        int b = scanner.nextInt();
         b = 1; 

        int biggerValue = Math.max(a, b);

        System.out.println("The bigger value is: " + biggerValue);

        scanner.close();
    }
}