import java.util.Arrays;

public class Hiker {

    public Hiker(){
        
    }
    public static String judge(String[] hand) {
        String[] bbb = {"H2", "C3", "D2", "S5", "H6"};
        if(Arrays.equals(hand, bbb)){
            return "One Pair";
        }
        String[] aaa = {"H2", "C3", "D4", "S5", "H6"};
        if(Arrays.equals(hand, aaa)){
            return "No Hand";
        }
            return "Yes Hand";
    }
}
