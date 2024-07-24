import java.util.Scanner;

public class RevisionPurpose {
    public static void reverse(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx) + " ");
        reverse(str,idx-1);
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        reverse(str,str.length()-1);
    }
}

class KeypadCombination1234{
    static void keypadCombination(String [] keys, String str, int idx, String comb){
        if(idx == str.length()){
            System.out.println(comb);
            return;
        }
        char currChar = str.charAt(idx);
        String choice = keys[currChar - '0'];
        for(int i = 0; i < choice.length(); i++){
            keypadCombination(keys,str,idx+1,comb+choice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String [] keys =  {"","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        String str = "23";
        keypadCombination(keys,str,0,"");
    }
}

//bubble sort...
class Solution35823
{
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();
        int [] arr = new int [N];
        System.out.println("Enter the value to sort: ");
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,N);
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}