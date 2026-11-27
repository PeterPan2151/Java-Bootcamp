import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Peter", "Mexican", "03-01-2000", 1);
        person.passport = new String[] { person.name, person.nationality, person.dateOfBirth };

        System.out.println("Name: " + person.name + "\n" + "Nationality: " + person.nationality + "\n"
                + "Date of Birth: " + person.dateOfBirth + "\n" + "Seat Number: " + person.seatNumber + "\n");
        System.out.println(Arrays.toString(person.passport));

    }

}
