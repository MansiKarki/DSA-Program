public class CmArg {
    public static void main(String[] args) {
        System.out.println("Using command Line");
        int a,b,c;
        a = Integer.parseInt(args[0]); // why we use this becoz to convert the string into number wihtout using the scanner class and taking the input form Command
        b = Integer.parseInt(args[1]);
        c=a/b;
        System.out.println("division is ="+c);
    }
}
