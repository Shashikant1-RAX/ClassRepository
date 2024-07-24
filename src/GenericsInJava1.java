import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

//class MyGeneric<T1, T2>{
//    int val;
//    T1 t1;
//    T2 t2;
//    MyGeneric(int val, T1 t1, T2 t2){
//        this.val=val;
//        this.t1=t1;
//        this.t2=t2;
//    }
//
//    public T2 getT2() {
//        return t2;
//    }
//
//    public void setT2(T2 t2) { this.t2 = t2; }
//
//    public void setVal(int val){
//        this.val=val;
//    }
//    public int getVal(){
//        return val;
//    }
//    public void setT1(T1 t1){
//        this.t1=t1;
//    }
//    public T1 getT1(){
//        return t1;
//    }
//}
//public class GenericsInJava1 {
//    public static void main(String[] args) {
////        ArrayList list = new ArrayList();
////        list.add(56);
////        list.add(48);
////        list.add("uaggh");
////        System.out.println(list);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Int value: ");
//        Integer t1 = sc.nextInt();
//        System.out.println("Enter the String value: ");
//        String t2 = sc.next();
//        MyGeneric<Integer, String> abc = new MyGeneric<>(2,t1,t2);
//        System.out.println(abc.getVal());
//        System.out.println(abc.getT1());
//        System.out.println(abc.getT2());
//    }
//}

//CodeTantra CA question.
//class CurrencyTransactionProcessor<T extends Number>{
//    T[] amounts;
//    public CurrencyTransactionProcessor(T[] amounts){
//        this.amounts = amounts;
//    }
//    public void processAmounts(){
//        boolean oddFound = false;
//        for(T amount : amounts){
//            if(amount.intValue() % 2 != 0){
//                System.out.println(amount);
//                oddFound = true;
//            }
//            //System.out.println( "No odd amount found");
//        }
//        if(!oddFound){
//            System.out.println("No odd amount found");
//        }
//    }
//
//    public static void main(String[] args) {
//        //Integer[] amounts = {11,22,33,44,66,88,99};
//        Scanner scanner = new Scanner(System.in);
//
//
//        //taking input from user
//        System.out.print("Enter the number of amounts: ");
//        int n = scanner.nextInt();
//        Integer[] amounts = new Integer[n];
//
//        System.out.println("Enter the amounts:");
//        for (int i = 0; i < n; i++) {
//            amounts[i] = scanner.nextInt();
//        }
//        CurrencyTransactionProcessor<Integer> processor = new CurrencyTransactionProcessor<>(amounts);
//        processor.processAmounts();
//    }
//}

//CodeTantra Questions.
//1
class ShipmentProcessor<T extends Number>{
    T[] weights;
    ShipmentProcessor(T[] weights){
        this.weights = weights;
    }
    public void processShipments(){
        boolean weightFound = false;
        for(T weight:weights) {
            if (weight.intValue() > 100) {
                System.out.println(weight);
                weightFound = true;
            }
        }
        if(!weightFound){
            System.out.println("No heavy weight found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        Integer [] weights = new Integer[n];
        System.out.println("Enter the value: ");
        for(int i=0;i<n;i++){
            weights[i] = sc.nextInt();
        }
        ShipmentProcessor<Integer> processor = new ShipmentProcessor<>(weights);
        processor.processShipments();
    }
}

//2
