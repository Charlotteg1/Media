import java.time.LocalDate;
import java.time.Period;

public class Television extends Media {
    private String director;
    private int numberOfSeasons;
    private int numberOfEpisodes;
    private LocalDate endDate;

    public Television(String title,String language, LocalDate releaseDate, String director, int numberOfSeasons, int numberOfEpisodes, LocalDate endDate) {
        super(title,language,releaseDate);
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
    public int calculateYearsRun(){
        if(endDate==null){
            Period period = Period.between(Media.releaseDate, LocalDate.now() );
            return period.getYears();
        }else{
            Period period = Period.between(Media.releaseDate,this.endDate );
            return period.getYears();
        }
    }
    public String stateMediaType(){
        return "Broadcasting";
    }
    // possible to add update num of seasons and episodes
}

