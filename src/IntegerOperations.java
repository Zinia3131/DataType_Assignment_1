import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2.0;
        int distance = Math.abs(difference);
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        //results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        scanner.close();
    }
}
