public class PaperProperties {
    public static void main(String[] args) {

        final double INCH_TO_MM = 25.4;   //converting inch to mm
        final double WIDTH_INCHES = 8.5;
        final double HEIGHT_INCHES = 11.0;

        double widthMm = WIDTH_INCHES * INCH_TO_MM;
        double heightMm = HEIGHT_INCHES * INCH_TO_MM;

        //calculate
        double perimeterMm = 2 * (widthMm + heightMm);
        double diagonalMm = Math.sqrt(Math.pow(widthMm, 2) + Math.pow(heightMm, 2));

        //result
        System.out.printf("Width in millimeters: %.2f mm%n", widthMm);
        System.out.printf("Height in millimeters: %.2f mm%n", heightMm);
        System.out.printf("Perimeter in millimeters: %.2f mm%n", perimeterMm);
        System.out.printf("Diagonal in millimeters: %.2f mm%n", diagonalMm);
    }
}

