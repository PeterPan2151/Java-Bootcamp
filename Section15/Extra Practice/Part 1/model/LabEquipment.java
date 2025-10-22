package model;

public abstract class LabEquipment {
    private String manufacturer;
    private String model;
    private int year;

    private static final int MIN_YEAR = 1950;

    public LabEquipment(String manu, String model, int year) {
        setManufacuterer(manu);
        setModel(model);
        setYear(year);
    }

    public LabEquipment(LabEquipment source) {
        setManufacuterer(source.manufacturer);
        setModel(source.model);
        setYear(source.year);
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacuterer(String manu) {
        if (manu == null || manu.isBlank()) {
            throw new IllegalArgumentException("Manufacturer cannot be blank or null");
        }
        this.manufacturer = manu;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model acnnot be null or blank");
        }
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < MIN_YEAR) {
            throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
        }
        this.year = year;
    }

    public abstract String performMaintenance();

    public abstract LabEquipment clone();
}