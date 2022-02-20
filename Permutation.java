public class Permutation {
   static int factorial(int n) {
      int fact = 1;
      int i = 1;
      while (i <= n) {
         fact *= i;
         i++;
      }
      return fact;
   }

   public static void main(String args[]) {
      int n = 8, r = 4, comb, per;
      per = factorial(n) / factorial(n - r);
      comb = factorial(n) / (factorial(r) * factorial(n - r));
      System.out.println("Combination: " + comb);
      
      System.out.println("Permutation: " + per);
   }
}