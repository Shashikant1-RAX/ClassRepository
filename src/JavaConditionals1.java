import java.util.Scanner;
public class JavaConditionals1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Number: ");
        int a = sc.nextInt();
        int age = 18;
        if(a>age){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cannot drive yet");
        }
    }
}
