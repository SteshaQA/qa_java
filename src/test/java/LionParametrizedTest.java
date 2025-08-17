import com.example.Family;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private Family family;

    private final String sexInput;
    private final boolean expected;
    private final String exceptionMessage;

    public LionParametrizedTest (String sexInput, boolean expected, String exceptionMessage){
        this.sexInput = sexInput;
        this.expected = expected;
        this.exceptionMessage = exceptionMessage;
    }

    @Parameterized.Parameters
    public static Object[] getInputData() {
        return new Object[][]{
                {"Самка", false, null},
                {"Самец", true, null},
                {"Львенок", false, "Используйте допустимые значения пола животного - самец или самка"},
                {"Мальчик", false, "Используйте допустимые значения пола животного - самец или самка"},
                {"Девочка", false, "Используйте допустимые значения пола животного - самец или самка"},
        };
    }

    @Before
    public void init() {
        family = Mockito.mock(Family.class);
    }

    @Test
    public void checkMane() throws Exception {
        try {
            Lion lion = new Lion(sexInput, family);
            assertEquals(expected, lion.doesHaveMane());
        } catch (Exception e) {
            assertEquals(exceptionMessage, e.getMessage());
        }
    }
}
