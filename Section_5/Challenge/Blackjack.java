import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int cardNum1 = drawRandomCard();
        int cardNum2 = drawRandomCard();
        String card1 = cardString(cardNum1);
        String card2 = cardString(cardNum2);
        // – Print them:
        System.out.println("\n You get a \n" + card1 + "\n and a \n" + card2);

        int sum = cardNum1 + cardNum2;
        System.out.println("You total is: " + sum);

        int comCardNum1 = drawRandomCard();
        int comCardNum2 = drawRandomCard();
        String comCard1 = cardString(comCardNum1);
        String comCard2 = faceDown();
        int comSum = comCardNum1 + comCardNum2;
        System.out.println("The dealer shows \n" + comCard1 + "\nand has a card facing down\n" + comCard2);

        while (true) {
            String choice = hitOrStay();
            if (choice.equals("hit")) {
                int card = drawRandomCard();
                sum += card;
                System.out.println("\nYou get a \n" + cardString(card));
                System.out.println("Your new total is " + sum);

                if (sum > 21) {
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                }
            } else if (choice.equals("stay")) {
                break;
            }
        }

        System.out.println("\nDealers turn");
        System.out.println("\nThe dealer's cards are \n" + comCard1 + "\n and a \n" + cardString(comCardNum2));
        while (comSum < 17) {
            int comCard = drawRandomCard();
            String newCard = cardString(comCard);
            comSum += comCard;
            System.out.println("\nDealer gets a \n" + newCard);
            System.out.println("\nDealer's total is " + comSum);
        }

        if (comSum > 21) {
            System.out.println("Bust! Dealer loses");
            System.exit(0);
        }

        if (sum > comSum) {
            System.out.println("Player wins!");
        } else if (sum < comSum) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("Tie");
        }

        scan.close();

    }

    /**
     * Function name – drawRandomCard
     * 
     * @return (int)
     *
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card.
     */
    public static int drawRandomCard() {
        return (int) (Math.random() * 13) + 1;
    }

    /**
     * Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * 
     * @param cardNumber (int)
     * @return (String)
     *
     *         Inside the function:
     *         1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber) {
        switch (cardNumber) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";

            default:
                return "";
        }
    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    /**
     * Function name – hitOrStay
     * 
     * @return (String)
     *
     *         Inside the function:
     *         1. Asks the user to hit or stay.
     *         2. If the user doesn't enter "hit" or "stay", keep asking them to try
     *         again by printing:
     *         Please write 'hit' or 'stay'
     *         3. Returns the user's option
     */
    public static String hitOrStay() {
        String choice = "";
        while (!choice.equals("hit") && !choice.equals("stay")) {
            System.out.println("Do you want to hit or stay? ");
            choice = scan.nextLine();
        }
        return choice;
    }
}
