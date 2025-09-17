import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        int[][] grades = {
                { 72, 74, 78, 76 },
                { 65, 64, 61, 67 },
                { 95, 98, 99, 100 }
        };
        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));
    }
}
