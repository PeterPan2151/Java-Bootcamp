import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.name);
        System.out.println(person1.nationality);
        System.out.println(person1.dateOfBrith);
        System.out.println(person1.passport);
        System.out.println(person1.seatNumber);

        person1.name = "Claudia";
        person1.nationality = "Japanese";
        person1.dateOfBrith = "02/31/1988";

        String[] array;
        array = new String[] {person1.name, person1.nationality, person1.dateOfBrith};
        person1.passport = array;
        person1.seatNumber = 7;

        System.out.println(person1.name);
        System.out.println(person1.nationality);
        System.out.println(person1.dateOfBrith);
        System.out.println(Arrays.toString(array));
        System.out.println(person1.seatNumber);
    }
}
