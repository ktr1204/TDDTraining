// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class JudgeManTest {

    @Test
    void ThreeCard() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"H2", "D2", "C3", "S2", "H6"};
        String actual = judgeMan.judge(hand);
        assertEquals("Three Card", actual);
    }

}
