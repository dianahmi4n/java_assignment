public class question_5{
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);

        // String array
        String[] strArray = {"Apple", "Banana", "Cherry"};
        System.out.println("String Array:");
        printArray(strArray);
    }
}
