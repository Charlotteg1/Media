import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TelevisionTest {
    Television television;

    @BeforeEach
    public void setUp() {
        television = new Television("Money Heist", "Spanish", LocalDate.parse("2014-08-24"), "john", 8, 42,LocalDate.parse("2022-03-18"));
    }
    @Test
    public void canGetReleaseDate(){
        assertThat(television.getReleaseDate()).isEqualTo(LocalDate.of(2014,8,24));
    }
    @Test
    public void canSetReleaseDate(){
       television.setReleaseDate(LocalDate.parse("2012-03-12"));
        assertThat(television.getReleaseDate()).isEqualTo(LocalDate.of(2012,03,12));
    }
    @Test
    public void canGetDirector() {
        assertThat(television.getDirector()).isEqualTo("john");
    }

    @Test
    public void canSetDirector() {
        television.setDirector("Witherspoon");
        assertThat(television.getDirector()).isEqualTo("Witherspoon");
    }

    @Test
    public void canGetNumberOfSeasons() {
        assertThat(television.getNumberOfSeasons()).isEqualTo(8);
    }

    @Test
    public void canSetNumberOfSeasons() {
        television.setNumberOfSeasons(5);
        assertThat(television.getNumberOfSeasons()).isEqualTo(5);
    }

    @Test
    public void canGetNumberOfEpisodes() {
        assertThat(television.getNumberOfEpisodes()).isEqualTo(42);
    }

    @Test
    public void canSetNumberOfEpisodes() {
        television.setNumberOfEpisodes(32);
        assertThat(television.getNumberOfEpisodes()).isEqualTo(32);
    }

    @Test
    public void canGetEndDate() {
        assertThat(television.getEndDate()).isEqualTo(LocalDate.of(2022,3,18));
    }
    @Test
    public void canSetEndDate() {
        television.setEndDate(LocalDate.parse("2022-03-18"));
        assertThat(television.getEndDate()).isEqualTo(LocalDate.of(2022, 3, 18));
    }
    @Test
    public void canCalculateYearsRun(){
        assertThat(television.calculateYearsRun()).isEqualTo(7);
    }
    @Test
    public void canStateMediaType(){
        assertThat(television.stateMediaType()).isEqualTo("Broadcasting");
    }
}
