class Phone{
    void showTime(){
        System.out.println("Time is 1 am");
    }
    void on(){
        System.out.println("Turning on phone...");
    }
}
class SmartPhone extends Phone{
    void music(){
        System.out.println("Playing Music...");
    }
    void on(){//Overriding from Phone class.
        System.out.println("Turning on Smartphone...");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone p = new Phone(); // allowed
        SmartPhone sp = new SmartPhone(); // allowed
        Phone smp = new SmartPhone();
//        p.showTime();
//        p.on();
//        sp.music();
//        sp.on();
        smp.showTime();// allowed. this is called Dynamic Method Dispatch.
        smp.on(); //allowed. this is called Dynamic Method Dispatch.
        //smp.music(); // not allowed. to run this you have to create smartphone reference.

    }
}
