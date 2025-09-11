public class BuiltInFunctions {

    public static void main(String[] args) {
        String message = "Hello, World!";
        System.out.println(message);

        String example = "Java";
        System.out.println(example.length());

        String upperCase = "JAVA";
        System.out.println(upperCase.toLowerCase());

        String programming = "Java programming";
        System.out.println(programming.startsWith("Java"));

        String original = "Java is fun!";
        System.out.println(original.replace("a", "e"));

        double number = 9;
        System.out.println(Math.sqrt(number));

        double base = 2;
        double exponent = 3;
        System.out.println(Math.pow(base, exponent));

        System.out.println(Math.random());

        int number1 = 5;
        int number2 = 10;
        System.out.println(Math.max(number1, number2));

    }
}
