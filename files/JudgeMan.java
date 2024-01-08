import java.util.Arrays;

public class JudgeMan {

    public JudgeMan(){
        
    }
    public static String judge(String[] hand) {
        int[] intArray = numCut(hand);
        Arrays.sort(intArray);
        String ans = straightJudge(intArray);
        if(hand[0].substring(1).equals("2") && hand[1].substring(1).equals("3") && hand[2].substring(1).equals("4") && hand[3].substring(1).equals("5") && hand[4].substring(1).equals("6")){
            return "Straight";
        }
        if(hand[0].substring(1).equals(hand[1].substring(1)) && hand[0].substring(1).equals(hand[3].substring(1))){
            return "Three Card";
        }
        ans = pairJudge(hand);
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
    
    // 数字部分のみ切り出す
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
            if (intArray[i] != (intArray[i - 1] + 1)){
                System.out.println(intArray[i]);
                return "No Hand";
            }else {
                continue;
            }
        }
    return "Straight";
    }
}
