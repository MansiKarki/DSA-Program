import java.util.Scanner; 
class Add{
    public static void main (String[] arg){

Scanner input  =new Scanner(System.in);
int num1 = input.nextInt();
int num2 = input.nextInt();
input.close();
int add = num1 +num2;
System.out.print("the sum is"+  add);
    }

}