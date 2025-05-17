import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double [] afterTax = new double[4];
        for(int i = 0; i < price.length; i++) {
            afterTax[i] = price[i] + (price[i] * 0.13);
        }

        
        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(afterTax));

    }
}
