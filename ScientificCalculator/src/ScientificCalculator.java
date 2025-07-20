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
        //performRounding(scanner);
        //performCeiling(scanner);
        //performFloor(scanner);
        //performMinimum(scanner);
        //performMaximum(scanner);
        performOperation(scanner);
    }

    private static void performOperation(Scanner scanner) {
        boolean running = true;

        while (running) {
            displayMenu();

            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue; // or return; or break; depending on your loop
            }


            switch (choice) {
                case 1 -> performAddition(scanner);
                case 2 -> performSubtraction(scanner);
                case 3 -> performMultiplication(scanner);
                case 4 -> performDivision(scanner);
                case 5 -> performSquareRoot(scanner);
                case 6 -> performPower(scanner);
                case 7 -> performSine(scanner);
                case 8 -> performCosine(scanner);
                case 9 -> performTangent(scanner);
                case 10 -> performNaturalLogarithm(scanner);
                case 11 -> performLogarithmBase10(scanner);
                case 12 -> calculateAbsoluteValue(scanner);
                case 13 -> performRounding(scanner);
                case 14 -> performCeiling(scanner);
                case 15 -> performFloor(scanner);
                case 16 -> performMinimum(scanner);
                case 17 -> performMaximum(scanner);
                case 0 -> {
                    System.out.println("Exiting calculator. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
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

    public static void performMinimum(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = Math.min(num1, num2);
        System.out.println("The minimum value is: " + result);
    }
    public static void performMaximum(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = Math.max(num1, num2);
        System.out.println("The maximum value is: " + result);
    }




    public static void displayMenu() {
        System.out.println("\n=== Scientific Calculator ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Natural Logarithm (ln)");
        System.out.println("11. Base-10 Logarithm (log10)");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("16. Minimum");
        System.out.println("17. Maximum");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
    }



}
