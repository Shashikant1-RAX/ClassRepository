//Polymorphism in interface allow us to use one interface at a time.
interface Gps{
    void location();
}
interface Music{
    //void storeMusic();
    default void playMusic(){
        System.out.println("Playing a Music");
    }
}
class CellPhone2{
    void meth1(){
        System.out.println("Meth1");
    }
    void Meth2(){
        System.out.println("meth2");
    }
}
class SmartPhone2 extends CellPhone2 implements Gps, Music{
    public void location(){
        System.out.println("Turning on location");
    }
    //public
}
public class Polymorphism_In_interfaces {
    public static void main(String[] args) {
        Gps g = new SmartPhone2();
        //SmartPhone2 g = new SmartPhone2();
        Music m = new SmartPhone2();
        m.playMusic(); // --> allow only Music interface methods.
        //m.location(); // -->not allowed, you cannot use gps methods in music.
        g.location();
    }
}
