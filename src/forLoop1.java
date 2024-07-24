import java.util.Scanner;
//public class forLoop1 {
//    public static void main(String[] args) {
//////        //int a=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value: ");
//        int n = sc.nextInt();
//        //for(int i=0;i<=n;i++){
//        for (int i = n; i > 0; i--) {
//            for(int j=0;j<i;j++){
//                System.out.print(i);
//            }
//            System.out.print("\n");
////            System.out.println(i);
//        }
//        for (int i = 1; i <= n; i+=2) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        int sum = 0;
//
//        for(int i=0;i<n;i++) {
//            //if(i%2==0) {
//            sum = sum + (2 * i);
//        }
//            System.out.print("sum of even number is: ");
//            System.out.print(sum);
//            //}
//        int a = 8;
//        int n= 10;
//        int sum = 0;
//        for(int i=1;i<=n;i++){
//            int mul = a*i;
//            sum = sum + mul;
//        }
//            System.out.println(sum);



//    }
//}

//Pyramid Shape
//class Pyramid1{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value: ");
//        int n = sc.nextInt();
//
//        for(int i = 1; i <= n; i++){
//            for(int j = n; j > i; j--){
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= (2*i)-1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//Rectangular Shape
class RecatngularShape{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
