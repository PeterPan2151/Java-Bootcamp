public class RandomNumbers {
    public static void main(String[] args) {
        int[][] array = new int[100][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber();
                
            }
        }

        print2DArray(array);
    }

    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }

    /**
     * Function name: print2DArray
     * @param array ( int[][] )
     *
     * Inside the function:
     *  1. Nested loop:
     *      - Inner Loop: System.out.print(array[i][j] + " ");
     *      - After the Inner Loop Completes: System.out.print("\n");
     */
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
