// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class JudgeManTest {

    @Test
    void NoHand() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"H2", "C3", "D9", "S5", "H6"};
        String actual = judgeMan.judge(hand);
        assertEquals("No Hand", actual);
    }
    
    @Test
    void OnePair() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"H2", "C3", "D2", "S5", "H6"};
        String actual = judgeMan.judge(hand);
        assertEquals("One Pair", actual);
    }
    @Test
    void OnePair2() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"H2", "C3", "D6", "H5", "S2"};
        String actual = judgeMan.judge(hand);
        assertEquals("One Pair", actual);
    }
    @Test
    void TwoPair() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"H2", "C3", "D2", "S3", "H6"};
        String actual = judgeMan.judge(hand);
        assertEquals("Two Pair", actual);
    }
    @Test
    void TwoPair2() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"H2", "D2", "C3", "S3", "H6"};
        String actual = judgeMan.judge(hand);
        assertEquals("Two Pair", actual);
    }
    @Test
    void ThreeCard() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"H2", "D2", "C3", "S2", "H6"};
        String actual = judgeMan.judge(hand);
        assertEquals("Three Card", actual);
    }
    @Test
    void Straight() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"H2", "D3", "C4", "S5", "H6"};
        String actual = judgeMan.judge(hand);
        assertEquals("Straight", actual);
    }
    @Test
    void Flush() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"H2", "H9", "H4", "H8", "H6"};
        String actual = judgeMan.judge(hand);
        assertEquals("Flush", actual);
    }
    @Test
    void Flush2() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"D7", "D4", "D9", "D6", "D5"};
        String actual = judgeMan.judge(hand);
        assertEquals("Flush", actual);
    }
    @Test
    void FullHouse() {
        JudgeMan judgeMan = new JudgeMan();
        String[] hand = {"D3", "H3", "D9", "C9", "S9"};
        String actual = judgeMan.judge(hand);
        assertEquals("Full House", actual);
    }
}
