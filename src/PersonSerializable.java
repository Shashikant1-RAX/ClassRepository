import java.io.*;

//public class PersonSerializable implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    private String name;
//    private int age;
//
//    public PersonSerializable(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{name='" + name + "', age=" + age + "}";
//    }
//}

class Student2334 implements Serializable{
     String name;
     int roll;

    public Student2334(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
class TestStudent{
    public static void main(String[] args) /*throws IOException, ClassNotFoundException*/ {
        try{
            Student2334 s = new Student2334("Shashi Kant", 38);
            //File file = new File("Shashi.txt");
            FileOutputStream file = new FileOutputStream("Shashi.txt"); //this is for new ObjectOutputStream(file);
            //now we will create ObjectOutputStream to write in to a file means we will serialize it.
            //ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(s);
            System.out.println("content has been saved in file.");
            out.close();

            //now we will create ObjectInputStream to read in to a file means we will Deserialize it.
            //ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            FileInputStream fileIn = new FileInputStream("Shashi.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //we will create a variable of Class Student2334 to save the content of file
            Student2334 stu = (Student2334)in.readObject(); //we are TypeCasting the content in Student2334.
            System.out.println("Name is: " + stu.name + " Roll no is: " + stu.roll);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
//        catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

    }
}

