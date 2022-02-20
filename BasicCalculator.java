import java.io.PrintStream;
import java.util.Scanner;

public class BasicCalculator {

    /**
     *
     */
    private static final PrintStream OUT = System.out;
    /**
     *
     */
    private static final PrintStream OUT2 = OUT;
    public static void main(String[] args) {
        // stores two numbers
        double num1, num2;

        try (// Take input from the user
        Scanner sc = new Scanner(System.in)) {
            OUT2.println("Enter the numbers");

            // take the inputs
            num1 = sc.nextDouble();

            num2 = sc.nextDouble();

            OUT2.println("Enter the operator (-,+,/,*)");

            char op = sc.next().charAt(0);

            double o = 0;

            switch (op) {

                // case to subtract two numbers
                case '-':

                    o = num1 - num2;

                    break;

                // case to add two numbers
                case '+':

                    o = num1 + num2;

                    break;

                // case to divide two numbers
                case '/':

                    o = num1 / num2;

                    break;

                // case to multiply two numbers
                case '*':

                    o = num1 * num2;

                    break;

                default:

                    OUT2.println("You enter wrong input");

                    break;
            }

            OUT2.println("The final result:");

            OUT2.println();

            // print the final result
            OUT2.println(num1 + " " + op + " " + num2
                    + " = " + o);
        }
    }
}