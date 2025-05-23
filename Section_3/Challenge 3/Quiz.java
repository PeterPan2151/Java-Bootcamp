import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String answer1 = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String answer2 = scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String answer3 = scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String answer4 = scan.nextLine();

        int score = 0;


        score += answer1.equals("c") ? 5 : 0;
        score += answer2.equals("a") ? 5 : 0;
        score += answer3.equals("d") ? 5 : 0;
        score += answer4.equals("a") || answer4.equals("b") ? 5 : 0;
        
        System.out.println("Your final score is: " + score + "/20");

        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score >= 5 && score < 15) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time");
        }
        scan.close();

    }
}
