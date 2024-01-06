// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class HikerTest {

    @Test
    void NoHand() {
        Hiker aa = new Hiker();
        String[] hand = ["H2", "C3", "D4", "S5", "H6"];
        actual = aa.judge(hand);
        assertEquals("No Hand", actual);
    }
}
