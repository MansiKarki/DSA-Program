public class ReverseString {
    public static void main(String[] args) {
        String str = "MANSI";
        String reversed = "";

        for (int i = 4; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
