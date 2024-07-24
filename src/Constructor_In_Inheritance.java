//class Base1{
//    int x;
////    Base1() {
////        System.out.println("i am a base class constructor");
////    }
//    Base1(int x){
//        System.out.println("i am a base class constructor with value x: " + x);
//    }
//}
//class Derived1 extends Base1{
//    int y;
//    Derived1(int x, int y){
//        //super(8); // it will call only Base1(int a).
//        super(x);
//        //System.out.println("i am Derived class constructor");
//        System.out.println("i am Derived class constructor with value of y: " + y);
//    }
//}
//class ChildOfDerived extends Derived1{
//    int z;
//    ChildOfDerived(int x, int y, int z){
//        super(x,y);
//        System.out.println("i am ChildOfDerived class constructor with value of z: " + z);
//    }
//}

//que. create a class animal and derived another class dog from it.
class Animal{
    String sound;

    public void setSound(String sound) { this.sound = sound; }

    public String getSound() {
        return sound;
    }
    void meth1(){
        System.out.println("I am meth1 of Animal class");
    }
}


class Dog extends Animal{
    String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    void meth1(){ //Method Overriding.
        System.out.println("I am meth1 of Dog class");
    }
}
public class Constructor_In_Inheritance {
    public static void main(String[] args) {
        //ChildOfDerived d1 = new ChildOfDerived(4,5,6);
        Animal an = new Animal();
        Dog dg = new Dog();
        dg.setSound("bark");
        dg.setFood("flesh");
        System.out.println(dg.getSound());
        System.out.println(dg.getFood());
        an.meth1();//printing overriding
        dg.meth1();//printing overriding
    }
}
