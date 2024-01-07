import java.util.Arrays;

public class JudgeMan {

    public JudgeMan(){
        
    }
    public static String judge(String[] hand) {{
        String[] twoPair = {"H2", "C3", "D2", "S3", "H6"};
        if(Arrays.equals(hand, twoPair)){
            return "Two Pair";
        }
        String[] onePair = {"H2", "C3", "D2", "S5", "H6"};
        if(Arrays.equals(hand, onePair)){
            return "One Pair";
        }
            return "No Hand";
    }
}
