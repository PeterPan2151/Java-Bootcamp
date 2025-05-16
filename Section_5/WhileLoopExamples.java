public class WhileLoopExamples {

    public static void main(String[] args) {
        int diceRoll = -1;
        while (diceRoll != 6) {
            diceRoll = rollDice();
            //System.out.println(diceRoll);
        }

        int number = 0;
        while (number <= 90) {
            number = generateRandomNumber();
            //System.out.println(number);
        }

        int num = generateRandomNumber();
        while (num <= 1000) {
            num *= 2;
            System.out.println(num);
        }
    }

    // Function to simulate rolling a dice (returns a random integer between 1 and 6)
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Function to generate a random integer between 1 and 100
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
