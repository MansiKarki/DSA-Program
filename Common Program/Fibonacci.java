public class Fibonacci {
   static void fiboo(int n){//fuc to print n fibonacci
        int num1=0;
        int num2=1;
        int counter=0;
        while(counter<n){
            System.out.println(num1+"");//print number
            //swap
            int num3=num2+num1;
            num1=num2;
            num2=num3;
            counter=counter+1;
        }
    }
    public static void main(String[] args) {
        int n=20;
        fiboo(n);//function call
    }
}
