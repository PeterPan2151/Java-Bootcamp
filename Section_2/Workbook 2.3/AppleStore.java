public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;


        System.out.println("You picked 500 apples from an apple orchard");
        
        System.out.println("Time for business! You're selling each apple for 40 cents");

        System.out.println("One customer walked in. He bought 4 apples!");
<<<<<<< HEAD

        System.out.println("Another customer walked in. He bought 20 apples!");

        System.out.println("Another customer walked in. She bought 200 apples!");
        

        System.out.println("Wow! So far, you made: $<profit>");
        System.out.println("<number of customers> + customers love your apples.");
        System.out.println("You have <number of apples> apples left.");

        // Compare your result to what's on Learn the Part.  
        
=======
        numOfApples -= 4;
        numOfCustomers++;
        profit += (4 * .4);

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples -= 20;
        numOfCustomers++;
        profit += (20 * .4);

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -= 200;
        numOfCustomers++;
        profit += (200 * .4);
        

        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left.");
>>>>>>> 6660f2f66fc6b8c6546bc5381a8c3ee2a4271905
    }

}
