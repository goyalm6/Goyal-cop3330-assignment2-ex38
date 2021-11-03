package ex38;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void filterEvenNumbersShouldReturnFourNumbers() {
        String data = "1 2 3 4 5 6 7 8";
        Integer evenList[] = ex38.Main.filterEvenNumbers(data);
        System.out.println(ex38.Main.filterEvenNumbers(data));
        assertEquals(4, evenList.length);
        assertEquals(2, evenList[0]);
        assertEquals(4, evenList[1]);
    }

    @Test
    void filterEvenNumbersShouldReturnEvenNumbers() {
        String data = "1 2 3 4 5 6 7 8";
        Integer evenList[] = ex38.Main.filterEvenNumbers(data);
        System.out.println(ex38.Main.filterEvenNumbers(data));
        assertEquals(4, evenList.length);
        assertEquals(2, evenList[0]);
        assertEquals(4, evenList[1]);
    }
}