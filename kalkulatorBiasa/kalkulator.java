import java.util.Scanner;

// Kalkulator ini hanya bisa perkalian, pembagian, pengurangan dan penjumlahan

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");
        
        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input operator
        System.out.print("Enter operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation! Please use +, -, * or /.");
                scanner.close();
                return;
        }

        // Display result
        System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, op, num2, result);
        scanner.close();
    }
}
