import java.util.Scanner;

public class AreaCalculator {
    public double area(double radius) {
        return 3.14 * radius * radius; 
    }

    public double area(double base, double height) {
        return 0.5 * base * height; 
    }

    public double area(int length, int width) {
        return length * width; 
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        double circleArea = calculator.area(radius);

        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = calculator.area(base, height);

        System.out.print("Enter length of rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter width of rectangle: ");
        int width = scanner.nextInt();
        double rectangleArea = calculator.area(length, width);

        System.out.println("Circle area: " + circleArea);
        System.out.println("Triangle area: " + triangleArea);
        System.out.println("Rectangle area: " + rectangleArea);

        scanner.close();
    }
}
