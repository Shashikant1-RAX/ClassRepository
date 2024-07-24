class Employee{
    int id; //data member
    String Name;//data member
    int salary;//data member
    public void printDetails(){
        System.out.println("my name is: " + Name);
        System.out.println("my id is: " + id);
    }
    public int getSalary(){
       return salary;
    }
}
public class CreateOopsClass1 {
    public static void main(String[] args) {
        Employee shashi = new Employee();
        Employee bittu = new Employee();
        shashi.id=23;
        shashi.Name="Shashi";
        shashi.salary=23000;
        int Salary = shashi.getSalary();
//
        bittu.id=39;
        bittu.Name="Bittu";
        bittu.salary=52000;
        shashi.printDetails();
        System.out.println("My Salary is: " + Salary);
        System.out.println();
        int Salarys = bittu.getSalary();
        bittu.printDetails();
        System.out.println("My Salary is: " + Salarys);

//        System.out.println(shashi.Name);
//        System.out.println(shashi.id);

//Type Casting in Java:
//        byte b=127;
//        int a = 25;
        //a=b; //implicit conversion
        //b=(byte)a; //explicit casting
//        int k = 258;
//        byte h = (byte) k;
//        System.out.println(h);
//        byte a = 10;
//        byte b = 30;
//        int result = a*b; //type promotion
//        System.out.println(result);
    }
}
