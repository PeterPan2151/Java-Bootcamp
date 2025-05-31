public class Airline {

    Person[] people; // array that stores Person objects...

    public Airline() {
        this.people = new Person[11];
    }

    public Person getPerson(int index) {
        Person person = this.people[index];
        return new Person(person); // copy constructor creates copy of object
    }

    public void setPerson(Person person) {
        int index = person.getSeatNumber() - 1;
        this.people[index] = new Person(person);
    }

    public void createReservation(Person person) {

        while (people[person.getSeatNumber() - 1] != null) {
            System.out.println("Spot alrady taken");
            person.chooseSeat();
        }
        int index = person.getSeatNumber() - 1;
        people[index] = new Person(person);
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is "
                + person.getSeatNumber() + ".\n");
    }

}
