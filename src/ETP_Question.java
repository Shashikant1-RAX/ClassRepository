import java.util.Scanner;

public class ETP_Question {
    public void evenFind(int input){
        for(int i=2; i<=input; i+=2){
            System.out.print(i + " ");
        }
    }
    public void oddFind(int input){
        for(int i=1; i<=input; i+=2){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
//        if(input%2 == 0) {
//            for (int i = 0; i <= input; i += 2) {
//                System.out.println(i + " ");
//            }
//        }
//        else {
//            for (int i = 1; i <= input; i += 2) {
//                System.out.println(i + " ");
//            }
//        }
        ETP_Question etp = new ETP_Question();
        if(input%2 == 0) {
            etp.evenFind(input);
        }
        else{
            etp.oddFind(input);
        }
    }
}

