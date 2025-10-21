package model;

public class Car {
    private String make;
    private String model;
    private int productionYear;
    private double price;
    private BodyType bodyType;
    public static final int MIN_YEAR = 2000;
    public static final double MIN_PRICE = 0;
    public static final double MAX_PRICE = 200000;

    public enum BodyType {
        SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN
    }

    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }

    public Car(Car source) {
        setMake(source.make);
        setModel(source.model);
        setBodyType(source.bodyType);
        setProductionYear(source.productionYear);
        setPrice(source.price);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        if (make == null || make.isBlank()) {
            throw new IllegalArgumentException("Make cannot be null ir blank.");
        }
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    public BodyType getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            throw new IllegalArgumentException("BodyType cannot be null");
        }
        this.bodyType = bodyType;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int year) {
        if (year < MIN_YEAR) {
            throw new IllegalArgumentException("Production year must be greater than or equal to the minimum year.");
        }
        this.productionYear = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0 || price > MAX_PRICE) {
            throw new IllegalArgumentException("Price must be within a valid range.");
        }
        this.price = price;
    }
}