import java.util.*;

public class ListWithMethod {

    // Method to print all elements in the list
    public static void printList(List<String> list) {
        System.out.println("List elements: " + list);
    }

    public static void main(String[] args) {
        // Create a list
        List<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Call method to print the list
        printList(fruits);

        // Remove an element and print again
        fruits.remove("Banana");
        printList(fruits);
    }
}

