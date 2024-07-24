//Lambda Expression:
//@FunctionalInterface
//interface LambExp{
//    //void meth11();
//    int add(int a, int b);
//    //void meth2(int a);
//}
//public class Anonymous_Class_In_Java {
//    public static void main(String[] args) {
//        LambExp obj = (a,b) -> a+b;  //Here a+b is return type(return a+b).
//        {
//            int sum = obj.add(4, 6);
//            System.out.println(sum);
//            //System.out.println(obj.add(4,6)); // I can do in this way also
//        };
//
//    }
//        LambExp obj2 = (a) -> {
//            System.out.println("Hii... this is Shashi from lambda Expression. " + a);
//        };
//        obj2.meth2(21);
//
//Anonymous class.
//        LambExp obj1 = new LambExp() {
//            @Override
//            public int add(int a, int b) {
//                return a + b;
//            }
//        };
//        System.out.println("Through anonymous class:" + obj1.add(3, 4));
//        LambExp objj = new LambExp() {
//            @Override
//            public void meth2(int a) {
//                System.out.println("Shashi " + a);
//            }
//        };
//        objj.meth2(2);
//    }
//}

//Practice questions from CodeTantra
//Problem1

//@FunctionalInterface
//interface Calculator1{
//    int calculate(int a, int b);
//}
//class CalculatorMain{
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int x = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int y = sc.nextInt();
//        Calculator1 calc = (a,b) -> x+y;
//        {
//            System.out.println("The Calculation of two number is: " + calc.calculate(x,y));
//        }
//    }
//}

//Problem2
//@FunctionalInterface
//interface StringTransformer{
//    String transform(String str);
//}
//class TransformingString{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        String userInput = sc.nextLine();
//        StringTransformer string =(str) -> str.toUpperCase();{
//            System.out.println(string.transform(userInput));
//            //string.transform(userInput);
//        }
//    }
//}

//Problem3

//interface StringModifier{
//    void modify(String input);
//}
//class ModifyString{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        String userInput = sc.nextLine();
//        StringModifier obj = new StringModifier() {
//            @Override
//            public void modify(String input) {
////                System.out.println(new StringBuilder(userInput).reverse().toString());
//                StringBuilder stringRever = new StringBuilder(userInput);
//                stringRever.reverse();
//                System.out.println(stringRever.toString());
//            }
//        };
//        obj.modify(userInput);
//    }
//}

//Problem4
//interface ConcatenateWords{
//    String concatenate(String str1, String str2);
//}
//class ConcatenatingWords{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        String words1 = sc.next();
//        System.out.println("Enter the String: ");
//        String words2 = sc.next();
//        ConcatenateWords ctw = (str1, str2) -> str1 + " " + str2;{
//            System.out.println(ctw.concatenate(words1, words2));
//        }
//    }
//}

//5
interface MaxFinder{
    int maxFinder(int[] array);
}
class FindMaximum{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n
        int arr[] ={1,2,3,4,5};
        MaxFinder max = (int[] array) -> {
            int maxi = Integer.MIN_VALUE;
            for(int num:array){
                if(num>maxi){
                    maxi=num;
                }
            }
            return maxi;
        };
        System.out.println("Max value in array is: " + max.maxFinder(arr));
    }
}

