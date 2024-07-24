import java.util.Scanner;
//class NegativeRadiusException extends Exception{
//    public String toString(){
//        return "Radius cannot be negative";
//    }
//}
//public class ThrowVsThrows {
//    public double area(double r) throws NegativeRadiusException{
//        if(r==0 || r<0){
//            throw new NegativeRadiusException();
//        }
//        else{
//            return Math.PI*r*r;
//        }
//    }
////    int a; int b;
////    int divide(int a, int b) throws ArithmeticException{
////        return a/b;
////    }
//    public static void main(String[] args) {
//        ThrowVsThrows th = new ThrowVsThrows();
//        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the number for a and b: ");
//        System.out.println("Enter the radius: ");
//        double r = sc.nextInt();
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        try {
////            System.out.println(th.divide(a, b));
////        }
////        catch(ArithmeticException e){
////            System.out.println("Exception "+ e);
////        }
//        try {
//            System.out.println("The radius is: " + th.area(r));
//        }
//        catch(NegativeRadiusException e){
//            System.out.println("Exception "+ e);
//        }
//    }
//}


//Calculator exercise problem:
//class InvalidInputException1 extends Exception{
//    public String toString(){
//        return "Number cannot be 7000,100000, two values(a&b), String type(like 3b).";
//    }
//}
//class Calculator{
//    public double calculate1(double a, double b, char operator) throws InvalidInputException1{
//        if(b==0 || a>=100000 || b>=100000) {
//            throw new InvalidInputException1();
//        }
//        else{
//            switch (operator) {
//                case '+':
//                    System.out.println("The addition of two number is: " + (a + b));
//                    break;
//                case '-':
//                    System.out.println("The subtraction of two number is: " + (a - b));
//                    break;
//                case '*':
//                    if(a<7000) {
//                        System.out.println("The multiplication of two number is: " + (a * b));
//                    }
//                    else{
//                        System.out.println("number cannot exceed 7000");
//                        throw new InvalidInputException1();
//                    }
//                    break;
//                case '/':
//                    System.out.println("The division of two number is: " + (a / b));
//            }
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Calculator cal = new Calculator();
//        System.out.println("Enter first number");
//        double a = sc.nextDouble();
//        System.out.println("Enter second number");
//        double b = sc.nextDouble();
//        System.out.println("Enter operator '+','-','*','/': ");
//        char operator = sc.next().charAt(0);
//        try {
//            System.out.println(cal.calculate1(a,b,operator));
//        }
//        catch (InvalidInputException1 e) {
//           // throw new RuntimeException(e);
//            System.out.println("Exception " + e);
//        }
//    }
//}

import java.util.*;
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

class TestingOfException1{
    public static void main(String[] args){
        int age,weight;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        age=sc.nextInt();
        System.out.println("Enter your Weight : ");
        weight=sc.nextInt();
        try{
            if(age>=18 ){
                    //|| weight >= 50){
                if(weight>=50){
                    //throw new Exception("Your weight is not more then criteria");
                    System.out.println("Your weight is okay");
                }else{
                    //System.out.println("Your weight is okay");
                    throw new Exception("Your weight is not more then criteria");
                }
                //throw new Exception("Your age is not more then criteria");
                //System.out.println("You can donate blood");
                System.out.println("You can donate blood");
            }

            else{
                //throw new MyException("you are not eligibe to donate");
                //System.out.println("You can donate blood");
                throw new Exception("Your age is not more then criteria");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}