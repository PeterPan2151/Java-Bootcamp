package model;

public class Centrifuge extends LabEquipment {
    private int maxRPM;
    private static final int MIN_RPM = 500;

    public Centrifuge(String manu, String model, int year, int maxRPM) {
        super(manu, model, year);
        setMaxRPM(maxRPM);
    }

    public Centrifuge(Centrifuge source) {
        super(source);
        setMaxRPM(source.maxRPM);
    }

    public int getMaxRPM() {
        return this.maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if (maxRPM < MIN_RPM) {
            throw new IllegalArgumentException("Max RPM must be greater than or equal to the minimum RPM.");
        }
        this.maxRPM = maxRPM;
    }

    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }

    @Override
    public LabEquipment clone() {
        return new Centrifuge(this);
    }
}
