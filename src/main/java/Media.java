import java.time.LocalDate;

public abstract class  Media {
    protected String title;
    protected String language;
    protected static LocalDate releaseDate;
    public Media(String title, String language, LocalDate releaseDate) {
        this.title = title;
        this.language = language;
        this.releaseDate = releaseDate;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLanguage() {
        return this.language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public LocalDate getReleaseDate() {
        return this.releaseDate;
    }
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
