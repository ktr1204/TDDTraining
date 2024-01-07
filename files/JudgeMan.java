import java.util.Arrays;

public class JudgeMan {

    public JudgeMan(){
        
    }
    public static String judge(String[] hand) {
        int pairStack = 0;
        for(int i = 0; i < hand.length; i++){
                String number = hand[i].substring(1);
                System.out.print("i = ");
                System.out.print(i);
                System.out.print(" number = ");
                System.out.println(number);
            for(int k = 0; k < hand.length; k++){
                if(i == k){
                    continue;
                }
                if(number.equals(hand[k].substring(1))){
                    pairStack++;
                }
                System.out.print(pairStack);
                System.out.print("k = ");
                System.out.print(k);
                System.out.print(" number = ");
                System.out.println(hand[k].substring(1));
            }
        }
        
                switch (pairStack){
                  case 1:
                    return "One Pair";
                  case 2:
                    return "Two Pair";
                }
                    return "No Hand";
    }
}
