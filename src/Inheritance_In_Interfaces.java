//we are inherit the property of one interface into another interface.
//interface TestInterface{
//    void meth1();
//    void meth2();
//}
//interface AnotherTestInterface extends TestInterface{
//    void meth3();
//    void meth4();
//}
//class MyTestInterface implements AnotherTestInterface{
//    public void meth1(){
//        System.out.println("meth1");
//    }
//    public void meth2(){
//        System.out.println("meth2");
//    }
//    public void meth3(){
//        System.out.println("meth3");
//    }
//    public void meth4(){
//        System.out.println("meth4");
//    }
//}
//public class Inheritance_In_Interfaces {
//    public static void main(String[] args) {
//        MyTestInterface obj = new MyTestInterface();
//        obj.meth1();
//        obj.meth2();
//        obj.meth3();
//        obj.meth4();
//    }
//}

//CA JAVA practice set
interface MathOperation{
    int calculate(int inputNumber);
}
class SquareOperation implements MathOperation{
    public int calculate(int inputNumber){
        return inputNumber*inputNumber;
    }
}
class SumOperation implements MathOperation{
    public int calculate(int inputNumber){
        int sum = 0;
        for(int i = 1; i<=inputNumber; i++){ //code will print sum of numbers up to inputNumbers.
            sum+=i;
        }
        return sum;
    }
}
class PracticeCA{
    public static void main(String[] args) {
        SumOperation sumOp = new SumOperation();
        SquareOperation sqrOp = new SquareOperation();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the Number: ");
        int inputNumber = sc.nextInt();
        System.out.println("the sum of input number is: " + sumOp.calculate(inputNumber));
        System.out.println("the square of "+ inputNumber + " is: " + sqrOp.calculate(inputNumber));
    }
}

