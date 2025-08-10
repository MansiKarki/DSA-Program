public class Stringfunc {
    public static void main(String[] args) {
        String str = "  Hello Mansiii";

        // 1. Length of string
        System.out.println("Length: " + str.length());

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. Trim leading and trailing spaces
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 5. Get a substring
        System.out.println("Substring (6 to 10): " + str.substring(6, 10)); // "Java"

        // 6. Replace text
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 7. Check if string contains a word
        System.out.println("Contains 'World'? " + str.contains("World"));

        // 8. Check if string starts with "Hello"
        System.out.println("Starts with 'Hello'? " + str.trim().startsWith("Hello"));

        // 9. Check if string ends with "World"
        System.out.println("Ends with 'World'? " + str.trim().endsWith("World"));

        // 10. Split string into words
        String[] words = str.trim().split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
