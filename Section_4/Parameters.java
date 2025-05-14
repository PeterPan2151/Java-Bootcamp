public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 3.5);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.3);
        
    }

    public static void calculateArea(double length, double width) {
        System.out.printf("Area: %.2f%n", (length * width));
    }
}
