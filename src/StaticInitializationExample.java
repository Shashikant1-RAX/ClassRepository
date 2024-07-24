import java.util.Scanner;
//public class StaticInitializationExample {
//    static int x;
//    static {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of x: ");
//        x = sc.nextInt();
//    }
//    public static void main(String[] args) {
//        System.out.println("Inside main method");;
//        System.out.println("value of x: "+ x);
//
//    }
//}//implement a static method named updateAverage 1.takes a parameter score of type double representing the score of the current quiz 2. it updates average score and num quizzes based on the quiz score
//class Quiz{
//    private static double avgScore = 10;
//    private static double numQuizzes = 2;
//    private static void setUpdateAverage(double score){
//        avgScore = score;
//    }
//    private static double getUpdatedAverage(){
//        return avgScore;
//    }
//    public static void main(String[] args) {
//        //Quiz q = new Quiz();
//        System.out.println("older average "+ avgScore);
//        Quiz.setUpdateAverage(20);
//        System.out.println(Quiz.getUpdatedAverage());
//
//    }
//}
class Student{
    int rollno;
    String name;
    static String clg = "abc";
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        clg="LPU";
    }
     void display(){
        System.out.println(rollno +" " + name);// +" " + clg);
    }
}
class Demo1{
    public static void main(String[] args) {
        Student s = new Student(44, "Shashi");

        Student.change();
        s.display();
    }
}
