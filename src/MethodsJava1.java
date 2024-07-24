public class MethodsJava1 {
//     static int logic(int x, int y) { //if you remove static then ypu need to create object to call the method
//        int z;
//        if (x > y) {
//            z = x + y;
//        }
//        else {
//            z = (x + y) * 5;
//        }
//        return z;
//    }
    //public static void main(String[] args) {
//        int a = 5;
//        int b = 9;
        //MethodsJava1 obj = new MethodsJava1();//we have created object to call the logic method after removing static
        //int c = obj.logic(a, b);
//        int c = logic(a,b);
//        System.out.println(c);
//        if(a>b){
//            System.out.println(a+b);
//        }
//        else{
//            c = (a+b)*5;
//            System.out.println(c);
//        }
//        int d = 7;
//        int e = 5;
      //int f = obj.logic(d, e);
//        int f = logic(d, e);
//        System.out.println(f);

//        if(d>e){
//            System.out.println(d+e);
//        }
//        else{
//            f = (d+e)*5;
//            System.out.println(f);
//        }

//Method Overloading:
//    static void foo() {
//        System.out.println("Good Morning bro!");
//    }
//    static void foo(int a){
//        System.out.println("good morning "+ a + " bro!");
//    }
//    static void foo(int a, int b){
//        System.out.println("good morning bro! "+ (a+b));
//    }
//public static void main(String[] args) {
//    foo();
//    foo(4);
//    foo(2,4);

//Variable Arguments
    static int sum(int ...arr){
        int result = 0;
        for(int element:arr){
            result += element;
        }
        return result;
    }
public static void main(String[] args) {
    System.out.println("The sum of 2,4,5,6 is: " + sum(2,4,5,6,8));

    }
}
