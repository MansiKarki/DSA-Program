public class comparestr2 {
    int com(String str1, String str2) {
        int result = str1.compareTo(str2); 
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        return result;  
    }

    public static void main(String[] args) {
        String str1 = "Mansi";
        String str2 = "Karki";
        comparestr2 obj = new comparestr2();
        int res = obj.com(str1, str2);
        System.out.println("Comparison result: "+ res);
        //The Code Correct Code 
    }
}
