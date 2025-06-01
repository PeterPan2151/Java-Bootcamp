public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumebr, String birhtDate, int age) {
        this.name = name;
        this.phoneNumber = phoneNumebr;
        this.birthDate = birhtDate;
        this.age = age;
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }
}
