import java.util.Arrays;

public class JudgeMan {

    public JudgeMan(){
        
    }
    public static String judge(String[] hand) {
        for(int i = 0; i < hand.length; i++){
                String numberi = hand[i].substring(1);
                System.out.print("i = ");
                System.out.print(i);
                System.out.print(" number = ");
                System.out.println(numberi);
            for(int k = 0; k < hand.length; k++){
                if(i == k){
                    continue;
                }
                String numberk = hand[k].substring(1);
                System.out.print("k = ");
                System.out.print(k);
                System.out.print(" number = ");
                System.out.println(numberk);
            }
        }
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
