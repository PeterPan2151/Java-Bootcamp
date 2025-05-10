import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int counter = 0;

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        System.out.println("What is your name?");
        String name = myScan.nextLine();
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = myScan.nextDouble();
        counter++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = myScan.nextDouble();
        counter++;


        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = myScan.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = myScan.nextInt();
        counter++;


        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you " + name+ " for answering all " + counter + " questions");
        System.out.println("Weekly, you spend $" + (coffeePrice * coffeeAmount) + " on coffee");
        System.out.println("Weekly, you spend $" + (foodPrice * foodAmount) + " on food");

        myScan.close();
    }
}
