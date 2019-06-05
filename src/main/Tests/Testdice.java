import org.junit.Test;
import static org.junit.Assert.*;

public class Testdice {
    @Test
    public void tossAndSumTest() {
        Dice dice = new Dice(2);
        int min = 2;
        int max = 12;
        Integer actual = dice.tossAndSum();
        assertTrue(actual <= max && actual >= min);

    }

    @Test
    public void tossAndSumTest2() {
        Dice dice = new Dice(2);
        int min = 3;
        int max = 18;
        Integer actual = dice.tossAndSum();
        assertTrue(actual <= max && actual >= min);

    }

    @Test
    public void tossAndSumTest3() {
        Dice dice = new Dice(2);
        int min = 4;
        int max = 16;
        Integer actual = dice.tossAndSum();
        assertTrue(actual <= max && actual >= min);

    }
}
