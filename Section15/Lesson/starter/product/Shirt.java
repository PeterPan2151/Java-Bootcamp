package product;

public class Shirt extends Product {
    private Size size;

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        System.out.println("Lay shirt on flat surface");
        System.out.println("Folded!");
    }

    @Override
    public void wear() {
        System.out.println("Wearing shirt");
    }

}
