import java.util.*;
public class leapyrs {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the year of : ");
        year = Sc.nextInt();
        if(year % 4 == 0){
            System.out.println("Leap Years");
        }else{
            System.out.println("Non Leap Years");
        }
        Sc.close();
    }
}
