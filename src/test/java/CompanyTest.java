import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CompanyTest {
    private Company company;

    @BeforeEach
    public void setUp(){
        company= new Company("Disney");

    }

    @Test
    public void canGetName(){
        assertThat(company.getName()).isEqualTo("Disney");
    }
    @Test
    public void canSetName(){
        company.setName("Disney");
        assertThat(company.getName()).isEqualTo("Disney");
    }
    @Test
    public void canAddMedia(){
        Media media = new Film("Barbie","English", LocalDate.parse("2023-07-13"),"Gerwig",true,123,100,300);
        company.addNewMedia(media);
        assertThat(company.countMedia()).isEqualTo(1);
    }
    @Test
    public void canAddMultipleMedia(){
        Media film = new Film("Barbie","English", LocalDate.parse("2023-07-13"),"Gerwig",true,123,100,300);
        Media book= new Book("Great Gatsby","English",LocalDate.parse("1925-04-10"),"Fitzgerald",356,true,9.99,1000);
        company.addNewMedia(film);
        company.addNewMedia(book);
        assertThat(company.countMedia()).isEqualTo(2);
    }
}
