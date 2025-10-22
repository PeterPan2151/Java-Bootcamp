import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(10.99, "Black", "Nike", Size.SMALL);
        shirt.fold();
        productStore(shirt);
        shirt.wear();

        Pants pants = new Pants(49.99, "Blue Navy", "Levis", 32, 32);
        pants.fold();
        productStore(pants);
        pants.wear();
    }

    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " "
                + product.getClass().getSimpleName().toLowerCase());
    }

}
