public class DocComments {
    public static void main(String[] args) {
        
    }


    /**
     * Function name: greet
     * 
     * Inside the function: 
     *  1.Prints "Hello"
     * 
     */
    public static void greet() {
        System.out.println("Hello");
    }


    /**
     * Function name: printText
     * 
     * @param name  (String)
     * @param age   (String)
     * 
     * Inside the function:
     *  1.print the name and age in a message
     * 
     */
    public static void printText(String name, String age) {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old");
    }


    /**
     * Function name: calculateArea
     * 
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function:
     *  1. Return the area
     * 
     */
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}