public class Weather {
    public static void main(String[] args) {
        double noon = 77;          
        double evening = 61;       
        double midnight = 55;      

        //Task 3 - Call the printTemperatures function. 
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
        
        
    }

 
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * (5 / 9.0);
        return celsius;
    }

    
    public static void printTemperatures(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + celsius);
    }
}