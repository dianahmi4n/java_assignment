import java.util.HashMap;

public class question_4{
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> studentAges = new HashMap<>();

        // Add key-value pairs
        studentAges.put("John", 20);
        studentAges.put("Alice", 22);
        studentAges.put("Bob", 21);

        // Display key-value pairs
        System.out.println("Student Ages: " + studentAges);

        // Access value by key
        System.out.println("John's age: " + studentAges.get("John"));

        // Update value
        studentAges.put("John", 25);

        // Display updated key-value pairs
        System.out.println("Updated Student Ages: " + studentAges);
    }
}
