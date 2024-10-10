import java.util.ArrayList;

public class question_2 {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> shoes= new ArrayList<>();

        // Add elements
        shoes.add("Sneakers");
        shoes.add("Open");
        shoes.add("Boot");

        // Display elements using for-each loop
        System.out.println("shoes:");
        for (String fruit : shoes) {
            System.out.println(shoes);
        }

        // Display elements using index
        System.out.println("shoes using index:");
        for (int i = 0; i < shoes.size(); i++) {
            System.out.println(shoes.get(i));
        }
    }
}