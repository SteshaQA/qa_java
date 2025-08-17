import com.example.Family;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Family family;

    @Test
    public void lionFoodTest() throws Exception {
        Lion lion = new Lion("Самка", family);
        Mockito.when(family.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);


    }

    @Test
    public void lionGetKittensTest() throws Exception {
        Lion lion = new Lion("Самка", family);
        Mockito.when(family.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(1, actual);
    }
}

