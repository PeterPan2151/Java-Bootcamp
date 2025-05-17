import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit =celciusToFahrenheit(celsius);
        
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");

    }


    public static double[] celciusToFahrenheit(double[] celsius) {
        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = (fahrenheit[i] / 5 * 9) + 32;
        }
        return fahrenheit;
    }


    public static void printTemperatures(double[] temp, String tempType) {
        System.out.print(tempType + ": ");
        for (double n : temp) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
}
