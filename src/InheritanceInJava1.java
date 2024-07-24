//class Base{
//    int x;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        System.out.println("I am setting x");
//        this.x = x;
//    }
//
//    void printMe(){
//        System.out.println("I am Method");
//    }
//}
//class Derived extends Base{
//    int y;
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        System.out.println("I am setting y.");
//        this.y = y;
//    }
//}
//public class InheritanceInJava1 {
//    public static void main(String[] args) {
////        Base b = new Base();
////        b.setX(9);
////        System.out.println(b.getX());
//        Derived d = new Derived(); // I can access both class using Derived, it inherits all properties of class base.
//        d.setX(7); // I can access base class using Derived, it inherits all properties of class base.
//        d.setY(5);
//        System.out.println(d.getX());
//        System.out.println(d.getY());
//        Base bd = new Derived();
//        //System.out.println(bd.getX());
//    }
//}

//class Person  // super class
//{
//    private String name;
////    public Person(){
////        name=null;
////        System.out.println("Def constructor of super class invoked");
////    }
//    public Person(String name){
//        this.name=name;
//        //System.out.println("Para constructor of super class invoked");
//    }
//    void setName(String name){
//        this.name=name;
//    }
//    String getName(){
//        return(name);
//    }
//    void displayData(){
//        System.out.println("The name is :"+ name);
//    }
//}
//class Employee10 extends Person{  // sub-class
//    int p;
//    int rate;
//    int time;
////    public Employee(){
////
////        empid=0;
////        salary=0.0;
////        System.out.println("Def constructor of sub class invoked");
////    }
//    public Employee10(int p, int r, int t){
//        super("ajay");
//        this.p=p;
//        this.rate=r;
//        this.time = t;
//        //System.out.println("Para constructor of sub class invoked");
//    }
//    public void showData()
//    {
//        System.out.println("The principle is :"+ p);
//        System.out.println("The rate is: "+ rate);
//        System.out.println("The time is: "+ time);
//    }
//    double caluclateSi(){
//        return (p*rate*time)/100;
//    }
//}
//class TestInheritance{
//    public static void main(String ar[])
//    {
//        Employee10 obj=new Employee10(1000,30, 5);
//        obj.displayData();
//        obj.showData();
//        System.out.println("The Si is: " + obj.caluclateSi());
//        // System.out.println(obj.name);
//
//    }
//}

//class Student1{
//    int roll,marks,fee;
//    String name;
//    Student1(){} // default constructor
//    Student1(int roll,int marks,String name,int fee){ // parameterized
//        this.roll=roll;// initialization
//        this.marks=marks;
//        this.name=name;
//        this.fee=fee;
//    }
//    void setData(int r, int m ,String n,int fe){
//        roll=r;
//        marks=m;
//        name=n;
//        fee=fe;
//    }
//    void showData(){
//        System.out.println("The name is:"+ name);
//        System.out.println("Roll number is:"+ roll);
//        System.out.println("The marks are:"+ marks);
//        System.out.println("Fee paid is:"+ fee);
//
//    }
//    void setRoll(int roll){
//        this.roll=roll;
//    }
//    int getRoll(){
//        return(roll);
//    }
//}
//interface Hostel{
//    void allocateRoom();
//    void checkFee();
//}
//class Hosteller extends Student1 implements Hostel{
//    boolean h;
//    String room;
//    public void checkFee(){
//        if(fee>= 40000){
//            h=true;
//        }
//    }
//    public void allocateRoom(){
//        room="BH-1R-101";
//    }
//}
//class CheckInheritance{
//    public static void main(String[] args) {
//        Hosteller student1 = new Hosteller();
//        student1.setData(101, 85, "Ali", 45000);
//
//        Hosteller student2 = new Hosteller();
//        student2.setData(102, 75, "Bhargava", 35000);
//
//        student1.checkFee();
//        student1.allocateRoom();
//
//        student2.checkFee();
//        student2.allocateRoom();
//
//        System.out.println("Student 1 Details:");
//        student1.showData();
//        System.out.println("Hostel Accommodation: " + (student1.h ? "Yes" : "No"));
//        if(student1.h) {
//            System.out.println("Allocated Room: " + student1.room);
//        }
//
//        System.out.println("\nStudent 2 Details:");
//        student2.showData();
//        System.out.println("Hostel Accommodation: " + (student2.h ? "Yes" : "No"));
//        if(student2.h) {
//            System.out.println("Allocated Room: " + student2.room);
//        }
//    }
//}

class Greet1{
    public void print1(){
        System.out.println("Good");
    }
}
class Greet2 extends Greet1{
    public void print2(){
        super.print1();
        System.out.println("Morning");
    }
}
class CheckGreeting extends Greet2{
    public static void main(String[] args) {
        CheckGreeting obj = new CheckGreeting();
        obj.print2();
    }
}