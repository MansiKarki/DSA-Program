import java.util.*;;
public class factorial {
    public static void main(String arg[]){
        Scanner Sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number : ");
        number = Sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("the factorial"+fact);
        Sc.close();
    }
}
