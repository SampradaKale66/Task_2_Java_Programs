import java.util.Scanner;

public class FibonacciSeries 
{
    public static void  main(String... args) 
    {
        int first = 0;
        int second = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("How many elements you want to print in a Fibonacci series");
        int n = in.nextInt();

        System.out.println("Fibonacci series");
        //System.out.println(first+" "+second+" ");

        int next;

        for(int i = 0;i<n;i++)
        {
            next = first + second;

            System.out.print(next + " ");

            first = second;
            second = next;
        }
        in.close();
    }
}