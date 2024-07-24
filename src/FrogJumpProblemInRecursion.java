//Frog Problem using recursion...
//public class FrogJumpProblemInRecursion {
//    static int bestApproach(int[] h, int n, int idx){
//        if(idx == n-1){
//            return 0;
//        }
//        int op1 = bestApproach(h,n,idx+1) + Math.abs(h[idx] - h[idx+1]);
//        if(idx == n-2){
//            return op1;
//        }
//        int op2 = bestApproach(h,n,idx+2) + Math.abs(h[idx] - h[idx+2]);
//        return Math.min(op1,op2);
//    }
//    public static void main(String[] args) {
//        int [] h = {10,30,40,20};
//        System.out.println(bestApproach(h,h.length,0));
//    }
//}


//Keypad Combination using recursion...
class KeypadCombination{
    static void combination(String dig, String [] kp, String res){
        //base cond^n
        if(dig.length() == 0){
            System.out.println(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for(int i=0; i<currChoices.length(); i++){
            combination(dig.substring(1), kp, res+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig = "253";
        String [] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combination(dig, kp, "");
    }
}