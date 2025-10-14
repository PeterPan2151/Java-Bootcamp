public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        this.title = title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isBlank()) {
            throw new IllegalArgumentException("Publisher cannot be null or blank.");
        }
    }

    public int getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Issue number must greater than 0.");
        }
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Publication year must be greater than 0.");
        }
    }
}
