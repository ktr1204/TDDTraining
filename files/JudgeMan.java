import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class JudgeMan {

    public JudgeMan(){
        
    }
    public static String judge(String[] hand) {
        int[] intArray = numCut(hand);
        Arrays.sort(intArray);
        // Flush判定エリア
        String[] suitArray = new String[5];
        int flushCounter = 0;
        for(int i = 1; i < hand.length; i++){
            if(!hand[i].substring(0,1).equals(hand[i - 1].substring(0,1))){
                break;
            } else {
                flushCounter++;
            }
        }
        if(flushCounter == 4){
            return "Flush";
        }
        // Straight判定エリア
        int straightCounter = 0;
        for(int i = 1; i < intArray.length; i++){
            if (intArray[i] == (intArray[i - 1] + 1)){
                straightCounter++;
            }
        }
        if(straightCounter == 4){
            return "Straight";
        }
        // ThreeCard判定エリア
        for(int i = 0; i < 3; i++){
            for(int k = i + 1; k < intArray.length; k++){
                if(i == k){
                    continue;
                }
                if((intArray[i] == intArray[i + 1]) && (intArray[i] == intArray[i + 2])){
                    // Full House判定
                    if(isFullHouse(hand)){
                        return "Full House";
                    } else {
                        return "Three Card";
                    }
                }
            }
        }
        int ans = pairJudge(hand);
        switch(ans){
            case 1:
                return "One Pair";
            case 2, 3, 4:
                return "Two Pair";
            default:
                return "No Hand";
        }
    }
    
    // Pair判定エリア
    private static int pairJudge(String[] hand){
        int pairStack = 0;
        for(int i = 0; i < hand.length; i++){
            String number = hand[i].substring(1);
            for(int k = i + 1; k < hand.length; k++){
                if(i == k){
                    continue;
                }
                if(number.equals(hand[k].substring(1))){
                    pairStack++;
                    // 3枚以上あったときはpairではないようにする処理
                    List<Integer> isPaired = new ArrayList<Integer>();
                    isPaired.add(Integer.parseInt(number));
                    int pair = 0;
                    for(int m = 0; m < isPaired.size(); m++){
                        if(isPaired.get(m) == Integer.parseInt(number)){
                            pair++;
                        }
                        System.out.println(pair);
                        if(pair > 1){
                            pairStack = pairStack - 1;
                        }
                    }
                }
            }
        }
        System.out.println(pairStack);
        return pairStack;
    }
    
    // 数字部分をint型で切り出す
    private static int[] numCut(String[] args){
        int[] intArray = new int[5];
        for(int i = 0; i < args.length; i++){
            intArray[i] = Integer.parseInt(args[i].substring(1));
        }
        return intArray;
    }
    
    // Straight判定エリア
    private static String straightJudge(int[] intArray){
        for(int i = 1; i < intArray.length; i++){
            if (intArray[i] == (intArray[i - 1] + 1)){
                continue;
            }else {
                return "No Hand";
            }
        }
    return "Straight";
    }
    
    // FullHouse判定エリア
    private static boolean isFullHouse(String[] hand){
        // System.out.println(hand[0]);
        // System.out.println(hand[1]);
        // System.out.println(hand[2]);
        // System.out.println(hand[3]);
        // System.out.println(hand[4]);
        // System.out.println(pairJudge(hand));
        return pairJudge(hand) >= 2;
    }
}
