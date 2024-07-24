interface Camera{
    void recordVideo();
    void clickPhoto();
    //private void greet(); // it will give error when we run because it is private, so we use private to short the code of default method.
    private void greet(){
        System.out.println("Good Morning");
    }
    //void record4kVideo(); //it will give error because it is not defined in class so we can use default method and define it.
    default void record4kVideo(){
        greet(); // we call here greet, this is the use of default method.
        System.out.println("Recording 4k Video");
    }
}
interface WiFi{
    String [] gettingToNetworks();
    void connectToNetwork();
}
class MyCellPhone{
    void pickCall(){
        System.out.println("Picking up the call...");
    }
    void torchOn(){
        System.out.println("Torch is on...");
    }
}
class MySmartPhone extends MyCellPhone implements WiFi, Camera{
    public void recordVideo(){
        System.out.println("Vide is recording");
    }
    public void clickPhoto(){
        System.out.println("Photo is clicking");
    }
    public String [] gettingToNetworks(){
        System.out.println("Fetching the Network");
        String [] networkLists = {"iphone", "Om's Hotspot", "realme GT neo 2"};
        return networkLists;
    }
//    public void record4kVideo(){
//        //greet(); // we call here greet, this is the use of default method.
//        System.out.println("Recording 4k Videos");
//    }

    @Override
    public void connectToNetwork() {
        System.out.println("Connecting to Network");
    }
}
public class Interface_Default_Method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        ms.clickPhoto();
        String ar[] = ms.gettingToNetworks();
        for(String item:ar) System.out.println(item);

//        for(int i=0;i<ar.length;i++){
//            String item = ar[i];
//            System.out.println(item);
//        }

    }
}
