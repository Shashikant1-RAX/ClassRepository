import java.util.Scanner;
public class MenuDrivenProjectTrainingAssignment {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int ch;

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. modulus");
            System.out.println("6. Exit \n");
            System.out.println("Enter the choice: ");
            ch = sc.nextInt();


            switch (ch) {
                case 1:
                    System.out.println("Result is: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result is: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result is: " + (a * b));
                    break;
                case 4:
                    if (b != 0)
                        System.out.println("Result is: " + (a / b));
                    else
                        System.out.println("denominator is 0 tends to infinite");
                    break;
                case 5:
                    if (b != 0)
                        System.out.println("Result is: " + (a % b));
                    else
                        System.out.println("Error... b is 0 cannot perform modulus");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while(ch != 6);
    }
}

//class InvalidInputException extends Exception{
//    public String toString(){
//        return "Number cannot be 7000 and cannot exceed 100000, two values(a&b), String type(like 3b).";
//    }
//}
//class MenuDrivenProjectTrainingAssignment1{
//    public double calculate(double a, double b) throws InvalidInputException{
//        if(b==0 || a>=100000 || b>=100000) {
//            throw new InvalidInputException();
//        }
//        else {
//            char operator;
//            do {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("--- Menu ---");
//                System.out.println("+. Add");
//                System.out.println("-. Subtract");
//                System.out.println("*. Multiply");
//                System.out.println("/. Division");
//                System.out.println("%. modulus");
//                System.out.println("$. Exit \n");
//
//                System.out.println("Enter the operators: ");
//                operator = sc.next().charAt(0);
//                switch (operator) {
//                    case '+':
//                        System.out.println("The addition of two number is: " + (a + b));
//                        break;
//                    case '-':
//                        System.out.println("The subtraction of two number is: " + (a - b));
//                        break;
//                    case '*':
//                        if (a < 7000) {
//                            System.out.println("The multiplication of two number is: " + (a * b));
//                        } else {
//                            System.out.println("number cannot exceed 7000");
//                            throw new InvalidInputException();
//                        }
//                        break;
//                    case '/':
//                        System.out.println("The division of two number is: " + (a / b));
//                        break;
//                    case '%':
//                        System.out.println("Result is: " + (a % b));
//                        break;
//                    case '$':
//                        System.out.println("Exiting...");
//                        break;
//                }
//            }while(operator != '$');
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        MenuDrivenProjectTrainingAssignment1 cal = new MenuDrivenProjectTrainingAssignment1();
//        System.out.println("Enter first number");
//        double a = sc.nextDouble();
//        System.out.println("Enter second number");
//        double b = sc.nextDouble();
//        try {
//            System.out.println(cal.calculate(a,b));
//        }
//        catch (InvalidInputException e) {
//           // throw new RuntimeException(e);
//            System.out.println("Exception " + e);
//        }
//    }
//}
