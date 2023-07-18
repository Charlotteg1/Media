import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

public class TelevisionTest {
    Television television;
    @BeforeEach
    public void setUp(){
        film= new Film("Barbie","English", LocalDate.parse("2023-07-13"),"Gerwig",true,123,100,300);
    }
}
