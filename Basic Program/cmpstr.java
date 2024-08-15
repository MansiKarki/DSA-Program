import java.util.Scanner;

public class cmpstr {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String name;
        
        System.out.println("Enter the String to compare ");
        name = Sc.next();
       
        if("admin".equals(name)){
            System.out.println("unlocked");
        } 
        else {
            System.out.println("locked");
        }
       
        Sc.close();
    }
}
