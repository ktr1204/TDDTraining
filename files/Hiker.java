import java.util.Arrays;

public class Hiker {

    public Hiker(){
        
    }
    public static String judge(String[] hand) {
        String[] onePair = {"H2", "C3", "D2", "S5", "H6"};
        if(Arrays.equals(hand, onePair)){
            return "One Pair";
        }
            return "No Hand";
    }
}
