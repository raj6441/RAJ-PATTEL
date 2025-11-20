import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String op = sc.next();

        double result = 0;

        switch (op) {
            case "+":
            case "add":
                result = a + b;
                break;

            case "-":
            case "sub":
                result = a - b;
                break;

            case "*":
            case "mul":
                result = a * b;
                break;

            case "/":
            case "div":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operation.");
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
