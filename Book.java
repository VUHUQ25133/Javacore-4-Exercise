package JV4;

//Book.java
public class Book extends Product {
    private int id;
    private String genre, author, publisher, language;
    private int publicationYear;

    public Book(String name, double price, String brand, String genre, String author, String publisher, int publicationYear, String language) {
        super(name, price, brand);
        this.genre = genre;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.language = language;
    }
    public boolean containsKeyword(String keyword) {
        String productDetails = super.toString().toLowerCase() +
                                " Genre: " + genre +
                                " Author: " + author +
                                " Publisher: " + publisher +
                                " Publication Year: " + publicationYear +
                                " Language: " + language;

        return productDetails.contains(keyword) ||
               String.valueOf(getId()).equals(keyword);
    }
    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getGenre() {
    	return genre;
    }
    
    public void setGenre(String genre) {
    	this.genre = genre;
    }
    
    public String getAuthor() {
    	return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}