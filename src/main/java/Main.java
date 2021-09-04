import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        Calculator calculator = new Calculator();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        boolean cont = true;

        System.out.println("Welcome to the calculator");

        while (cont) {
            System.out.println("Please enter a command: ");
            String command = reader.readLine();

            String[] commands = command.split(" ");

            if ("add".equals(commands[0])) {
                int a = Integer.parseInt(commands[1]);
                int b = Integer.parseInt(commands[2]);
                int value = calculator.add(a, b);
                System.out.println("Result: " + value);
            } else if ("subtract".equals(commands[0])) {
                int a = Integer.parseInt(commands[1]);
                int b = Integer.parseInt(commands[2]);
                int value = calculator.subtract(a, b);
                System.out.println("Result: " + value);
            } else if ("multiply".equals(commands[0])) {
                int a = Integer.parseInt(commands[1]);
                int b = Integer.parseInt(commands[2]);
                int value = calculator.multiply(a, b);
                System.out.println("Result: " + value);
            } else if ("divide".equals(commands[0])) {
                int a = Integer.parseInt(commands[1]);
                int b = Integer.parseInt(commands[2]);
                int value = calculator.divide(a, b);
                System.out.println("Result: " + value);
            } else if ("fibonacci".equals(commands[0])) {
                int n = Integer.parseInt(commands[1]);
                int value = calculator.fibonacciNumberFinder(n);
                System.out.println("Result: " + value);
            } else if ("binary".equals(commands[0])) {
                int n = Integer.parseInt(commands[1]);
                String value = calculator.intToBinaryNumber(n);
                System.out.println("Result: " + value);
            } else if ("quit".equals(commands[0])) {
                cont = false;
            } else {
                System.out.println("Invalid input");
            }

        }
    }
}
