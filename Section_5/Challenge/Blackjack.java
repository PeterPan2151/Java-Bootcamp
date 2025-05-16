import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int card1 = drawRandomCard();
        int card2 = drawRandomCard();
        System.out.println("\n You get a \n" + cardString(card1) + "\n and a \n" + cardString(card2));

        int sum = card1 + card2;
        System.out.println("Your total is: " + sum);

        
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        System.out.println("The dealer shows \n" + cardString(dealerCard1) + "\nand has a card facing down \n" + faceDown());
        System.out.println("\nThe dealer's total is hidden"); 
        int dealersTotal = dealerCard1 + dealerCard2;

       
        while (true) {
            if (sum > 21){
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                }
            String option = hitOrStay();
            if (option.equals("stay")) {
                break;
            } else if (option.equals("hit")) {
                int card = drawRandomCard();
                sum += card;
                System.out.println("\nYou get a \n" + cardString(card));
                System.out.println("Your new total is: " + sum);
            }
        }

        System.out.println("\nDealers's turn");
        System.out.println("\n The dealer's cards are \n" + cardString(dealerCard1) + "\n and a \n" + cardString(dealerCard2));
        System.out.println("\nDealer's current total is: " + dealersTotal);

        while (dealersTotal < 17) {
            int card = drawRandomCard();
            dealersTotal += card;
            System.out.println("\nDealer gets a \n" + cardString(card));
            System.out.println("\nDealer's new total is: " + dealersTotal);
        }

        if (dealersTotal > 21) {
            System.out.println("Bust! Dealer loses");
            System.exit(0);
        }

        if (sum > dealersTotal) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }
        
         scan.close();

    }


    public static int drawRandomCard() {
        return (int) (Math.random() * 13) + 1;
    }

    
    public static String cardString(int cardNumber) {
        String card;
        switch (cardNumber) {
            case 1: 
                card = "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
                
                break;
            case 2:
                card = "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                
                break;
            case 3:
                card = "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";
                
                break;
            case 4:
                card = "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
                
                break;
            case 5:
                card = "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
                
                break;    
            case 6:
                card = "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
                
                break;
            case 7:
                card = "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
                
                break;
            case 8:
                card = "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
                
                break;
            case 9:
                card = "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

                
                break;
            case 10:
                card = "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
                
                break;
            case 11:
                card = "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
                
                break;
            case 12:
                card = "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
                
                break;
            case 13:
                card = "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
                
                break;
        
            default:
                card = "";
                break;
        }
        return card;
    }


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    

    public static String hitOrStay() {
        String choice = "";
        while (true) {
            System.out.println("Please write 'hit' or 'stay'");
            choice = scan.nextLine();
            if (choice.equals("hit")) {
                return choice;
            } else if (choice.equals("stay")) {
                return choice;
            }
        }
    }
}

