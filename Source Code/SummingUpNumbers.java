// Program to find the sum of natural numbers from 1 to 1000.

class SummingUpNumbers {
   public static void main(String[] args) {
      
      int sum = 0;
	   
      for (int i = 1; i <= 5; ++i) {
         sum += i;     // sum = sum + i
	System.out.println("i = " + i);
	System.out.println("Sum = " + sum);
      }
	   
      System.out.println("Total Sum = " + sum);
   }
}