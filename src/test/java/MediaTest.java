import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MediaTest {
    Media media;
    @BeforeEach
    public void setUp(){
        media= new Book("Great Gatsby","English", LocalDate.parse("1925-04-10"),"Fitzgerald",356,true,9.99,1000);
    }
    @Test
    public void canGetTitle(){
        assertThat(media.getTitle()).isEqualTo("Great Gatsby");
    }
    @Test
    public void canSetTitle(){
        media.setTitle("Harry Potter");
        assertThat(media.getTitle()).isEqualTo("Harry Potter");
    }
    @Test
    public void canGetLanguage(){
        assertThat(media.getLanguage()).isEqualTo("English");
    }
    @Test
    public void canSetLanguage(){
        media.setLanguage("Spanish");
        assertThat(media.getLanguage()).isEqualTo("Spanish");
    }
    @Test
    public void canGetReleaseDate(){
        assertThat(media.getReleaseDate()).isEqualTo(LocalDate.of(1925,04,10));
    }
    @Test
    public void canSetReleaseDate(){
        media.setReleaseDate(LocalDate.parse("2012-03-12"));
        assertThat(media.getReleaseDate()).isEqualTo(LocalDate.of(2012,03,12));
    }
}
