public class ArrayLoopExamples {

    public static void main(String[] args) {
        int[] numbers = {22, 24, 26, 29, 30};
        for (int number : numbers) {
            System.out.println(number);            
        }

        
        String[] strArray = {"apple", "banana", "cherry"};
        for (String string : strArray) {
            System.out.println(string);         
        }

        
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        for (int i = 0; i < grades.length; i+=2){
            System.out.println(grades[i]);
        }

        int[] values = {3, 5, 7, 9, 11};
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
        }

        
        String[] colors = {"red", "green", "blue"};
        for (int i = 0; i < colors.length; i++) {
            colors[i] = colors[i].toUpperCase();
        }

        
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == targetValue){
                System.out.println(i);
            }
        }
    }
}
