class NestedClasses {
    int a;
   static class A {
        A() {
            System.out.println("It is a static nested class");
        }
    }
    class B{
        B(){
            System.out.println("It is a inner class");
        }
    }
    void display(){
        class MyLocal {
            private MyLocal() {
                System.out.println("It is a local nested class");
            }
        }
            MyLocal ok = new MyLocal();
    }
}

public class TestNestedClasses{
        public static void main(String ar[]){
            NestedClasses obj = new NestedClasses();
           // MyLocal ok = new MyLocal();
            NestedClasses.A objs = new NestedClasses.A();// static nested
            NestedClasses.B obji = obj.new B(); // inner class
            obj.display();

    }
}
//
//class Exercise
//class Demo2{
//    //int a;
//    //int b;
//    static class Division{
//        static int a;
//        static int b;
//        Division(int a, int b){
//            System.out.println("it is a nested class");
//            Division.a = a;
//            Division.b = b;
//        }
//        static int division1(){
//            return a/b;
//        }
//    }
//    class ArithmeticOperation{
//        int a;
//        int b;
//        ArithmeticOperation(int a, int b){
//            System.out.println("It is inner class");
//            this.a=a;
//            this.b=b;
//        }
//        int artOpr(){
//            //System.out.println(a+b);
//            System.out.println(a-b);
//            System.out.println(a+b);
//            return a*b;
//        }
//    }
//}
//class Main1{
//    public static void main(String[] args) {
//        Demo2 d = new Demo2();
//        Demo2.Division dv = new Demo2.Division(8, 4);
//        Demo2.ArithmeticOperation ar = d.new ArithmeticOperation(8, 4);
//        System.out.println(Demo2.Division.division1());
//        System.out.println(ar.artOpr());
//
//    }
//}

