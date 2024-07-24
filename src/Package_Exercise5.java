class Rectangle1{
    int l;
    int b;

    public void setLb(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getRecArea(){
        return l*b;
    }
}
class Square1 extends Rectangle1{
    public int getSqaArea(){
        return l*l;
    }
}
class Circle1{
    int r;
    float PI=3.14f;
    void setR(int r){
        this.r = r;
    }
    float getCirArea(){
        return r*r*PI;
    }
}
class Sphere1 extends Circle1{
    float getSphArea(){
        return 4*PI*r*r;
    }
}
public class Package_Exercise5 {
    public static void main(String[] args) {
        Square1 sq = new Square1();
        Sphere1 sp = new Sphere1();
        sp.setR(7);
        System.out.println(sp.getSphArea());
        System.out.println(sp.getCirArea());
        sq.setLb(4,5);
        System.out.println(sq.getSqaArea());
        System.out.println(sq.getRecArea());
    }
}
