import java.util.Scanner;

public class odd_even {
   
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num1 = var1.nextInt();
      
      if (num1 % 2 == 0) {
         System.out.println("Your given number is even");
      } else {
         System.out.println("Your given number is odd");
      }

   }
}
    
