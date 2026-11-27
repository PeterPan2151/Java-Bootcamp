import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};

        System.out.println("The original prices are: " + Arrays.toString(price));

        for (int i = 0; i < price.length; i++) {
            price[i] = price[i] + (price[i] * .13);
        }
        System.out.println("The prices after tax are: " + Arrays.toString(price));

    }
}
