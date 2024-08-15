/**
 * Passbyvalue 
 */
public class Passbyvalue {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a + " " + b);
        String name ="mansi karki";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String name){
        name = "puni";//creating a new object
    }
    static void swap(int a , int b){
        int temp = a ;
        a=b;
        b=temp;
    }
}