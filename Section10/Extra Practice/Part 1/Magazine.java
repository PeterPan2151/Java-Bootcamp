public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        this.title = title;
    }

}
