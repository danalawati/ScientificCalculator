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
        //performSine(scanner);
        //performCosine(scanner);
        //performTangent(scanner);
        //performNaturalLogarithm(scanner);
        //performLogarithmBase10(scanner);
        //calculateAbsoluteValue(scanner);
        performRounding(scanner);
        performCeiling(scanner);
        performFloor(scanner);
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

    public static void performCosine(Scanner scanner) {
        System.out.print("Enter the angle in degrees: ");
        double degrees = scanner.nextDouble();

        double radians = Math.toRadians(degrees);
        double result = Math.cos(radians);

        System.out.println("Cosine of " + degrees + " degrees is: " + result);
    }

    public static void performTangent(Scanner scanner) {
        System.out.print("Enter the angle in degrees: ");
        double degrees = scanner.nextDouble();

        double mod = degrees % 180;
        if (Math.abs(mod - 90) < 1e-10) { //  floating point error
            System.out.println("Error: Tangent is undefined at " + degrees + " degrees.");
            return;
        }

        double radians = Math.toRadians(degrees);
        double result = Math.tan(radians);

        System.out.println("Tangent of " + degrees + " degrees is: " + result);
    }

    public static void performNaturalLogarithm(Scanner scanner) {
        System.out.print("Enter a positive number to calculate its natural logarithm (ln): ");
        double num = scanner.nextDouble();

        if (num <= 0) {
            System.out.println("Error: Natural logarithm is undefined for zero or negative numbers.");
            return;
        }

        double result = Math.log(num);
        System.out.println("Natural logarithm (ln) of " + num + " is: " + result);
    }

    public static void performLogarithmBase10(Scanner scanner) {
        System.out.print("Enter a positive number to calculate its base 10 logarithm: ");
        double num = scanner.nextDouble();

        if (num <= 0) {
            System.out.println("Error: Logarithm base 10 is undefined for zero or negative numbers.");
            return;
        }

        double result = Math.log10(num);
        System.out.println("Base 10 logarithm of " + num + " is: " + result);
    }

    public static void calculateAbsoluteValue(Scanner scanner) {
        System.out.print("Enter a number to calculate its absolute value: ");
        double num = scanner.nextDouble();

        double result = Math.abs(num);
        System.out.println("Absolute value of " + num + " is: " + result);
    }

    public static void performRounding(Scanner scanner) {
        System.out.print("Enter a number to round: ");
        double num = scanner.nextDouble();

        long result = Math.round(num);
        System.out.println("Rounded value of " + num + " is: " + result);
    }

    public static void performCeiling(Scanner scanner) {
        System.out.print("Enter a number to apply ceiling: ");
        double num = scanner.nextDouble();

        double result = Math.ceil(num);
        System.out.println("Ceiling value of " + num + " is: " + result);
    }

    public static void performFloor(Scanner scanner) {
        System.out.print("Enter a number to apply floor: ");
        double num = scanner.nextDouble();

        double result = Math.floor(num);
        System.out.println("Floor value of " + num + " is: " + result);
    }

    public static void displayMenu() {

    }

}
