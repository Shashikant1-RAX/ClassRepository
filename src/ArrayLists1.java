import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

//public class ArrayLists1 {
//    public static void main(String[] args) {
//        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<String> l2 = new ArrayList<>();
//
//        //add elements in ArrayList
//        l2.add("Baba");
//        l2.add("Abhi");
//        l2.add("Shashi");
//        l2.add("Ravi");
//        l2.add("chanda");
//        l1.add(0,1);
//        l1.add(1,2);
//        l1.add(2,3);
//        l1.add(3,4);
//        l1.add(1,9);
//        l1.add(9);
//        //l1.addAll(l2);
//
//        //Delete elements from ArrayList
//        l1.remove(2);
//
//        //updating elements in ArrayList
//        l1.set(0,5);  // it will update the element at index 0;
//
//        //printing the element index from ArrayList
//        System.out.println(l1.indexOf(89));
//        System.out.println(l1.lastIndexOf(9));
//
//        //checking that ArrayList contains the element or not or is empty.
//        System.out.println(l1.contains(5));
//        System.out.println(l1.isEmpty());
//
//        //printing the size of ArrayList.
//        System.out.println("The size of Array list l1 is: " + l1.size());
////        for(int element: l1){  //one way to print all the elements of arraylist.
////            System.out.println(element);
////        }
////        for(int i=0;i<l1.size();i++){
////            System.out.print(l1.get(i));
////            System.out.print(", ");
////        }
//
//        //printing the ArrayList
//        System.out.println(l1);
//
//        //sorting the elements in ArrayList
//        Collections.sort(l2);
//        System.out.println("After sorting the ArrayList: ");
//        System.out.println(l2);
//    }
//}

//class ArrayLists2{
//    public static void main(String[] args) {
//        List arr1 = new ArrayList();
//        arr1.add(23);
//        arr1.add(39);
//        arr1.add("Shashi");
//        arr1.add(true);
//        arr1.add(912229218);
//        arr1.add(3.14);
//        arr1.add('A');
//        //float x = (float) arr1.get(5);
//        boolean b = (boolean) arr1.get(3);
//        //System.out.println(x);
//        System.out.println(b);
//        System.out.println(arr1.size());
//        List arr2 = new ArrayList(arr1);
//        System.out.println(arr2.size());
//        System.out.println(arr2.set(1,"Buddha"));
//        System.out.println(arr2.get(1));
//        System.out.println(arr2);
//        List arr3 = new ArrayList(20);
//        System.out.println(arr3.size());
//        System.out.println(arr3);
//        System.out.println(arr1.removeFirst());
//        System.out.println(arr1);
//    }
//}

//CodeTantra Questions
//1
//class Letters3{
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hyderabad");
//        list.add("Bangalore");
//        list.add("Chennai");
////        for(int i=0;i<list.size();i++){
////            System.out.println(list.get(i).substring(0,3));
////        }
//        for(String salary:list){
//            System.out.println(salary.substring(0,3));
//        }
//    }
//}


//2.
//class ArrayListIterationDemo{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String salary[] = {"Shashi", "aman" , "Bittu", "aastha", "RaadheRaadhe"};
//        ArrayList<String> salarysList = new ArrayList<>();
//        for(String salarys:salary){
//            if(Character.isUpperCase(salarys.charAt(0))){
//                salarysList.add(salarys);
//            }
//        }
//        System.out.println(salarysList); // this type of calling calls the abstractCollections toString() Methods.
//    }
//}

//3.
//class ArrayListIterationsDemo{
//    public static void main(String[] args){
//        String salary[] = {"Hyderabad", "Bangalore", "Chennai", "TamilNadu"};
//        ArrayList<String> salarysList = new ArrayList<>();
//        for(String salarys: salary){
//            salarysList.add(salarys);
//        }
//
//        for(int i=0;i<salarysList.size();i++){
//            System.out.println(i + "." + salarysList.get(i));
//        }
//    }
//}

//4.
//class ArrayListIterationsDemos{
//    public static void main(String[] args) {
//        String salarys[] = {"Welcome", "to", "Hyderabad"};
//        ArrayList<String> salarysList = new ArrayList<>();
//        for(String salary:salarys){
//            salarysList.add(salary);
//        }
//
//        //for(int i=0;i<salarysList.size();i++){
//        System.out.println("salary at index 2 is: "+salarysList.get(2));
//        //}
//    }
//}

//5.
//class ArrayListDemo{
//    public static void main(String[] args) {
//        String river[] ={"Ganga", "Godavari", "Krishna", "Narmada", "Sindhu"};
//        ArrayList<String> salarysList = new ArrayList<>();
//        for(String salary: river){
//            salarysList.add(salary);
//        }
//        System.out.println(salarysList);
//        System.out.println(salarysList.size());
//    }
//}

// for union use addAll() method and for intersection use retainAll() methods.
//6.
//class ArrayListDemo{
//    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(9);
//        list1.add(8);
//        list1.add(7);
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(6);
//        list2.add(7);
//        list2.add(8);
//        list1.addAll(list2);
//        System.out.println(list1);
//
//        System.out.println("after retain: ");
//        list1.retainAll(list2);
//        System.out.println(list1);
//    }
//}

//7.
//class FrequencyFinder{
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("hii");
//        list.add("hello");
//        list.add("hey");
//        list.add("how");
//        list.add("hooo");
//        System.out.println(Collections.frequency(list, "hii")); // it will find frequency of "hii", it means how many times hii appears in list.
//    }
//}

//Sorting an ArrayList...
class ArrayListDemo22{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(8);
        list1.add(7);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(2);
        System.out.println( "Original List " + list1);

        //Sorting in ascending...
//        for(int i = 0; i < list1.size(); i++){
//            for(int j = i+1; j < list1.size(); j++){
//                if(list1.get(i) > list1.get(j)){
//                    int temp = list1.get(i);
//                    list1.set(i, list1.get(j));
//                    list1.set(j, temp);
//                }
//            }
//        }
        //Sorting in descending...
//        for(int i = 0; i < list1.size(); i++){
//            for(int j = i+1; j < list1.size(); j++){
//                if(list1.get(i) < list1.get(j)){
//                    int temp = list1.get(j);
//                    list1.set(j, list1.get(i));
//                    list1.set(i, temp);
//                }
//            }
//        }
        //System.out.println("Sorted list" + list1);
//        Collections.sort(list1);
//        System.out.println("Ascending order sorted list: " + list1);
//        Collections.sort(list1, Collections.reverseOrder()); //Collectons.reverseOrder() is comparator.
//        System.out.println("Descending order sorted list: " + list1);

    }
}

//import java.util.*;

// Main class declaration
//class StudentCom {
//    int age;
//    String name;
//
//    StudentCom(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
//
//// Comparator to sort by name
//class NameComparator implements Comparator<StudentCom> {
//    @Override
//    public int compare(StudentCom s1, StudentCom s2) {
//        return s1.name.compareTo(s2.name);
//    }
//}
//
//class StudentComparator1 {
//    public static void main(String[] args) {
//        StudentCom s1 = new StudentCom(56, "Ankit");
//        StudentCom s2 = new StudentCom(17, "Yogesh");
//        StudentCom s3 = new StudentCom(6, "Naman");
//
//        ArrayList<StudentCom> a1 = new ArrayList<>();
//        a1.add(s1);
//        a1.add(s2);
//        a1.add(s3);
//
//        System.out.println("Before sorting:");
//        a1.forEach(System.out::println);
//
//        Collections.sort(a1, new NameComparator());
//
//        System.out.println("After sorting:");
//        //a1.forEach(System.out::println); //short form of Long form.
//        a1.forEach(element -> System.out.println(element)); //Long form of short form.
//        for(StudentCom k : a1){
//            System.out.println(k);
//        }
//    }
//}

//using Comparator...
class EmployeeComparator {
    int id;
    int salary;

    EmployeeComparator(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", salary='" + salary + '\'';
    }
}
//
//class SalaryComparator implements Comparator<EmployeeComparator> { //Comparator we used for sorting based on custom demand.
//    @Override
//    public int compare(EmployeeComparator s1, EmployeeComparator s2) {
//        return Integer.compare(s1.salary, s2.salary);
//    }
//}
//
//
class EmployeeComparator1 {
    public static void main(String[] args) {
        EmployeeComparator E1 = new EmployeeComparator(56, 30000);
        EmployeeComparator E2 = new EmployeeComparator(17, 9000);
        EmployeeComparator E3 = new EmployeeComparator(6, 45000);

        ArrayList<EmployeeComparator> a1 = new ArrayList<>();
        a1.add(E1);
        a1.add(E2);
        a1.add(E3);

        System.out.println("Before sorting:");
        a1.forEach(System.out::println);

        //Lambda Expression...
        Collections.sort(a1, (e1, e2) -> Integer.compare(e1.salary, e2.salary));

//
//        Collections.sort(a1, new SalaryComparator());
//
        System.out.println("After sorting:");
//        a1.forEach(System.out::println); //short form of Long form.
////        a1.forEach(element -> System.out.println(element)); //Long form of short form.
        for(EmployeeComparator k : a1){
            System.out.println(k);
        }
    }
}

//Reversing an ArrayList...
//class ReverseArrayList{
//    public static void reverseArrayList(ArrayList<Integer> list1){
//        int i = 0, j = list1.size() - 1;
//        while(i<j){
//            Integer temp = list1.get(i);
//            list1.set(i, list1.get(j));
//            list1.set(j,temp);
//            i++;
//            j--;
//        }
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(9);
//        list1.add(8);
//        list1.add(7);
//        list1.add(6);
//        list1.add(7);
//        list1.add(8);
//        list1.add(2);
//        System.out.println( "Original List " + list1);
//        //reverseArrayList(list1);
//        Collections.reverse(list1);
//        System.out.println( "Sorted List " + list1);
//    }
//}

