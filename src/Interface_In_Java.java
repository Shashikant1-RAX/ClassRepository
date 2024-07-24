interface Bicycle{
    int a = 40; //Constants; , and this value will never change;
    void applyBrake(int increment);
    void speedUp(int decrement);
}
interface MotorCycle{
    void oilTank();
    void engineHealth();
}
class AvonCycle implements Bicycle, MotorCycle{ // you can implement more than one interface in class but you cannot extends more than one abstract class.
    @Override
    public void applyBrake(int decrement){
        System.out.println("Aplying Brake and decreasing speed by: " + decrement +"KM");
    }
    @Override
    public void speedUp(int increment){
        System.out.println("Accelerating the speed by: " + increment +"KM");
    }
    @Override
    public void oilTank(){
        System.out.println("Tank is full");
    }
    @Override
    public void engineHealth(){
        System.out.println("Engine Health is 98%");
    }
}
public class Interface_In_Java {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(10);
        ac.speedUp(20);
        ac.oilTank();
        ac.engineHealth();
        //ac.a = 90; // you cannot assign the value again in interface.
        //you can create properties only in interface.
        System.out.println(ac.a);
    }
}
