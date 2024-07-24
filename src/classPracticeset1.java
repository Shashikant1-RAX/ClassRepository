//class Employee{
//    int Salary;
//    String Name;
//
//    public int giveSalary(){
//        return Salary;
//    }
//    public String giveName(){
//        return Name;
//    }
//    public void setName(String n){
//        Name = n;
//    }
//
//}
class cellPhone{
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void Ring(){
        System.out.println("Ringing...");
    }
    public void callingFriend(){
        System.out.println("Calling me!...");
    }
}
class Square{
    int side;
    public int Area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int l;
    int b;
    public int Area(){
        return l*b;
    }
    public int Perimeter(){
        return 2*(l+b);
    }
}

class Circle{
    int r;
    public int Area(){
        return (int)(3.14*r*r);
    }
    public float Cf(){
        return (int)(2*3.14*r);
    }
}
public class classPracticeset1 {
    public static void main(String[] args) {
        //problem1
//        Employee shashi = new Employee();
//        shashi.setName("Shashi");
//        System.out.println(shashi.giveName());
//        shashi.Salary = 12000;
//        System.out.println(shashi.giveSalary());

        //problem2:
        cellPhone iphone = new cellPhone();
        iphone.callingFriend();
        iphone.Ring();
        iphone.vibrate();

        //Problem3
//        Square sq = new Square();
//        sq.side = 6;
//        System.out.println(sq.Area());
//        System.out.println(sq.perimeter());

        //Problem4
//        Rectangle Rect = new Rectangle();
//        Rect.l = 4;
//        Rect.b = 8;
//        System.out.println(Rect.Area());
//        System.out.println(Rect.Perimeter());

        //Problem4
//        Circle cr = new Circle();
//        cr.r=4;
//        System.out.println(cr.Area());
//        System.out.println(cr.Cf());
    }
}
