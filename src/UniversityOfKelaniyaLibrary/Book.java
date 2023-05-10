package UniversityOfKelaniyaLibrary;


class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;

    public Book(String id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "\nQBook \tId = " + id + " \ttitle = " + title + " \tauthor = " + author + " \tavailable = " + available + "\n";
    }
}