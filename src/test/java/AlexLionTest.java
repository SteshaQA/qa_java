import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    private AlexLion alexLion;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        alexLion = new AlexLion(feline);
    }

    @Test
    public void alexLionFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = alexLion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void alexLionGetKittensTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        int actual = alexLion.getKittens();
        assertEquals(0, actual);
    }

    @Test
    public void alexGetFriendsTest() throws Exception {
        List<String> actual = alexLion.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), actual);
    }

    @Test
    public void alexGetPlaceOfLivingTest() throws Exception {
        String actual = alexLion.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", actual);
    }


    @Test
    public void alexDoesHaveManeTest() throws Exception {
        boolean actual = alexLion.doesHaveMane();
        assertTrue(actual);
    }

}
