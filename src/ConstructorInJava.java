class myEmployee{
    private int id;
    private String Name;
    public myEmployee(String myname, int myid){
//        this.id = id;
//       this.Name = Name;
        id = myid;
        Name = myname;
    }
    public void setName(String n /*String Name*/){  //when Constructor is taking arguments don't need to set the name or id that is setName(),setId().
        //this.Name = name;
        Name = n;
    }
    public String getName(){
        return Name;
    }
    public void setId(int n /*int id*/){ // setter will update
        //this.id = id;
        id = n;
    }
    public int getId(){
        return id;
    }
}
public class ConstructorInJava {
    public static void main(String[] args) {
        myEmployee obj = new myEmployee("bittu", 19);
//        obj.id = 13;
//       obj.name = "Shashi";
//        obj.setId(13);
//        obj.setName("Shashi");
        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }
}

//class StudentData{
//    int roll,marks; // data member section
//    String name;
//    StudentData()    {  // default constructor
//        roll=100;
//        marks=0;
//        name=null;
//    }
//    StudentData(int r,int m,String n){  // para constructor
//        roll=r;
//        marks=m;
//        name=n;
//    }
//    int getRoll(){    // getter
//        //return(roll);
//
//    }
//    void setRoll(int r){ // setter
//        roll=r;
//    }
//    void displayData(){
//        System.out.println("The name is : "+ name);
//        System.out.println("The Roll number is : "+ roll);
//        System.out.println("The marks are : "+ marks);
//    }
//}
//
//class TestStudent{
//    public static void main(String ar[]){
//        StudentData kirti = new StudentData(1001,85,"kirti");
//        StudentData satvika = new StudentData(1002,75,"Satvika");
//        StudentData gaurav = new StudentData(1003,95,"Gaurav");
//        kirti.displayData();
//        satvika.displayData();
//        gaurav.displayData();
//        int x=kirti.getRoll();
//        System.out.println("Roll of kirti is:"+ x);
//        kirti.setRoll(1004);
//        System.out.println("Roll of kirti is:"+ kirti.getRoll());
//        System.out.println("Roll of kirti is:"+ kirti.roll);
//
//    }
//}
//
