public class Explicit {
    public static void main(String[] args) {
        double d=75.0;
        float f=(float)d;
        long l=(long)f;
        int i=(int)l;
        short s=(short)i;
        byte b=(byte)s;
         System.out.println("byte value  "+b);
        System.out.println("short value  "+s);
        System.out.println("integer value  "+i);
        System.out.println("long value  "+l);
        System.out.println("float value  "+f);
         System.out.println("double value  "+d);
    }
}
