import java.time.LocalDate;

public class Television {
    private String director;
    private int numberOfSeasons;
    private int numberOfEpisodes;
    private LocalDate endDate;

    public Television(String director, int numberOfSeasons, int numberOfEpisodes, LocalDate endDate) {
        this.director = director;
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
        this.endDate = endDate;
    }
    public String getDirector() {
        return this.director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getNumberOfSeasons() {
        return this.numberOfSeasons;
    }
    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
    public int getNumberOfEpisodes() {
        return this.numberOfEpisodes;
    }
    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public LocalDate getEndDate() {
        return this.endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
