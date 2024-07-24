import java.util.*;
import java.util.Arrays;
public class Arrays1 {
    public static void main(String[] args) {
        int[] marks = {67, 78, 90, 45, 97};
        int[] intArray1 = {5, 3, 8, 1, 2};
//        //System.out.println(marks[1]);
//        //System.out.println(marks.length);
////        float [] marks = {78.0f, 89.5f, 98.5f, 33.5f, 45.0f};
////        System.out.println(marks[4]);
////        System.out.println(marks.length);
//       String[] Students = {"Shubham", "Shashi", "Ravi", "Suhani", "Telha"};
//        System.out.println(Students.length);
//
//        for(int i=0; i<Students.length;i++){
//            System.out.println(Students[i]);
////        for (int i = 0; i < marks.length; i++) {
////            System.out.println(marks[i]);
//            //Reverse Order
//        for(int i=marks.length -1; i>=0;i--){
//            System.out.println(marks[i]);
//        }
        Arrays.sort(intArray1);
        for(int element: intArray1){
            System.out.print(element + " ");
        }
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Enter 10 array elements");
//                int Arr[] = new int[10];
//                for(int i = 0; i < Arr.length; i++)
//                    Arr[i] = sc.nextInt();
//                System.out.println("Array: ");
//                for(int j = 0; j < Arr.length; j++)
//                    System.out.println(Arr[j]);
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter 5 array elements");
////        int Arr[] = new int[5];
////        int sum = 0;
////        for(int i = 0; i < Arr.length; i++)
////            Arr[i] = sc.nextInt();
////        System.out.println("Array: ");
////        for(int j = 0; j < Arr.length; j++) {
////            sum = sum + Arr[j];
////        }
////        System.out.println(sum);
//        }
//    }
//class CheckArray1{
//    public static void main(String[] args) {
//        int arr1[] = {5,10,20,30};
//        int sum=0;
//        for(int elements:arr1){
//            sum += elements;
//        }
//        System.out.println("Sum of arr1 is: " + sum);
    }
}

//Insertion in array
//class Insertion_In_Array{
//    public static void main(String[] args) {
//        int pos = 3;
//        int element = 4;
//        //int []  array = new int[10];
//        int[] array = {1,2,3,5,6,7,8,9,0};
////        java.util.Scanner sc = new java.util.Scanner(System.in);
////        System.out.println("Enter the element for array: ");
////        for(int i = 0; i < array.length; i++)
////            array[i] = sc.nextInt();
//        for(int i=array.length-1;i>pos;i--){
//            array[i] = array[i-1];
//        }
//        array[pos] = element;
//        for(int i=0;i< array.length;i++){
//        //for(int j : array){
//            System.out.println(array[i]);
//        }
//    }
//}
