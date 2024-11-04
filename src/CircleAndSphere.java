import java.util.Scanner;

public class CircleAndSphere {
    public static void main(String[] args) {

        final double PI = Math.PI;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double circleArea = PI * Math.pow(radius, 2);
        double circleCircumference = 2 * PI * radius;

        double sphereVolume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        double sphereSurfaceArea = 4 * PI * Math.pow(radius, 2);

        System.out.printf("Circle Area: %.2f%n", circleArea);
        System.out.printf("Circle Circumference: %.2f%n", circleCircumference);
        System.out.printf("Sphere Volume: %.2f%n", sphereVolume);
        System.out.printf("Sphere Surface Area: %.2f%n", sphereSurfaceArea);

        scanner.close();
    }
}

