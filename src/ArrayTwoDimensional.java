import java.sql.SQLOutput;
import java.util.*;
//public class ArrayTwoDimensional {
//    public static void main(String[] args) {
//////        int[][] flats = new int[2][4];
//////        flats[0][0]=101;
//////        flats[0][1]=102;
//////        flats[0][2]=103;
//////        flats[0][3]=104;
//////        flats[1][0]=201;
//////        flats[1][1]=202;
//////        flats[1][2]=203;
//////        flats[1][3]=204;
//////        for(int i=0;i<flats.length;i++) { //Length of array is 2 that is 0 and 1.
//////            for (int j = 0; j < flats[i].length; j++) { //flats[0] length is 4 and flats[1] length is 4.
//////                System.out.print(flats[i][j]);
//////                System.out.print(" ");
//////            }
//////            System.out.println("");
//////        }
////Adding two matrices with respect to I and J
//        int[][] flats = new int[2][4];
//        flats[0][0]=21;
//        flats[0][1]=22;
//        flats[0][2]=23;
//        flats[0][3]=24;
//        flats[1][0]=25;
//        flats[1][1]=26;
//        flats[1][2]=27;
//        flats[1][3]=28;
//        int[][] bittu = new int[2][4];
//        bittu[0][0]=10;
//        bittu[0][1]=11;
//        bittu[0][2]=12;
//        bittu[0][3]=13;
//        bittu[1][0]=14;
//        bittu[1][1]=15;
//        bittu[1][2]=23;
//        bittu[1][3]=24;
//        int [][] result = new int[2][4];
//        result[0][0]=0;
//        result[0][1]=0;
//        result[0][2]=0;
//        result[0][3]=0;
//        result[1][0]=0;
//        result[1][1]=0;
//        result[1][2]=0;
//        result[1][3]=0;
//        for(int i=0;i<flats.length;i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                result[i][j]=flats[i][j] + bittu[i][j];
//                System.out.print(result[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
//
//
//
//    }
//}
//class CheckArray{
//    public static void main(String[] args) {
//        int sum = 0;
        //int [][] arr1 = new int [2][3];
//        arr1[0][0]=101;
//        arr1[0][1]=102;
//        arr1[0][2]=103;
//        arr1[1][0]=104;
//        arr1[1][1]=201;
//        arr1[1][2]=202;
//        int arr1[][] = { {2, 3, 4},{5, 6, 7} };
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr1[i].length;j++){
//                sum +=arr1[i][j];
//            }
//        }
//        System.out.println("Sum is: " + sum);
//    }
//}

//class multOf2DMatrix{
//    public static void main(String[] args) {
//        int i,j,k;
//        int arr1[][] = new int [3][3];
//        int arr2[][] = new int [3][3];
//        int arr3[][] = new int [3][3];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first Array values: ");
//        for(i=0;i<3;i++){
//            for(j=0;j<3;j++){
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter the Second Array value: ");
//        for(i=0;i<3;i++){
//            for(j=0;j<3;j++){
//                arr2[i][j] =sc.nextInt();
//            }
//        }
//        System.out.println("Printing the value of first array:");
//        for(i=0;i<3;i++){
//            for(j=0;j<3;j++){
//                System.out.print(arr1[i][j] + " ");
//                //System.out.println(" ");
//            }
//            System.out.println();
//        }
//        System.out.println("Printing the value of second array:");
//        for(i=0;i<3;i++){
//            for(j=0;j<3;j++){
//                System.out.print(arr2[i][j] + " ");
//                //System.out.println(" ");
//            }
//            System.out.println();
//        }
//        //multiplying Matrix
//        for(i=0;i<3;i++){
//            for(j=0;j<3;j++){
//                for(k=0;k<3;k++){
//                    arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
//                }
//            }
//        }
//        System.out.println("multiplied Matrix is: ");
//        for(i=0;i<3;i++){
//            for(j=0;j<3;j++){
//                System.out.print(arr3[i][j] + " ");
//                //System.out.println(" ");
//            }
//            System.out.println();
//        }
//    }
//}
import java.util.Scanner;


//class TransposeMatrix{
//    public static int[][] findTranspose(int[][]arr,int r,int c){
//        int [][] ans = new int[c][r];
//        for(int i=0; i<c; i++){
//            for(int j=0; j<r; j++){
//                ans[i][j]=arr[j][i];
//            }
//        }
//        return ans;
//    }
//    public static void print2dArray(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rows: ");
//        int r = sc.nextInt();
//        System.out.println("Enter columns: ");
//        int c = sc.nextInt();
//        int [][] arr = new int[r][c];
//        System.out.println("Enter elements: ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        int [][] ans = findTranspose(arr,r,c);
//        System.out.println("Transposed Matrix: ");
//        print2dArray(ans);
//    }
//}

//Given a Square matrix, turn it by 90 degrees in clockwise direction without using any extra space.
//class RotateMatrix{
//    public static void reverse(int [] arr){
//        int i=0; int j= arr.length-1;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//    }
//    public static void findTranspose1(int[][]arr, int r, int c) {
//        for (int i = 0; i < c; i++) {
//            for (int j = i; j < r; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        for(int i=0;i<c;i++){
//            reverse(arr[i]);
//        }
//    }
//
//    public static void print2dArray(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rows: ");
//        int r = sc.nextInt();
//        System.out.println("Enter columns: ");
//        int c = sc.nextInt();
//        int [][] arr = new int[r][c];
//        System.out.println("Enter elements: ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        findTranspose1(arr,r,c);
//        System.out.println("Transposed Matrix: ");
//        print2dArray(arr);
//    }
//}


//Pascal Triangle...
//class PascalTriangle{
//    public static void print2dArray(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static int[][] pascal(int n){
//        int [][] ans = new int[n][];
//        for(int i = 0; i < n; i++){
//            ans[i] = new int[i+1]; //ith row has i+1 columns.
//            ans[i][0] = ans[i][i] = 1; //1st and last element of every row is 1.
//            for(int j = 1; j < i; j++){
//                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n: " );
//        int n = sc.nextInt();
//        int [][] ans = pascal(n);
//        print2dArray(ans);
//    }
//}

//Creating SpiralMatrix from given matrix...
//class SpiralMatrix {
//    public static void print2dArray(int [][] matrix){
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[i].length; j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void spiralMatrix(int [][] matrix, int r, int c){
//        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
//        int totalElements=0;
//        while(totalElements < r * c) {
//            //topRow -> leftCol to rightCol
//            for (int j = leftCol; j <= rightCol; j++) {
//                System.out.print(matrix[topRow][j] + " ");
//                totalElements++;
//            }
//            topRow++;
//            //rightCol -> topRow to bottomRow
//            for (int i = topRow; i <= bottomRow; i++) {
//                System.out.print(matrix[i][rightCol] + " ");
//                totalElements++;
//            }
//            rightCol--;
//            //bottomRow -> rightCol to leftCol
//            for (int j = rightCol; j >= leftCol; j--) {
//                System.out.print(matrix[bottomRow][j] + " ");
//                totalElements++;
//            }
//            bottomRow--;
//            //leftCol -> bottomRow to topRow
//            for (int i = bottomRow; i >= topRow; i--) {
//                System.out.print(matrix[i][leftCol] + " ");
//                totalElements++;
//            }
//            leftCol++;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rows: ");
//        int r = sc.nextInt();
//        System.out.println("Enter columns: ");
//        int c = sc.nextInt();
//        int [][] matrix = new int[r][c];
//        System.out.println("Enter elements: ");
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        print2dArray(matrix);
//        spiralMatrix(matrix,r,c);
//
//    }
//}

//Generating a spiral matrix from a number.
//class GenerateSpiralMatrix{
//    public static void print2dArray(int[][] array){
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static int [][] generatingSpiralMatrix(int n){
//        int [][] matrix = new int[n][n];
//        int topRow = 0, leftCol = 0, bottomRow = n-1, rightCol = n-1;
//        int curr=1;
//        while(curr <= n*n) {
//            //topRow -> leftCol to rightCol.
//            for (int j = leftCol; j <= rightCol; j++) {
//                matrix[topRow][j] = curr;
//                curr++;
//            }
//            topRow++;
//            //rightCol -> topRow to bottomRow.
//            for (int i = topRow; i <= bottomRow; i++) {
//                matrix[i][rightCol] = curr;
//                curr++;
//            }
//            rightCol--;
//            //bottomRow -> rightCol to leftCol.
//            for (int j = rightCol; j >= leftCol; j--) {
//                matrix[bottomRow][j] = curr;
//                curr++;
//            }
//            bottomRow--;
//            //leftCol -> bottomRow to topRow.
//            for (int i = bottomRow; i >= topRow; i--) {
//                matrix[i][leftCol] = curr;
//                curr++;
//            }
//            leftCol++;
//        }
//        return matrix;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        int [][] matrix = generatingSpiralMatrix(n);
//        print2dArray(matrix);
//    }
//}

//Sum between two boundaries{(1,0) -> (4,4)} in 2d array.
class RectangleSum{
    public static void findPrefixSum(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        //Traversing matrix horizontally
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        //Traversing matrix vertically
        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    public static int rectangleSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static int rectangleSum1(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans = 0;
        int sum = 0, left = 0, up = 0, leftUp = 0;
        findPrefixSum(matrix);

        sum = matrix[l2][r2];
        if(r1 >= 1)
            left = matrix[l2][r1-1];
        if(l1 >= 1)
            up = matrix[l1-1][r2];
        if(l1 >= 1 && r1 >= 1)
            leftUp = matrix[l1-1][r1-1];
        ans = sum - up - left + leftUp;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r = sc.nextInt();
        System.out.println("Enter columns: ");
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        System.out.println("Enter elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter l1,r1,l2,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Sum1 is: " + rectangleSum(matrix,l1,r1,l2,r2));
        System.out.println("Sum2 is: " + rectangleSum1(matrix, l1, r1, l2, r2));
    }
}