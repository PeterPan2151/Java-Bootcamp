public class ForLoopExamples {

    public static void main(String[] args) {
        // TODO: Write a for loop that prints numbers from 1 to 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // TODO: Write a for loop that prints "Hello, world!" 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world!");
        }

        // TODO: Write a for loop that prints the multiplication table of 5 up to 10 (5
        for (int i = 5; i < 11; i++) {
            System.out.println("5 x " + i + " = " + (i * 5));
        }

        // TODO: Write a for loop that prints numbers from 10 to 1 in reverse order
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // TODO: Write a for loop that prints the first 10 even numbers
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
