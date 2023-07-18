import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BookTest {
    Book book;
    @BeforeEach
    public void setUp(){
        book= new Book("Great Gatsby","English", LocalDate.parse("1925-04-10"),"Fitzgerald",356,true);
    }
    @Test
    public void canGetAuthor(){
        assertThat(book.getAuthor()).isEqualTo("Fitzgerald");
    }
    @Test
    public void canSetAuthor(){
        book.setAuthor("Wilson");
        assertThat(book.getAuthor()).isEqualTo("Wilson");
    }
    @Test
    public void canGetNumberOfPages(){
        assertThat(book.getNumberOfPages()).isEqualTo(356);
    }
    @Test
    public void canSetNumberOfPages(){
        book.setNumberOfPages(500);
        assertThat(book.getNumberOfPages()).isEqualTo(500);
    }
    @Test
    public void canGetIsAudioBookAvailable(){
        assertThat(book.isAudioBookAvailable()).isEqualTo(true);
    }
    @Test
    public void canSetAudioBookAvailable(){
        book.setAudioBookAvailable(false);
        assertThat(book.isAudioBookAvailable()).isEqualTo(false);
    }

}
