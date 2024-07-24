import java.util.*;

public class calculatePercentage {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int total = 500;
        System.out.println("Taking input students marks");
        System.out.println("enter subject1 marks");
        int sub1 = Sc.nextInt();
        System.out.println("enter subject2 marks");
        int sub2 = Sc.nextInt();
        System.out.println("enter subject3 marks");
        int sub3 = Sc.nextInt();
        System.out.println("enter subject4 marks");
        int sub4 = Sc.nextInt();
        System.out.println("enter subject5 marks");
        int sub5 = Sc.nextInt();
        int number = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = ((double) number / total) * 100;

        System.out.println("Percentage: " + percentage + "%");
        //System.out.println(3&5);
    }
}
