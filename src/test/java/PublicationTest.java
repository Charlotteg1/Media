import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PublicationTest {
    private Publication publication;

    @BeforeEach
    public void setUp(){
        publication= new Publication("Disney");

    }

    @Test
    public void canGetName(){
        assertThat(publication.getName()).isEqualTo("Disney");
    }
    @Test
    public void canSetName(){
        publication.setName("Disney");
        assertThat(publication.getName()).isEqualTo("Disney");
    }
    @Test
    public void canAddMedia(){
        Media media = new Film("Barbie","English", LocalDate.parse("2023-07-13"),"Gerwig",true,123,100,300);
        publication.addNewMedia(media);
        assertThat(publication.countMedia()).isEqualTo(1);
    }
    @Test
    public void canAddMultipleMedia(){
        Media film = new Film("Barbie","English", LocalDate.parse("2023-07-13"),"Gerwig",true,123,100,300);
        Media book= new Book("Great Gatsby","English",LocalDate.parse("1925-04-10"),"Fitzgerald",356,true);
        publication.addNewMedia(film);
        publication.addNewMedia(book);
        assertThat(publication.countMedia()).isEqualTo(2);
    }
}
