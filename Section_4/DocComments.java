public class DocComments {
    public static void main(String[] args) {
        System.out.println("HI");
    }

    /**
     * function name: greet
     * 
     * Inside the function: 
     *  1. print "Hi"
     */
    public static void greet(){
        System.out.println("Hello");
    }


    /**
     * Function name: printText
     * 
     * @param name (String)
     * @param age (int)
     * 
     * Inside the function:
     *  1. Print the name and age as part of a text
     */
    public static void printText(String name, int age){
        System.out.println("Hello " + name + " you are " + age + "years old");
    }

    /**
     * Function name: calculateArea
     * 
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function:
     *  1. Calculate area and return it
     */
    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }
}
