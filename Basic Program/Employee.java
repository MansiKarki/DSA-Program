import java.util.*;
public class Employee {
    Scanner sc = new Scanner(System.in);
    String name , Place ;
    int salary;
    void Read(){
        System.out.println("Enter the Name Of emp");
        name = sc.next();
        System.out.println("Enter the Place Of emp");
        Place = sc.next();
        System.out.println("Enter the salary Of emp");
        salary = sc.nextInt();
        

    }
    void display(){
        System.out.println("The Name Of emp :  " + name);
        System.out.println("Current Place : " + Place);
        System.out.println("Per Month Salary :" + salary);
    }

    public static void main(String[] args) {
       Employee em = new Employee();
       em.Read();
       em.display();
    }
}
