import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // performAddition(scanner);
        //performSubtraction(scanner);
        //performMultiplication(scanner);
        performDivision(scanner);
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
    public static void displayMenu() {

    }

}
