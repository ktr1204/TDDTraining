import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class JudgeMan {

    public JudgeMan(){
        
    }
    public static String judge(String[] hand) {
        int[] intArray = numCut(hand);
        Arrays.sort(intArray);
        // FourCard判定
        for(int i = 0; i < 2; i++){
            if((intArray[i] == intArray[i + 1]) && (intArray[i] == intArray[i + 2]) && (intArray[i] == intArray[i + 3])){
                return "Four Card";
            }
        }
        // FullHouse判定
        if(isThreeCard(intArray) && (pairJudge(intArray) == 1)){
            return "Full House";
        }
        // Flush判定
        String[] suitArray = new String[5];
        int flushCounter = 0;
        for(int i = 1; i < hand.length; i++){
            if(!hand[i].substring(0,1).equals(hand[i - 1].substring(0,1))){
                break;
            } else {
                flushCounter++;
            }
        }
        // Straight判定
        int straightCounter = 0;
        for(int i = 1; i < intArray.length; i++){
            if (intArray[i] == (intArray[i - 1] + 1)){
                straightCounter++;
            }
        }
        // Straight Flush判定
        if(flushCounter == 4 && straightCounter == 4){
            return "Straight Flush";
        }
        if(straightCounter == 4){
            return "Straight";
        }
        // ThreeCard判定
        if(isThreeCard(intArray)){
            return "Three Card";
        }
        // Two Pair判定
        // One Pair判定
        int ans = pairJudge(intArray);
        switch(ans){
            case 1:
                return "One Pair";
            case 2:
                return "Two Pair";
            default:
                return "No Hand";
        }
    }
    
    // Pair判定
    private static int pairJudge(int[] intArray){
        int pairStack = 0;
        List<Integer> isPaired = new ArrayList<Integer>();
        for(int i = 0; i < intArray.length; i++){
            int number = intArray[i];
            for(int k = i + 1; k < intArray.length; k++){
                if(i == k){
                    continue;
                }
                if(number == (intArray[k])){
                    pairStack++;
                    // 3枚以上あったときはpairではないようにする処理
                    isPaired.add(number);
                    int pair = 0;
                    for(int m = 0; m < isPaired.size(); m++){
                        if(isPaired.get(m) == number){
                            pair++;
                        }
                        // System.out.println(pair);
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
    // ThreeCard判定
    private static boolean isThreeCard(int[] intArray){
        for(int i = 0; i < 3; i++){
            if((intArray[i] == intArray[i + 1]) && (intArray[i] == intArray[i + 2])){
                return true;
            }
        }
        return false;
    }
    // Flush判定
    private static boolean isFlush(String[] hand){
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
            return true;
        }
        return false;
    }
}
