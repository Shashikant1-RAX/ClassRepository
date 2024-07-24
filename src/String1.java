public class String1 {
    public static void main(String[] args) {
//       // String name = new String("Bittu");
//        //System.out.println(name);
//        String name = "Harry";
//        System.out.println(name);
//        int a = 5;
//        float b = 5.45987f;
//        System.out.printf("The value of a is %d and value of b is %f\n", a,b);
//        System.out.format("The value of a is %d and value of b is %f", a,b);
    }
}
class Sorting3485{
    public static void swapIn(String [] name, int i, int j){
        String temp = name[i];
        name[i] = name[j];
        name[j] = temp;
    }
    public static void sortIn(String [] name){
        for(int i=0; i<name.length;i++){
            for(int j=i+1; j<name.length;j++){
                if(name[i].compareTo(name[j])>0){
                    swapIn(name,i,j);
                }
            }
        }
    }
    public static void main(String[] args) {
        String [] name = {"banana", "apple", "date", "cherry"};
        sortIn(name);
        for(String element:name){
            System.out.println(element);
        }
    }
}
