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


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void eatMeatTest() throws Exception{
        Mockito.when(feline.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыб"));

        List<String> actual = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыб"), actual);
    }

    @Test
    public void getFamilyTest(){
        //Mockito.when(animal.getFamily()).thenReturn("Кошачьи");
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittensTestWithoutArgs(){
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }
}
