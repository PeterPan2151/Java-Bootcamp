import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person peter = new Person();
        peter.name = "Peter";
        peter.nationality = "Mexican";
        peter.dateOfBirth = "03-01-200";
        peter.passport = new String[] { "h", "i" };
        peter.seatNumber = 1;
        System.out.println(peter.name);
        System.out.println(peter.nationality);
        System.out.println(peter.dateOfBirth);
        System.out.println(Arrays.toString(peter.passport));
        System.out.println(peter.seatNumber);
    }
}
