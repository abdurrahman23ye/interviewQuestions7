public class Q06_PrintArray {
    public static void main(String[] args) {
        // Create a method which takes String array as a parameter
        // and prints all the element

        String [] arabalar = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
        printElements(arabalar);
    }

    private static void printElements(String[] arabalar) {

        System.out.println("Elements:");
        System.out.println(); for (int i = 0; i <arabalar.length ; i++) {
            System.out.println(arabalar[i]);

        }
    }
}
