public class Book {
    private String author;

    private int numberOfPages;

    private boolean audioBookAvailable;

    public Book(String author , int numberOfPages, boolean audioBookAvailable){
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
