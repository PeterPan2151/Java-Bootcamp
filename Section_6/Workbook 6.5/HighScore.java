public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int[] numbers = {randomNumebr(), randomNumebr(), randomNumebr(), randomNumebr(), randomNumebr(), randomNumebr(), randomNumebr(), randomNumebr(), randomNumebr(), randomNumebr()};
        
        System.out.print("Here are the scores: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] > highScore){
                highScore = numbers[i];
            }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");     
    }   
    
    public static int randomNumebr() {
        return (int) (Math.random() * 50000);
    }

}
