public class Factorial {

    public static void main(String[] args) {

        int num = 40;
        long factorial = 2;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}