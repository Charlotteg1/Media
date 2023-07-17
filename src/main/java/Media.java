import java.time.LocalDate;

public class Media {
    private String title;
    private String language;
    private LocalDate releaseDate;
    public Media(String title, String language, LocalDate releaseDate) {
        this.title = title;
        this.language = language;
        this.releaseDate = releaseDate;
    }
}
