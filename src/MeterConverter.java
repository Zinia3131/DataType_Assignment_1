import java.util.Scanner;

public class MeterConverter {
    public static void main(String[] args) {
        ///constant val
        final double METERS_TO_MILES = 0.000621371;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.3701;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter val in meters: ");
        double meters = scanner.nextDouble();

        //converting
        double miles = meters * METERS_TO_MILES;
        double feet = meters * METERS_TO_FEET;
        double inches = meters * METERS_TO_INCHES;

        //ans print
        System.out.printf("Miles: %.6f%n", miles);
        System.out.printf("Feet: %.2f%n", feet);
        System.out.printf("Inches: %.2f%n", inches);

        scanner.close();
    }
}

