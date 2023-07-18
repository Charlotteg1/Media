import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FilmTest {
    Film film;
    @BeforeEach
    public void setUp(){
        film= new Film("Barbie","English", LocalDate.parse("2023-07-13"),"Gerwig",true,123,100,300);
    }
    @Test
    public void canGetLanguage(){
        assertThat(film.getLanguage()).isEqualTo("English");
    }
    @Test
    public void canSetLanguage(){
        film.setLanguage("Spanish");
        assertThat(film.getLanguage()).isEqualTo("Spanish");
    }
    @Test
    public void canGetDirector(){
        assertThat(film.getDirector()).isEqualTo("Gerwig");
    }
    @Test
    public void canSetDirector(){
        film.setDirector("Nolan");
        assertThat(film.getDirector()).isEqualTo("Nolan");
    }
    @Test
    public void canGetIsShownInCinema(){
        assertThat(film.isShownInCinema()).isEqualTo(true);
    }
    @Test
    public void canSetShownInCinema(){
        film.setShownInCinema(false);
        assertThat(film.isShownInCinema()).isEqualTo(false);
    }
    @Test
    public void canGetMinutesLong(){
        assertThat(film.getMinutesLong()).isEqualTo(123);
    }
    @Test
    public void canSetMinutesLong(){
        film.setMinutesLong(116);
        assertThat(film.getMinutesLong()).isEqualTo(116);
    }
    @Test
    public void canGetProductionCost(){
        assertThat(film.getProductionCost()).isEqualTo(100);
    }
    @Test
    public void canSetProductionCost(){
        film.setProductionCost(200);
        assertThat(film.getProductionCost()).isEqualTo(200);
    }
    @Test
    public void canGetRevenue(){
        assertThat(film.getRevenue()).isEqualTo(300);
    }
    @Test
    public void canSetRevenue(){
        film.setRevenue(468);
        assertThat(film.getRevenue()).isEqualTo(468);
    }
    @Test
    public void canUpdateRevenue(){
        film.updateRevenue(50);
        assertThat(film.getRevenue()).isEqualTo(350);
    }
    @Test
    public void canCalculateProfit(){
        film.setRevenue(100);
        film.setProductionCost(20);
        assertThat(film.calculateProfit()).isEqualTo(80);
    }
    public void canStateMediaType(){
        assertThat(film.stateMediaType()).isEqualTo("Broadcasting");
    }
}
