import java.time.LocalDate;

public class Book extends Media{
    private String author;

    private int numberOfPages;

    private boolean audioBookAvailable;

    public Book(String title, String language, LocalDate releaseDate, String author , int numberOfPages, boolean audioBookAvailable){
        super(title,language,releaseDate);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.audioBookAvailable = audioBookAvailable;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isAudioBookAvailable() {
        return this.audioBookAvailable;
    }

    public void setAudioBookAvailable(boolean audioBookAvailable) {
        this.audioBookAvailable = audioBookAvailable;
    }

}
