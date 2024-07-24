import java.util.HashSet;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//    }
//}

//finding Armstrong number...
//class Armstrong{
//    public static void armstrong(int x){
//        int n = x;
//        int arm = 0;
//        while(x>0){
//            int rem = x%10;
//            arm = (rem*rem*rem) + arm;
//            x = x/10;
//        }
//        if(n == arm) System.out.println("Armstrong number");
//        else System.out.println("Not Armstrong number");
//    }
//    public static int armstrong1(int m){
//        if(m == 0 || m == 1) return m*m*m;
//        //if(m < 10) return m*m*m;
//        return (m%10) * (m%10) * (m%10) + armstrong1(m/10);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x =  sc.nextInt();
//        armstrong(x);
//        int j = armstrong1(x);
//        if ( j == x) System.out.println("Armstrong number");
//        else System.out.println("Not Armstrong number");
//    }
//}

//class Solution {
    //public static int reverse(int x) {
        //int n = 0;
//        while(x != 0){
//            int a = x % 10;
//            if(n > Integer.MAX_VALUE/10 || n < Integer.MIN_VALUE/10){
//                return 0;
//            }
//            n = (n*10) + a;
//            x = x / 10;
//        }
//        return n;
    //}
//    static boolean reverse(int x){
//        int n = 0, m;
//        m = x;
//        while (x > 0){
//            int a = x%10;
//            n = (n*10) + a;
//            x = x/10;
//        }
//        return n == m;
//    }
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println(reverse(x));
//    }
//}

//class Solution {
//    public static int strStr(String haystack, String needle) {
//       for(int i=0; i<haystack.length(); i++){
//           if(haystack.charAt(i) == needle.charAt(0)){
//               if(haystack.substring(i,needle.length()+i).equals(needle)){
//                   return i;
//               }
//           }
//       }
//       return -1;
//    }
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        String haystack = "sadbutsad";
//        String needle = "sad";
//        System.out.println(strStr(haystack, needle));
//    }
//}


//output = "bab"
class Solution {
    public static String longestPalindrome(String s){
        int n = s.length();
        int j = 1;
        String str = s;
        String rev = "";
        for(int i=n-j; i>=0; i--){
            rev = rev + s.charAt(i);
            while(!isPalindrome(s,0,n-1)){
                j++;
            }
        }
        return rev;
    }
    static boolean isPalindrome(String str, int left, int right){
        if(left >= right){
            return true;
        }
        return (str.charAt(left) == str.charAt(right) && isPalindrome(str, left+1, right-1));
    }
    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}

class Aisahi{
    static void reverse(String s, int idx){
        if(idx == 0){
            System.out.print(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        reverse(s,idx-1);
    }
    public static void main(String[] args) {
        String s = "abcd";
//        for(int i=s.length()-1; i>=0; i--){
//            System.out.print(s.charAt(i));
//        }
        reverse(s,s.length()-1);
    }
}

class Occurence{
    static int first = -1;
    static int last = -1;
    static void firstAndLastOccurence(String str, int idx, char element) {
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        firstAndLastOccurence(str,idx+1,element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        char element = 'a';
        firstAndLastOccurence(str,0,element);
    }
}

//checking an array is sorted(Strictly increasing);
class CheckSorted{
    static boolean isSorted(int [] array, int n, int idx){
        if(idx >= n){
//            return true;
            return isSorted(array,n,idx+1);
        }
        if(array[idx] > array[idx+1]){
            return false;
        }
        else return false;
//        return isSorted(array,n,idx+1);
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,4};
        System.out.println(isSorted(array,array.length-1,0));
    }
}

class PrintSubsequence1{
    static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be.
        subsequences(str,idx+1,newString+currChar);

        //not to be.
        subsequences(str,idx+1,newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str,0,"");
    }
}

//Keypad Combination by Apna College.
class KeyPadCombination1{
    public static String [] keypad = {"","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypadCombinations(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0; i<mapping.length(); i++){
            keypadCombinations(str,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        keypadCombinations(str,0,"");
    }
}
