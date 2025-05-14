public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.5);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.3);
        
        printArea(2.3, 3.5, area1);
        printArea(1.6, 2.4, area2);
        printArea(2.6, 4.3, area3);

        String englishExplanation = explainArea("English");
        String spanishExplanation = explainArea("Spanish");
        String frenchExplanation = explainArea("French");
        String otherExplanation = explainArea("Italian");

        System.out.println(englishExplanation);
        System.out.println(spanishExplanation);
        System.out.println(frenchExplanation);
        System.out.println(otherExplanation);
        
    }

    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {

        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
            return "Language not available";
        }
    }

    public static void printArea(double length, double width, double area){
        System.out.println("A rectangle with a leghth of " + length + " and a width of " + width + " has an area of " + area);

    }
}
