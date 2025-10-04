import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store() {
        this.books = new ArrayList<>();
    }

    public Book getBook(int index) {
        return new Book(books.get(index));
    }

    public void setBook(int index, Book book) {
        books.add(index, new Book(book));
    }

    public void addBook(Book book) {
        books.add(new Book(book));
    }

    public Boolean contains(Book book) {
        return this.books.contains(book);
    }

    public void sellBook(String title) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equals(title)) {
                this.books.remove(i);
            }
        }
    }
}
