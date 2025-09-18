import java.util.Scanner;

public class palindrome {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversedNum = 0;
          int originalNum = num;
        while(num !=0)
        {
            int digit = num % 10;
            reversedNum=reversedNum * 10 + digit;
            num = num / 10;
        }
          System.out.println("Reversed number: " + reversedNum);
 if(reversedNum ==  originalNum) 
   {
    System.out.println("palindrome.");
   }
   else{
    System.out.println("The number is not a palindrome.");
   }
    sc.close();
    }
  
}
