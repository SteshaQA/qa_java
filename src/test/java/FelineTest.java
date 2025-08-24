import com.example.Animal;
import com.example.Family;
import com.example.Feline;
import com.example.Predator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void eatMeatTest() throws Exception{
        List<String> actual = feline.eatMeat();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
        verify(feline).getFood("Хищник");
    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittensTestWithoutArgs(){
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }
}
