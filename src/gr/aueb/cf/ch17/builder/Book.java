package gr.aueb.cf.ch17.builder;

public class Book {
    private final long id;
    private final String isbn;
    private final String author;
    private final String title;

    public static class Builder { // nested class
        private final long id;//necessary
        private final String isbn; //necessary

        private  String author =  ""; //optional
        private  String title  =  ""; //optional

        public Builder (long id, String isbn) {
            this.id = id;
            this.isbn = isbn;

        }

        //setter
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Book build() { //return book
            return new Book(this);
        }
    }

    private Book (Builder builder) {
        this.id = builder.id;
        this.author = builder.author;
        this.title = builder.title;
        this.isbn = builder.isbn;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
