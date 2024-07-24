import java.util.Arrays;
@FunctionalInterface
interface Demo{
    int add(int x, int y);
        }
//interface StringTransformer{
//    String transform(String str);
//}
public class Functional_Interface_In_Java {
    public static void main(String[] args) {
        Demo d = (x , y) -> (x+y);
            int result = d.add(9, 8);
            System.out.println(result);
    }
}
 //Arrays.stream(ArrList).filter(n -> n % 2 != 0).forEach(System.out::println);



//    public static void main(String[] args) {
//        int[] ArrList = {120,303,308,555};
//        //Arrays.stream(numbers).filter(n -> n % 2 != 0).forEach(System.out::println);
//        ArrList.forEach(n -> { if(n%2!=0).System.out.println(n)});
//    }
//}

