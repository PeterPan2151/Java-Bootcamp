package model;

public class Microscope extends LabEquipment {
    private int magnification;
    private static final int MIN_MAG = 1;

    public Microscope(String manu, String model, int year, int mag) {
        super(manu, model, year);
        setMagnification(mag);
    }

    public Microscope(Microscope source) {
        super(source);
        setMagnification(source.magnification);
    }

    public int getMagnification() {
        return this.magnification;
    }

    public void setMagnification(int mag) {
        if (mag < MIN_MAG) {
            throw new IllegalArgumentException(
                    "Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = mag;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    @Override
    public LabEquipment clone() {
        return new Microscope(this);
    }
}
