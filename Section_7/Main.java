public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        Car nissan2 = new Car(nissan);
        Car dodge = new Car("Dodge", 11000, 2019, "Blue");
        nissan2.setColor("Yellow");

        nissan2.drive();
    }
}