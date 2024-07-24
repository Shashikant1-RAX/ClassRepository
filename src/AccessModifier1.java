package Shashi.com;
class Employe{
    private int id;
    private String Name;
    public void setName(String n){
        Name = n;
    }
    public String getName(){
        return Name;
    }
    public void setId(int n){
        id = n;
    }
    public int getId(){
        return id;
    }
}
class C1{
    public int x = 8;
    protected int y = 9;
    int z = 7;
    private int a = 3;
    void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AccessModifier1 {
    public static void main(String[] args){
//        Employe obj = new Employe();
//        obj.id = 13;          //] These will not run due to private access modifier;
//        obj.name = "Shashi"   //]    "         "          "          "          "
        // private modifier can be run by creating method
//        obj.setId(13);
//        obj.setName("Shashi");
//        System.out.println(obj.getName());
//        System.out.println(obj.getId());
        C1 ob = new C1();
        ob.meth1();
    }
}


