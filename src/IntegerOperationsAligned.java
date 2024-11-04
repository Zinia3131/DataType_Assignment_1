import java.util.Scanner;

public class IntegerOperationsAligned {
    public static void main(String[] args)
    {
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


        System.out.printf("%-12s %d%n", "Sum:", sum);
        System.out.printf("%-12s %d%n", "Difference:", difference);
        System.out.printf("%-12s %d%n", "Product:", product);
        System.out.printf("%-12s %.2f%n", "Average:", average);
        System.out.printf("%-12s %d%n", "Distance:", distance);
        System.out.printf("%-12s %d%n", "Maximum:", max);
        System.out.printf("%-12s %d%n", "Minimum:", min);

        scanner.close();
    }
}

