import java.io.PrintStream;
import java.util.Scanner;

public class BasicCalculator {

    private static final PrintStream OUT = System.out;

    private static final PrintStream OUT2 = OUT;
    public static void main(String[] args) {
        
        double num1, num2;

        try (
        Scanner sc = new Scanner(System.in)) {
            OUT2.println("Enter the numbers");

            
            num1 = sc.nextDouble();

            num2 = sc.nextDouble();

            OUT2.println("Enter the operator (-,+,/,*)");

            char op = sc.next().charAt(0);

            double o = 0;

            switch (op) {

                
                case '-':

                    o = num1 - num2;

                    break;

                
                case '+':

                    o = num1 + num2;

                    break;

                
                case '/':

                    o = num1 / num2;

                    break;

                
                case '*':

                    o = num1 * num2;

                    break;

                default:

                    OUT2.println("You enter wrong input");

                    break;
            }

            OUT2.println("The final result:");

            OUT2.println();

            OUT2.println(num1 + " " + op + " " + num2
                    + " = " + o);
        }
    }
}