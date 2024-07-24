class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<30) {
            System.out.println("This is thread1");
            i++;
        }
    }
}
public class Constructor_In_Thread1 {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Shashi");
        t1.start();
        System.out.println("Thread1 id is: "+t1.getId());
        System.out.println("Thread1 name is: "+t1.getName());
        MyThr t2 = new MyThr("Bittu");
        t2.start();
        System.out.println("Thread2 id is: "+t2.getId());
        System.out.println("Thread2 name is: "+t2.getName());
    }
}

//Thread Priority
//class MyThr1 extends Thread{
//    public MyThr1(String name){
//        super(name);
//    }
//    public void run(){
//        int i=0;
//        while(i<30) {
//            System.out.println("This is thread1: " + this.getName());
//            i++;
//        }
//    }
//}
//class ThreadPriority{
//    public static void main(String[] args) {
//        MyThr1 t1 = new MyThr1("Shashi1");
//        MyThr1 t2 = new MyThr1("Shashi2");
//        MyThr1 t3 = new MyThr1("Shashi3");
//        MyThr1 t4 = new MyThr1("Shashi4");
//        MyThr1 t5 = new MyThr1("Shashi5 (most Important)");
//        t5.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
//        t4.setPriority(Thread.MIN_PRIORITY);
//        t5.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//
//    }
//}


