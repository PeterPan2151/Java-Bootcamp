import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
    
        Scanner myScan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = myScan.nextLine(); 

                            
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String home = myScan.nextLine();
                        

        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int age = myScan.nextInt();


        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400.0 / 4) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        myScan.nextLine();
        String favoriteLanguage = myScan.nextLine();


        System.out.println("\n" + favoriteLanguage + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");

        myScan.close();

        
    }
}
