public class ReturnValues {
    public static void main(String[] args) {
        System.out.println("Area: " + calculateArea(2.3, 3.5));
        printArea(2.3, 3.6);
        // printArea(0, 0);
        // System.out.println("Area: " + calculateArea(1.6, 2.4));
        // System.out.println("Area: " + calculateArea(2.6, 4.3));
        // System.out.println("Area: " + calculateArea(2.6, -4.3));

        String englishExplanation = explainArea("english");
        String spanishExplanation = explainArea("spanish");
        String frenchExplanation = explainArea("french");
        String germanExplanation = explainArea("german");

        System.out.println(englishExplanation);
        System.out.println(spanishExplanation);
        System.out.println(frenchExplanation);
        System.out.println(germanExplanation);
    }


    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid dimension");
            System.exit(0);
        }
        return length * width;
    }


    public static String explainArea(String language) {
        switch (language) {
            case "english":
                return "English \"Area equals length * width\"";
            case "spanish":
                return "Spanish \"area es igual a largo * ancho\"";
            case "french":
                return "French \"La surface est egale a la longueur * la largeur\"";
            default:
                return "Language not valid";
        }
    }


    public static void printArea(double length, double width) {
        double area = calculateArea(length, width);
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area);
    }
}
