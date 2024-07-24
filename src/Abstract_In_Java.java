////Abstract class is used to create more clas from it.
abstract class Base2 {  //abstract class
    public Base2(){
        System.out.println("I am constructor of class Base2");
    }
    abstract public void greet1();
    abstract public void greet2();
}
class Derived2 extends Base2 {
    public void greet1() {
        System.out.println("Hey! Good Morning");
    }

    public void greet2(){
        System.out.println("hii this is shashi");
    }
}
abstract class Child3 extends Base2{
    public Child3(){
        System.out.println("I am constructor of child3 class");
    }
}
public class Abstract_In_Java {
    public static void main(String[] args) {
        //Base2 bs = new Base2(); //it is not possible to create object of abstract class.
        Derived2 dr = new Derived2();
//        Child3 ch = new Child3(); // you cannot create object of abstract class like Child3.
//        ch.greet1();
        dr.greet1();
        dr.greet2();
    }
}

