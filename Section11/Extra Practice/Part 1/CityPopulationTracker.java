import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker() {
        this.cityPopulations = new HashMap<>();
    }

    public City getCity(String name) {
        return new City(cityPopulations.get(name));
    }

    public void setCity(City city) {
        City copy = new City(city);
        cityPopulations.put(copy.getName(), copy);
    }

    public void addCity(City city) {
        City copy = new City(city);
        cityPopulations.put(copy.getName(), copy);
    }
}
