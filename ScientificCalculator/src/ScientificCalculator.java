import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // performAddition(scanner);
        //performSubtraction(scanner);
        //performMultiplication(scanner);
        //performDivision(scanner);
        //performSquareRoot(scanner);
        //performPower(scanner);
        performSine(scanner);
    }
    public static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void performSubtraction(Scanner scanner){
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    public static void performMultiplication(Scanner scanner){
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.println("Result: " + result);
    }
    public static void performDivision(Scanner scanner) {
        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();

        if (denominator == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        double result = numerator / denominator;
        System.out.println("Result: " + result);
    }

    public static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter a number to find the square root: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("Error: Cannot calculate the square root of a negative number.");
            return;
        }

        double result = Math.sqrt(num);
        System.out.println("Square root: " + result);
    }

    public static void performPower(Scanner scanner) {
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static void performSine(Scanner scanner) {
        System.out.print("Enter the angle in degrees: ");
        double degrees = scanner.nextDouble();

        double radians = Math.toRadians(degrees);
        double result = Math.sin(radians);

        System.out.println("Sine of " + degrees + " degrees is: " + result);
    }

    public static void displayMenu() {

    }

}
