public class ArrayLoopExamples {

    public static void main(String[] args) {
        // int[] numbers = { 22, 24, 26, 29, 30 };
        // // TODO: Use a for loop to print each element of the intArray
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println(numbers[i]);
        // }

        // String[] strArray = { "apple", "banana", "cherry" };
        // // TODO: Use a for loop to print each element of the strArray
        // for (int i = 0; i < strArray.length; i++) {
        // System.out.println(strArray[i]);
        // }

        // int[] grades = { 95, 80, 85, 70, 90, 60, 88, 78 };
        // // TODO: Use a for loop to print every second element of the grades array
        // (step
        // // size of 2)
        // for (int i = 0; i < grades.length; i += 2) {
        // System.out.println(grades[i]);
        // }

        // int[] values = { 3, 5, 7, 9, 11 };
        // // TODO: Use a for loop to double each element in the values array
        // for (int i = 0; i < values.length; i++) {
        // values[i] = values[i] * 2;
        // }

        // String[] colors = { "red", "green", "blue" };
        // // TODO: Use a for loop to capitalize each element in the colors array
        // for (int i = 0; i < colors.length; i++) {
        // colors[i] = colors[i].toUpperCase();
        // }

        // Example 6: Find the index of a specific value in an integer array
        int[] data = { 4, 7, 4, 1, 4, 9, 4 };
        int targetValue = 4;
        // TODO: Use a for loop to find the index of targetValue in the data array
        for (int i = 0; i < data.length; i++) {
            if (data[i] == targetValue) {
                System.out.println(i);
            }
        }
    }
}
