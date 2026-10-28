public class Grocer {
    public static void main(String[] args) {
        String[] products = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nDo you sell coffee?");

        for (int i = 0; i < products.length; i++) {
            if (products[i].equals("coffee")) {
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
    }
}
