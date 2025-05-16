public class BreakAndContinueExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        System.out.println("\nNumbers Excluding 5");
        for (int i = 1; i < 11; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
        }

        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        System.out.println("\nNumbers");
        for (int i = 1; i < 11; i ++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        System.out.println("\nSmalllest divisible");
        int n = 20;
        while (n >= 20){
            if (n % 3 == 0){
                break;
            }
            n++;
        }
        System.out.println("Smallest number divisible by 3: " + n);

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        System.out.println("\nEven Numbers");
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }

    }
}
