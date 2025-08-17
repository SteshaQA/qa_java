import com.example.Family;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    private Feline feline;

    private final int kittensCountInput;
    private final int expected;

    public FelineParametrizedTest (int kittensCountInput, int expected){
        this.kittensCountInput = kittensCountInput;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getInputData() {
        return new Object[][]{
                {5, 5},
                {10, 10},
                {2, 2},
                {0, 0},
                {1, 1},
        };
    }

    @Test
    public void checkGetKittens() {
        feline = new Feline();
//        Mockito.when(family.getKittens(kittensCountInput)).thenReturn(kittensCountInput);
        assertEquals(expected, feline.getKittens(kittensCountInput));
    }
}

