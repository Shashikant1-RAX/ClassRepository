import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_In_java {
    String name;
    int roll;
    Comparator_In_java(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public String toString(){
        return "name : " + name + ", roll : " + roll;
    }
}
//class CustomComparator implements Comparator<Comparator_In_java>{
//
//    @Override
//    public int compare(Comparator_In_java o1, Comparator_In_java o2) {
//        return o1.name.compareTo(o2.name);
//    }
//}

class TestComparator{
    public static void main(String[] args) {

        //Anonymous class of Comparator...
//        Comparator<Comparator_In_java> com = new Comparator<Comparator_In_java>() {
//            @Override
//            public int compare(Comparator_In_java o1, Comparator_In_java o2) {
//                return Integer.compare(o1.roll, o2.roll);
//            }
//        };

        //Lambda Expression of Comparator...
//        Comparator<Comparator_In_java> com = (o1,o2) -> {
//                //return Integer.compare(o1.roll, o2.roll);
//            return o1.name.compareTo(o2.name);
//        };

        Comparator_In_java c1 = new Comparator_In_java("Shashi", 12);
        Comparator_In_java c2 = new Comparator_In_java("Abhishek", 22);
        Comparator_In_java c3 = new Comparator_In_java("Anjali", 6);

        List a2 = new ArrayList();
        a2.add(c1);
        a2.add(c2);
        a2.add(c3);

        System.out.println("Before Sorting : ");
//        a2.forEach(System.out::println);
        a2.forEach(element -> System.out.println(element));
//        for(Object c : a2){
//            System.out.println(c);
//        }

        //Collections.sort(a2, new CustomComparator());
        //Collections.sort(a2, com);
        //Lambda Expression using sort() method...
        Collections.sort(a2, Comparator.comparing((Comparator_In_java o) -> o.name));
        //Collections.sort(a2, (Comparator_In_java e1, Comparator_In_java e2) -> Integer.compare(e1.roll, e2.roll));

        System.out.println("After sorting:");
        for(Object c: a2){
            System.out.println(c);
        }
    }
}