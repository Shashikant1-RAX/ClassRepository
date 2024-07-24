class MyThreadRun1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<500){
            System.out.println("This is thread1 from Runnable");
            i++;
        }
    }
}
class MyThreadRun2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<500){
            System.out.println("This is thread2 from Runnable");
            i++;
        }
    }
}
public class Runnable_Thread_In_Java {
    public static void main(String[] args) {
        MyThreadRun1 th1 = new MyThreadRun1();
        Thread t11 = new Thread(th1);
        MyThreadRun2 th2 = new MyThreadRun2();
        Thread t22 = new Thread(th2);
        t11.start();
        t22.start();

    }
}
