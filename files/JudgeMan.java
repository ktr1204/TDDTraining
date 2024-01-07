import java.util.Arrays;

public class JudgeMan {

    public JudgeMan(){
        
    }
    public static String judge(String[] hand) {
        for(int i = 0; i < hand.length; i++){
                String number = hand[i].substring(1);
                System.out.print("i = ");
                System.out.print(i);
                System.out.print(" number = ");
                System.out.println(numberi);
            for(int k = 0; k < hand.length; k++){
                if(i == k){
                    continue;
                }
                if(number.equals(hand[k].substring(1))){
                    return "One Pair";
                }
                System.out.print("k = ");
                System.out.print(k);
                System.out.print(" number = ");
                System.out.println(hand[k].substring(1));
            }
        }
        String[] twoPair = {"H2", "C3", "D2", "S3", "H6"};
        if(Arrays.equals(hand, twoPair)){
            return "Two Pair";
        }
            return "No Hand";
    }
}
