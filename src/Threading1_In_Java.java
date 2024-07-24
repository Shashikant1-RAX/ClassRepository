
//class MyThread1 extends Thread{
//    public void run(){
//        int i=0;
//        while(i<4000) {
//            System.out.println("This is Thread1");
//            System.out.println("I am happy");
//            i++;
//        }
//    }
//}
//class MyThread2 extends Thread{
//    public void run(){
//        int i=0;
//        while(i<4000) {
//            System.out.println("This is Thread2");
//            System.out.println("I am sad");
//            i++;
//        }
//    }
//}
//
//public class Threading1_In_Java {
//    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        t1.start();
//        t2.start();
//
//    }
//}

//PracticeSet

//class Practice extends Thread{
//        public void run () {
//            try {
//                Thread.sleep(200);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//            int i=0;
//            while(i<30) {
//                System.out.println("good morning");
//                i++;
//            }
//        }
//}
//class Practice1 extends Thread{
//    public void run () {
//        int i=0;
//        while(i<30) {
//            System.out.println("welcomeeeeeee");
//            i++;
//        }
 //   }
//}
//class PracticeSet{
//    public static void main(String[] args) {
//        Practice p1 = new Practice();
//        Practice1 p2 = new Practice1();
////        try {  //Same as above try and catch block. we can use at both palce.
////            p1.sleep(200);
////        }
////        catch(Exception e){
////            System.out.println(e);
////        }
//        p1.setPriority(6);
//        p2.setPriority(10);
//        System.out.println(p1.getState());
//        System.out.println(Thread.currentThread().getState());
//        p1.start();
//        p2.start();
//    }
//}

class ItIsMyThread extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hii...");
        }
    }
}
class ItIsMyThread1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello...");
        }
    }
}
class TestThread {
    public static void main(String[] args) {

        ItIsMyThread t11 = new ItIsMyThread();
        ItIsMyThread1 t22 = new ItIsMyThread1();
        t11.setPriority(5);
        System.out.println(t11.getState());
        t11.start();
        t22.start();
    }
}