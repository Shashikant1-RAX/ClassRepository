import java.util.Scanner;
public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Type age value: ");
        int age = a.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy Your life!");
                break;
        }

//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float num = 45.7f;
//        boolean isInArray = false;
//        for (float element :marks) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//                if(true){
//                    System.out .println("The value is present in the array");
//                }
//                else {
//                    System.out.println("The value is not present in the array");
//                }
//        int b = 366;
//        if(days==b){
//            System.out.println("leap year");
//        }
//        else{
//            System.out.println("general year");
//        }
    }
}

