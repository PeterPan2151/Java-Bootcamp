public class ForLoopExamples {

    public static void main(String[] args) {
    
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        for (int i = 1; i < 11; i++) {
            System.out.println("5 x " + i + " = " + (i * 5));
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
