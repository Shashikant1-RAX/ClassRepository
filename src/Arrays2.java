import java.util.*;
//public class Arrays2 {
//    public static void main(String[] args) {
//        int[] Shashi = { 5,78,9,90,12};
//        for(int i=0;i<Shashi.length;i++) {
//            System.out.println(Shashi[i]);
//       }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter 5 arrays elements: ");
//        int[] shashi = new int[5];
//        for(int i=0;i<shashi.length;i++) {
//            shashi[i] = sc.nextInt();
//        }
//        for(int j=shashi.length-1;j>=0;j--) {
//            System.out.println(shashi[j]);
//        }
//Reversing an array
        //int [] arr = {1,2,3,4,5,6,7};
//        Scanner sc = new Scanner(System.in);
//        int [] arr = new int[10];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        int l = arr.length;
//        int temp;
//        int n = Math.floorDiv(l,2);
//        for(int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for(int element:arr){
//            System.out.println(element + " ");
//        }

//Reversing an array by another method
//class Reverse1{
//    public static void swapIn(int [] arr, int i, int j){
//        int temp;
//        temp = arr[i];
//        arr[i] =arr[j];
//        arr[j] = temp;
//    }
//    public static void reverseArray(int [] arr) {
//        int i = 0, j = arr.length-1;
//        while (i < j) {
//            swapIn(arr, i, j);
//            i++;
//            j--;
//        }
//    }
//        public static void printArray(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        reverseArray(arr);
//        printArray(arr);
//    }
//}

        //Finding Max...
//        int [] arr = {1,2,3,4,5,6,7};
//        int max=0;
//        //for(int element:arr){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);

        //Finding Min...
//        int min=Integer.MAX_VALUE;
//        //for(int element:arr){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<min) {
//                min = arr[i];
//            }
//        }
//        System.out.println(min);

        //Sorting an array...
//        int [] arr = {1,2,3,4,5,6,7};
//        boolean isSorted=true;
//        for(int i=0;i<arr.length-1;i++) {
//            if (arr[i] > arr[i + 1]) {
//                isSorted = false;
//                break;
//            }
//        }
//            if (isSorted) {
//                System.out.println("sorted");
//            }
//            else {
//                System.out.println("not sorted");
//            }


//Swapping of two number...
//class Swapping {
//    public static void swap(int a, int b){
//        System.out.println("elements a and b before swapping.");
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
////        int temp = a;
////        a = b;
////        b = temp;
////            a = a+b;
////           b = a-b;
////            a = a-b;
//        a = a^b;
//        b = a^b;
//        a = a^b;
////
//        System.out.println("elements a and b after swapping.");
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter elements a and b: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.print("swapped elements are: ");
//        swap(a,b);
//
//    }
//}

//Rotating an Array.
//class RotateAnArray{
//    public static int[] rotateArray(int[] arr, int k){
//        int a = arr.length;
//        int b = k%a;
//        int [] ans = new int[a];
//        int j = 0;
//
//        for(int i = a-b; i < a; i++){
//            ans[j++] = arr[i];
//        }
//
//        for(int i=0;i<a-b;i++){
//            ans[j++] = arr[i];
//        }
//
//        return ans;
//    }
//    public static void printArray(int[] ans){
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of an array");
//        int n =sc.nextInt();
//        int [] arr = new int[n];
//        //taking input in array
//        System.out.println("Enter the elements for an array");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter the steps to rotate");
//        int k = sc.nextInt();
//
//        int[] ans = rotateArray(arr,k);
//        System.out.print("Rotated elements are: ");
//        printArray(ans);
//    }
//}

//Sorting 0 and 1 in first and last place...
//class ZeroAndOnes{
//    public static void sortZeroesAndOne(int [] arr){
//        int zeroes=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0) {
//                zeroes++;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(i<zeroes){
//                arr[i] = 0;
//            }
//            else{
//                arr[i] = 1;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
    //Another approach...
//public static void swapInZeroAndOnes(int [] arr, int left, int right){
//    int temp;
//    temp = arr[left];
//    arr[left] =arr[right];
//    arr[right] = temp;
//}
//public static void sortZeroesAndOnes(int [] arr) {
//    int n = arr.length;
//    int left = 0;
//    int right = n-1;
//    while(left<right){
//        if(arr[left] == 1 && arr[right] == 0){
//            swapInZeroAndOnes(arr,left,right);
//            left++;
//            right--;
//        }
//        if(arr[left] == 0){
//            left++;
//        }
//        if(arr[right] == 1){
//            right--;
//        }
//    }
//    for(int i=0;i<arr.length;i++){
//        System.out.print(arr[i] + " ");
//    }
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of an array");
//        int n =sc.nextInt();
//        int [] arr = new int[n];
//        //taking input in array
//        System.out.println("Enter the elements for an array");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        //sortZeroesAndOne(arr);
//        sortZeroesAndOnes(arr);
//    }
//}

//Sorting all even number at first place...
//class EvenSort{
//    public static void swapInEven(int [] arr, int left, int right){
//        int temp;
//        temp = arr[left];
//        arr[left] =arr[right];
//        arr[right] = temp;
//    }
//    public static void sortEven(int [] arr) {
//        int n = arr.length;
//        int left = 0;
//        int right = n-1;
//        while(left<right){
//            if(arr[left]%2==1 && arr[right]%2 == 0){
//                swapInEven(arr,left,right);
//                left++;
//                right--;
//            }
//            if(arr[left]%2 == 02 ){
//                left++;
//            }
//            if(arr[right]%2 == 1){
//                right--;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of an array");
//        int n =sc.nextInt();
//        int [] arr = new int[n];
//        //taking input in array
//        System.out.println("Enter the elements for an array");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        sortEven(arr);
//    }
//}


//Given an integer array 'a' sorted in non-decreasing order,
// return an array of the square of each number sorted in non-decreasing order
//class NonDecreasingOrderArray{
//    public static void swapForNonDecreasingArray(int [] arr,int left, int right){
//        int temp;
//        temp=arr[left];
//        arr[left] = arr[right];
//        arr[right] = temp;
//    }
//    public static void reverse(int [] arr){
//        int i=0, j=arr.length-1;
//        while(i<j){
//            swapForNonDecreasingArray(arr,i,j);
//            i++;
//            j--;
//        }
//    }
//    public static int[] nonDecreasingArray(int [] arr){
//        int n = arr.length;
//        int left = 0; int right = n-1;
//        int [] ans = new int[n];
//        int k=n-1;
//        while(left<=right){
//            if(Math.abs(arr[left])>Math.abs(arr[right])){
//                ans[k--] = arr[left]*arr[left];  // at place of reverse, we can do k-- which will store elements from last index.
//                left++;
//            }
//            else{
//                ans[k--] = arr[right]*arr[right];
//                right--;
//            }
//        }
//        //reverse(ans);
//        return ans;
//    }
//    public static void printArray(int[] arr){
//        for(int element:arr){
//            System.out.print(element + " ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of an array");
//        int n =sc.nextInt();
//        int [] arr = new int[n];
//        //taking input in array
//        System.out.println("Enter the elements for an array");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int [] ans = nonDecreasingArray(arr);
//        printArray(ans);
//    }
//}

