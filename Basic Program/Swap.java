public class Swap {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int temp;
        System.out.println( "Before Swap: a = " + a + ", b = " + b);
         temp=a;
         a=b;
         b=a;
        System.out.println( "After Swap: a = " + a + ", b = "+temp);
    
    }
}
