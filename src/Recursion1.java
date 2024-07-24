import java.util.*;
import java.util.Scanner;
//public class Recursion1 {
//    static int factorial(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        else{
////            int product = 1;
////            for(int i=1;i<=n;i++){
////                product *= i;
////            }
//            return n * factorial(n-1);
//            //return product;
//        }
//    static int fibonacci(int n){
//        if(n <= 1){
//            return n;
//        }
//        else{
//            return fibonacci(n-1) + fibonacci(n-2);
//        }
    //power of n to the k...
//    static double powerOfQ(int n, int q){
//        if(q==0){
//            return 1;
//        }
//        else{
//            return powerOfQ(n,q-1) * n;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of x: ");
//        int x = sc.nextInt();
////        //int x = 4;
////        System.out.println(factorial(x));
//        //System.out.println(fibonacci(x));
//        System.out.println(powerOfQ(x,4));
////
//    }
//}

//sum of natural number using recursion
//    static int sumRec(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n + sumRec(n-1);
///*        The breakdown of recursive calls for sumRec(5) is as follows:
//
//        sumRec(5) calls sumRec(4)
//        sumRec(4) calls sumRec(3)
//        sumRec(3) calls sumRec(2)
//        sumRec(2) calls sumRec(1)
//        sumRec(1) calls sumRec(0)
//        sumRec(0) returns 0 (base case)
//        The recursion unwinds, and each recursive call adds its result to the current value of n
//        The final result is 5 + 4 + 3 + 2 + 1 = 15 */
    //}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of x: ");
//        int x = sc.nextInt();
//        //int x = 4;
//        int c = sumRec(x);
//        System.out.println(c);
//
//    }
//}

//Prime number...
//class PrimeNumber{
//    static int b=2;
//    static int flag = 0;
//    static void primeNumber(int x){
//        while(b<=Math.sqrt(x)){
//            if(x%b==0) {
//                flag = 1;
//                break;
//            }
//            b++;
//        }
//        if(flag==0)
//            System.out.println(x + " is prime number");
//        else
//            System.out.println(x + " is not prime number");
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of x: ");
//        int x = sc.nextInt();
//        PrimeNumber.primeNumber(x);
//    }
//}

//Prime number from 10 to 100;
//class PrimeNumbersInRange {
//    static boolean isPrime(int x) {
////        if (x <= 1) {
////            return false;
////        }
//       for (int b = 2; b <= Math.sqrt(x); b++) {
//            if (x % b == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        for (int num = 10; num <= 100; num++) {
//            if (isPrime(num)) {
//                System.out.println(num);
//            }
//        }
//    }
//}

//class PrimeInRange{
//    public static boolean isPrime(int n){
//        if(n<=1){
//            return false;
//        }
//        for(int b=2;b<=Math.sqrt(n);b++){
//            if(n%b==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        for(int x = 10; x<=100; x++){
//            if(isPrime(x)){
//                System.out.print(x + " ");
//            }
//        }
//    }
//}

//class NaturalNumber{
//    static void naturalNumberWithRecursion(int n){
//        //HaltCondition or Base Condition...
//        if(n == 1){
//            System.out.println(n);
//            return;
//        }
//        //Smaller sub-problems.
//        //naturalNumberWithRecursion(n-1);
//
//        //Self-work;
//        System.out.println(n);
//
//        //Smaller sub-problems.
//        naturalNumberWithRecursion(n-1);
//
//    }
//    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        System.out.println("Enter the number: ");
//        int n = Integer.parseInt(br.readLine());
//        naturalNumberWithRecursion(n);
//    }
//}

//given a number and a value k, print k multiples of n.
//class multiples {
//    public static void printMultiples(int n, int k) {
//        if (k == 1) {
//            System.out.println(n);
//            return;
//        }
//        printMultiples(n, k - 1);
//        System.out.println(n * k);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        printMultiples(n,k);
//    }
//}

//finding sum for alternate signs like (1+2-3+4-5=-1)...
//class SumSeries{
//    public static int seriesSum(int n){
//        if(n == 0){
//            return 0;
//        }
//        if(n % 2 == 0){
//            return seriesSum(n-1) - n;
//        }
//        else{
//            return seriesSum(n-1) + n;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(seriesSum(n));
//    }
//}

//finding GCD of two numbers...
//Euclid's Algo. :-
// GCD(x,y) = GCD(y, x%y)  // recurrence relation.
//GCD(x,0) = x // base case.
//class GCD{
//    //using recursion...
//    public static int gcd(int x, int y){
//        if(y == 0){
//            return x;
//        }
//        return gcd(y, x%y);
//    }
//
//    //using iterative method...
//    public static int iGCD(int x, int y){
//        while(x % y != 0){
//            int rem = x % y;
//            x = y;
//            y = rem;
//        }
//        return y;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println(iGCD(x,y));
//        System.out.println(gcd(x,y));
//    }
//}

//finding armstrong number using recursion...
//class ArmstrongNumber{
//    public static int armstrongNumber(int x){
//        if(x == 0 || x == 1){
//            return x*x*x;
//        }
//        return (x%10) * (x%10) * (x%10) + armstrongNumber(x/10);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int num = armstrongNumber(x);
//        if( num == x) System.out.println("Armstrong number");
//        else System.out.println("Not Armstrong number");
//    }
//}

//printing the array element recursively.
//class PrintArray{
//    static void printArray(int [] arr, int idx){
//        if(idx == arr.length){
//            return;
//        }
//        System.out.println(arr[idx]);
//        printArray(arr, idx+1);
//    }
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
//        printArray(arr,0);
//    }
//}

//finding max value from an array using recursion...
//class FindMax{
//    static int findMax(int [] arr, int idx){
//        if(idx == arr.length-1){
//            return arr[idx];
//        }
//        int smallAns = findMax(arr, idx+1);
//        return Math.max(smallAns, arr[idx]);
//    }
//    public static void main(String[] args) {
//        int [] arr = {36, 45, 12, 34, 67};
//        System.out.println(findMax(arr,0));
//    }
//}

//finding sum of an array using recursion...
//class SumArray{
//    static int sumArray(int [] arr, int idx){
//        if(idx == arr.length){
//            return 0;
//        }
//        int smallAns = sumArray(arr,idx+1);
//        return arr[idx] + smallAns;
//    }
//    public static void main(String[] args) {
//        int [] arr = {2,3,5,20,1 };
//        System.out.println(sumArray(arr,0));
//    }
//}

//Linear Search to print yes or no...
//class LinearSearch{
//    public static boolean search(int[] arr, int target, int n, int idx){
//        if(idx >= n){
//            return false;
//        }
//        if(arr[idx] == target) return true;
//
//        return search(arr, target, n, idx+1);
//    }
//    //returning index of element if target is present...
//    public static int search1(int[] arr, int target, int n, int idx){
//        if(idx >= n){
//            return -1;
//        }
//        if(arr[idx] == target) return idx;
//
//        return search1(arr, target, n, idx+1);
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4};
//        int target = 31;
//        if(search(arr, target, arr.length, 0))  System.out.println("Yes");
//        else System.out.println("No");
//        System.out.println(search1(arr, target, arr.length, 0));
//    }
//}

//printing all the indices of the target element...
//class LinearSearch{
//    static void findAllIndices(int [] arr, int target, int n, int idx){
//        if(idx >= n){
//            return;
//        }
//        if(arr[idx] == target){
//            System.out.println(idx);
//        }
//        findAllIndices(arr, target, n, idx+1);
//    }
//    public static void main(String[] args) {
//        int [] arr = { 1,2,3,4,2,3,2,4};
//        int target = 2;
//        findAllIndices(arr, target, arr.length, 0);
//    }
//}


//printing all the indices of the target element in an arraylist...
//import java.util.ArrayList;
//class LinearSearch2{
//    static ArrayList<Integer> findAllIndices(int [] arr, int target, int n, int idx){
//        ArrayList<Integer> ans = new ArrayList<>();
//        if(idx >= n){
//            return ans;
//        }
//        if(arr[idx] == target) {
//            ans.add(idx);
//        }
//        ArrayList<Integer> smallAns = findAllIndices(arr, target, n, idx + 1);
//        ans.addAll(smallAns);
//        return ans;
//    }
//    public static void main(String[] args) {
//        int [] arr = { 1,2,3,3,4,3,5};
//        int target = 3;
//        ArrayList<Integer> ans = findAllIndices(arr, target, arr.length, 0);
//        for(int i : ans){
//            System.out.print(i + " ");
//        }
//    }
//}

//isSorted using recursion...
class Sorted{
    static boolean isSoretd(int [] arr, int n, int idx){
        if(idx >= n){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return true;
        }
        return isSoretd(arr, n, idx+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        if(isSoretd(arr, arr.length - 1, 0)) System.out.println("Yes");
        else System.out.println("No");
    }
}

//class LinearSearch{
//    //returning last index of element if target is present...
//    public static int search1(int[] arr, int target, int n, int idx){
//        if(idx <= n){
//            return -1;
//        }
//        if(arr[idx] == target) return idx;
//
//        return search1(arr, target, n, idx-1);
//    }
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,3,5,6,3,7};
//        int target = 31;
//        System.out.println(search1(arr, target, 0, arr.length-1));
//    }
//}


//removing the occurrence of character in a letter...
class RemoveOccurrence{
//    static String removeOccurrence(String str, int idx){
//        if(idx == str.length()) return " ";
//        String smallAns = removeOccurrence(str, idx+1);
//        char currChar = str.charAt(idx);
//        if(currChar != 'a'){
//            return currChar + smallAns;
//        }
//        else{
//            return smallAns;
//        }
//    }
    //using substring...
    static String removeOccurrence1(String str){
        if(str.length() == 0) return " ";
        String smallAns = removeOccurrence1(str.substring(1));
        char currChar = str.charAt(0);
        if(currChar != 'a'){
            return currChar + smallAns;
        }
        else
            return smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println(removeOccurrence(str, 0));
        System.out.println(removeOccurrence1(str));
    }
}

//reversing an string...
class ReverseString{
    static String reverse(String str, int idx){
        if(idx == str.length()) return "";
        String smallAns = reverse(str, idx+1);
        return smallAns + str.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str, 0));
    }
}

//Palindrome using reverse approach...
class Palindrome{
    static boolean isPalindrome(String str, int left, int right){
        if(left >= right){
            return true;
        }
        return (str.charAt(left) == str.charAt(right) && isPalindrome(str, left+1, right-1));
//        if(str.charAt(left) == str.charAt(right)){
//            return true;
//        }
//        return isPalindrome(str, left+1, right-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isPalindrome(str,0,str.length()-1)){
            System.out.println(str + " is palindrome");
        }
        else System.out.println(str + " is not palindrome");
    }
}

//printing all the subsequences of string in ArrayList...
class Subsequence{
    static ArrayList<String> getSSQ(String str){
        ArrayList<String> ans = new ArrayList<>();
        //base condition.
        if(str.length() == 0){
            ans.add(" ");
            return ans;
        }
        //recursive work...
        char curr = str.charAt(0);
        ArrayList<String> smallAns = getSSQ(str.substring(1));

        //self work...
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> a = getSSQ(str);
        for(String b : a){
            System.out.println(b);
        }
    }
}

//printing all the subsequences of string...
//class Subsequence{
//    static void printSSQ(String str, String currAns){
//        //base condition.
//        if(str.length() == 0){
//            System.out.println(currAns);
//            return;
//        }
//        char currChar = str.charAt(0);
//        String remainingAns = str.substring(1);
//        printSSQ(remainingAns, currAns + currChar);
//        printSSQ(remainingAns, currAns);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        printSSQ(str, " ");
//    }
//}
class printSubSequence{
    static void printSubSequence(String str, String emptyStr){
        //base condition.
        if(str.isEmpty()){
            System.out.println(emptyStr);
            return;
        }
        char currChar = str.charAt(0);
        String remainingStr = str.substring(1);
        //self work.
        printSubSequence(remainingStr, emptyStr+currChar);
        //recursive work.
        printSubSequence(remainingStr, emptyStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubSequence(str, "");
    }
}

//printing all the sum of subsets of int array...
class PrintSubsets{
    static void printSubsetSum(int[] arr, int n, int idx, int currSum ){
        //base condition.
        if(idx >= n){
            System.out.println(currSum);
            return;
        }
        //recursive work.
        printSubsetSum(arr, n, idx+1, currSum + arr[idx]);
        //self work.
        printSubsetSum(arr,n,idx+1, currSum);
    }
    public static void main(String[] args) {
        int [] arr = {2,4,5};
        printSubsetSum(arr, arr.length, 0, 0);
    }
}

//finding x^n with stack height log n.
class Power{
    static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n % 2 == 0){
            return calcPower(x,n/2) * calcPower(x, n/2);
        }
        else{
            return calcPower(x,n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        System.out.println(calcPower(2,5));
    }
}

//Move all the x to last of the string.
class MoveAllX{
    static void moveAllX(String str, int count, int idx, String newString){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
//            moveAllX(str,count,idx+1,newString);
        }
        else{
            newString += currChar;
//            moveAllX(str,count,idx+1,newString);
        }
        moveAllX(str,count,idx+1,newString);
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str,0,0,"");
    }
}

//removing all duplicates from string...
class RemoveDuplicates{
    public static boolean map [] = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str,idx+1,newString);
        }
        else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str,idx+1,newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str,0,"");
    }
}

//Print unique subsequences terms. means if we are printing for "aaa" it will print like -> aaa,aa,aa,aa,a,a,a,"".
// but for unique subsequence it will print like -> aaa,aa,a,"".
class UniquePrintSubsequence{
    static void subsequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be.
        subsequences(str,idx+1,newString+currChar, set);

        //not to be.
        subsequences(str,idx+1,newString, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        subsequences(str,0,"",set);
    }
}

//Printing all permutations of a String.
//Time Complexity -> n * (n-1) * (n-2) * ......... * 1. so the TC is (n!).
class PrintPermutation{
    static void printPermutation(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
    }
}

//Count total paths in a maze to move from (0,0) to (n,m);
// you can move only downward or rightward.
class CountPaths{
    static int countPaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }

        //moving downWards.
        int downPaths = countPaths(i+1,j,n,m);

        //moving rightWards.
        int rightPaths = countPaths(i,j+1,n,m);
        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(countPaths(0,0,n,m));
    }
}

//Placing a tiles on to the floor...
class PlacedTiles{
    static int placedTiles(int n, int m){
        if(n == m){
            return 2; //if there is two tiles you can print only in vertical and horizontal.
        }
        if (n < m){
            return 1; //only way to placed horizontally tiles.
        }
        //vertically...
        int vertPlaced = placedTiles(n-m, m);

        //Horizontally
        int horiPlaced = placedTiles(n-1, m);

        return vertPlaced + horiPlaced;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placedTiles(n,m));
    }
}

//Finding ways to call guests...
class CallGuests{
    static int callGuests(int n){
        if(n <= 1){ //if no guests are invited, after that it have one way to call.
            return 1;
        }
         //single.
        int single = callGuests(n-1);

        //pair.
        int pair = (n-1) * callGuests(n-2);

        return single + pair;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));
    }
}

//Printing subsets of n natural numbers.
class NaturalNumberSubsets{
    static void findSubsets(int n, ArrayList<Integer> subset){
        if(n == 0){
            for(int i=0; i<subset.size(); i++){
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
            return;
        }
        //for add.
        subset.add(n);
        findSubsets(n-1, subset);

        //for not add.
        subset.remove(subset.size()-1);
        findSubsets(n-1,subset);
    }
    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        int n = 3;
        findSubsets(n,subset);
    }
}