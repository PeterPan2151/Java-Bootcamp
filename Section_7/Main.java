public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] {"Tires", "Keys"});
        Car nissan2 = new Car(nissan);
        Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] {"Tires", "Keys"});

        System.out.println(nissan);
        System.out.println(dodge);
        System.out.println(nissan2);
    }
}
