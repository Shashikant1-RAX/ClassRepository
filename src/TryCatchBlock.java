import java.util.Scanner;
//public class TryCatchBlock {
//    public static void main(String[] args) {
//        int a = 50;
//        int b = 0;
//        String name = "Bittu";
////        int a1 = Integer.parseInt(name);
//        //Without Try Block:
////        int c =a/b;
////        System.out.println("The result of c is : " + c);
//        //With Try Block:
//        try{ //if not able to fetch exception, then it will execute try block statement and then rest of the code.
//            int c = a/b;
//            System.out.println("The result of c is : " + c);
//            int a1 = Integer.parseInt(name);
//            System.out.println(a1);
//        }
//        catch (ArithmeticException | NumberFormatException e){  //when try is able to fetch exception, it will execute catch block statement and then rest of the code.
//            System.out.println("we failed to calculate, Reason: ");
//            System.out.println(e);
//        }
//        System.out.println("Rest of the Code...");
//    }
//
//}
//
//Handling Specific Exceptions:
//class HandlingSpecificException {
//    public static void main(String[] args) {
//        int[] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array index");
//        int ind = sc.nextInt();
//
//        System.out.println("Enter the number you want to divide the value with");
//        int number = sc.nextInt();
//        try {
//            System.out.println("The value at array index entered is: " + marks[ind]);
//            System.out.println("The value of array-value/number is: " + marks[ind] / number);
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException occured!");
//            System.out.println(e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException occured!");
//            System.out.println(e);
//        } catch (Exception e) {
//            System.out.println("Some other exception occured!");
//            System.out.println(e);
//        }
//    }
//}

//
//class CodeTantraQuesOnTryCatch{
//    public static void main(String[] args) {
//        int numerator = 4;
//        int denominator = 2;
//        String a = "3b";
//        //Scanner sc = new Scanner(System.in);
//        try{
//            int division = numerator/denominator;
//            System.out.println(division);
//            int b = Integer.parseInt(a);
//            System.out.println(b);
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        catch(NumberFormatException n){
//            System.out.println(n);
//        }
//
//    }
//}

//CodeTantra try catch Question.
//class MultiCatchBlocks{
//    public int multiCatch(int[] arr, int index){
//        try{
//            System.out.println("The value at " + index + " is: " + arr[index]);
//            System.out.println("The division value is: " + arr[index]/index);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Division by zero is occurred.");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array index out of bounds.");
//        }
//        catch(Exception e){
//            System.out.println("Exception occurred");
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the size value: ");
//        int size = sc.nextInt();
//        int [] arr = new int[size];
//        System.out.println("Enter the value to put in array: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the value of index: ");
//        int index = sc.nextInt();
//        MultiCatchBlocks mb = new MultiCatchBlocks();
//        System.out.println(mb.multiCatch(arr, index));
//
//    }
//}

//CodeTantra CA question.
class BMIWithExceptionHandling{
    public double calculateBMI(double weight, double height){
        if(height<0 || weight < 0){
            throw new IllegalArgumentException("weight cannot be negative");
        }
        else{
            return weight/(height*height);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight");
        double weight = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();
        BMIWithExceptionHandling bmi = new BMIWithExceptionHandling();
        try{
            System.out.printf("%.2f", bmi.calculateBMI(weight, height));
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: Negative value found");
        }
    }
}