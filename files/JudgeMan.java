import java.util.Arrays;

public class JudgeMan {

    public JudgeMan(){
        
    }
    public static String judge(String[] hand) {
        int[] intArray = numCut(hand);
        Arrays.sort(intArray);
        // Straight判定エリア
        int counter = 0;
        for(int i = 1; i < intArray.length; i++){
            if (intArray[i] == (intArray[i - 1] + 1)){
                counter++;
            }
        }
        if(counter == 4){
            return "Straight";
        }
        // ThreeCard判定エリア
        for(int i = 0; i < 2; i++){
            for(int k = i + 1; k < intArray.length; k++){
                if(i == k){
                    continue;
                }
                if((intArray[i] == intArray[i + 1]) && (intArray[i] == intArray[i + 2])){
                    pairStack++;
                }
            }
        }
        if(intArray){
            return "Three Card";
        }
        String ans = pairJudge(hand);
        return ans;
    }
    
    // Pair判定エリア
    private static String pairJudge(String[] hand){
        int pairStack = 0;
        for(int i = 0; i < hand.length; i++){
            String number = hand[i].substring(1);
            for(int k = i + 1; k < hand.length; k++){
                if(i == k){
                    continue;
                }
                if(number.equals(hand[k].substring(1))){
                    pairStack++;
                }
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
}
