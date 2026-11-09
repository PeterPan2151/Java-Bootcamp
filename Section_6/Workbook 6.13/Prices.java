public class Prices {
    public static void main(String[] args) {
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        System.out.println("Baking: " + prices[0][0] + " " + prices[0][1] + " " + prices[0][2] + " " + prices[0][3] + " " + prices[0][4]);
        System.out.println("Baking: " + prices[1][0] + " " + prices[1][1] + " " + prices[1][2] + " " + prices[1][3] + " " + prices[1][4]);
        System.out.println("Baking: " + prices[2][0] + " " + prices[2][1] + " " + prices[2][2] + " " + prices[2][3] + " " + prices[2][4]);
    }
}
