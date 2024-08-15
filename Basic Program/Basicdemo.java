import java.util.Scanner; 
class Basicdemo{
    public static void main (String[] arg){
    //    int rollno=12;
    //    char letter ='e';
    //    float mark= 34.34f;
    //    double largedecimalnumber = 234343.2233;
    //    long largeinteger = 2828492;
    //    boolean check =false;

    Scanner input = new Scanner(System.in);
    input.close();
//   System.out.print("Please enter some input.");
//  int rollno = input.nextInt();
//  System.out.println("This is rollno. "+ rollno);
//  int a =123_000_000;
//    System.out.print(a);
   String name=  input.next();
    System.out.print(name);
     float marks= input.nextFloat();
    System.out.print(marks);

    }

}