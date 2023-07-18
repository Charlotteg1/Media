import java.time.LocalDate;

public class Book extends Media{
    private String author;

    private int numberOfPages;

    private boolean audioBookAvailable;
    private double price;
    private int physicalCopiesSold;

    public Book(String title, String language, LocalDate releaseDate, String author , int numberOfPages, boolean audioBookAvailable,double price, int physicalCopiesSold){
        super(title,language,releaseDate);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.audioBookAvailable = audioBookAvailable;
        this.price = price;
        this.physicalCopiesSold = physicalCopiesSold;
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

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAudioBookAvailable() {
        return this.audioBookAvailable;
    }

    public void setAudioBookAvailable(boolean audioBookAvailable) {
        this.audioBookAvailable = audioBookAvailable;
    }

    public int getPhysicalCopiesSold() {
        return this.physicalCopiesSold;
    }

    public void setPhysicalCopiesSold(int physicalCopiesSold) {
        this.physicalCopiesSold = physicalCopiesSold;
    }
    public void updatePhysicalCopiesSold(int moreCopiesSold){
        this.physicalCopiesSold= this.physicalCopiesSold + moreCopiesSold;
    }
    public double calculateRevenue(){
        return this.price*this.physicalCopiesSold;
    }
    public double calculateRevenue(double audioBookRevenue ){
        return this.price*this.physicalCopiesSold +audioBookRevenue;
    }
    public String stateMediaType(){
        return "Print media";
    }
}
