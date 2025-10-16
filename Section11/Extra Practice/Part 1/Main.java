import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cityName = promptForCityName(scanner);

        String country = promptForCountry(scanner);

        int population = promptForPopulation(scanner);

        City newCity = new City(cityName, country, population);

        CityPopulationTracker tracker = new CityPopulationTracker();
        tracker.addCity(newCity);

        System.out.println("City added to the tracker: " + newCity.getName());
    }

    public static boolean isNUllOrBlank(String input) {
        return (input == null || input.isBlank());
    }

    public static boolean incorrectPopulation(int num) {
        return (num <= 0);
    }

    public static String promptForCityName(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid city name: ");
            String cityName = scanner.nextLine();
            if (!isNUllOrBlank(cityName)) {
                return cityName;
            }
        }
    }

    public static String promptForCountry(Scanner scan) {
        while (true) {
            System.out.println("\nPlease enter a valid country: ");
            String country = scan.nextLine();
            if (!isNUllOrBlank(country)) {
                return country;
            }
        }
    }

    public static int promptForPopulation(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid population (greater than 0): ");
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                continue;
            }
            int population = scanner.nextInt();
            if (!incorrectPopulation(population)) {
                return population;
            }
        }
    }
}