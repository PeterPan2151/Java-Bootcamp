import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        return new Magazine(magazines.get(index));
    }

    public void setMagazine(Magazine source, int index) {
        Magazine copy = new Magazine(source);
        magazines.set(index, copy);
    }

    public void addMagazine(Magazine source) {
        Magazine copy = new Magazine(source);
        magazines.add(copy);
    }
}
