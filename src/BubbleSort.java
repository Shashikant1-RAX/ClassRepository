//Time complexity is -> n^2 for this code for Worst case, Average case and Best case.
public class BubbleSort {
    static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){ //i is at their correct sorted position so we don't need to sort that.
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
    int [] arr = {4, 1, 3, 9, 7};
        bubbleSort(arr);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
