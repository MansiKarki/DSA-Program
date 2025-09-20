import java.util.*;
public class SimpleClassMetho {
    String name;
    String addd;
    void accept(){
  System.out.println("Enter the Name of the Student:");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    System.out.println("Enter the Address:");
    addd = sc.nextLine();
    }
    void display(){
        System.out.println("Student Name " +name + "and Address are" +addd);
   

    }
    public static void main(String[] args) {
        SimpleClassMetho obj = new SimpleClassMetho();
        obj.accept();
        obj.display();
    }
}
